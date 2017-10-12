package com.siebre.itx.schema.validation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.ValidationMessage;
import com.siebre.itx.request.ItxRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Set;

/**
 * Created by jhonelee on 2017/8/25.
 */
public class JsonSchemaValidation implements SchemaValidation {

	private static Logger LOGGER = LoggerFactory.getLogger(JsonSchemaValidation.class);

	private String jsonSchemaStr;

	public JsonSchemaValidation(String jsonSchemaStr) {
		this.jsonSchemaStr = jsonSchemaStr;
	}

	@Override
	public SchemaValidationResult validate(ItxRequest itxRequest) {
		String messageStr = (String) itxRequest.getMessage();

		JsonSchema jsonSchema = this.createJsonSchema();

		JsonNode jsonNode = this.obtainJsonNode(messageStr);

		Set<ValidationMessage> validationMessages = jsonSchema.validate(jsonNode);

		return this.resolveResult(validationMessages);
	}

	private SchemaValidationResult resolveResult(Object returnMessage) {
		SchemaValidationResult schemaValidationResult = new SchemaValidationResult();

		Set<ValidationMessage> validationMessages = (Set<ValidationMessage>) returnMessage;

		if (validationMessages.size() == 0) {
			schemaValidationResult.setSuccessed(true);
		}
		else {
			schemaValidationResult.setSuccessed(false);
			for (ValidationMessage validationMessage : validationMessages) {
				LOGGER.error("code={},type={},path={},message={}", new String[]{validationMessage.getCode(), validationMessage.getType(), validationMessage.getPath(),validationMessage.getMessage()});
				schemaValidationResult.getMessages().add(validationMessage.getMessage());
			}
		}

		return schemaValidationResult;
	}

	private JsonSchema createJsonSchema() {
		JsonSchemaFactory jsonSchemaFactory = new JsonSchemaFactory();
		JsonSchema jsonSchema = jsonSchemaFactory.getSchema(this.jsonSchemaStr);

		return jsonSchema;
	}

	private JsonNode obtainJsonNode(String messageStr) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = null;
		try {
			jsonNode = objectMapper.readTree(messageStr);
		} catch (IOException e) {
			throw new JsonSchemaParseException(e);
		}
		return jsonNode;
	}

}
