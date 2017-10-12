package com.siebre.itx.test.schemavalidation;

import com.siebre.itx.schema.validation.JsonSchemaParseException;
import com.siebre.itx.schema.validation.JsonSchemaValidation;
import com.siebre.itx.schema.validation.SchemaValidation;
import com.siebre.itx.schema.validation.SchemaValidationResult;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by jhonelee on 2017/8/25.
 */
public class JsonSchemaValidationTest {

    private Logger logger = LoggerFactory.getLogger(JsonSchemaValidationTest.class);

    @Test
    public void jsonSchemaTest() {
        SchemaValidation schemaValidation = this.generateSchemaValidation();
        String jsonMessage = this.getJsonMessageFromFile();

        SchemaValidationResult schemaValidationResult = schemaValidation.validate(jsonMessage);
        Assert.assertTrue(schemaValidationResult.isSuccessed());

        this.logger.info("Test successed!");
    }

    private SchemaValidation generateSchemaValidation() {
        String jsonSchemaString = this.createJsonSchamaString();
        JsonSchemaValidation jsonSchemaValidation = new JsonSchemaValidation(jsonSchemaString);
        return jsonSchemaValidation;
    }

    private String createJsonSchamaString() {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("JsonSchema-test.json");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();

        String line = null;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (IOException e) {
            throw new JsonSchemaParseException(e);
        }

        return stringBuilder.toString();
    }

    private String getJsonMessageFromFile() {
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("JsonMessage-test.json");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();

        String line = null;

        try {
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

}
