package com.siebre.itx.processer;

import com.siebre.itx.request.ItxRequest;
import com.siebre.itx.response.ItxResponse;
import com.siebre.itx.schema.validation.SchemaValidation;
import com.siebre.itx.schema.validation.SchemaValidationResult;

/**
 * Created by jhonelee on 2017/8/25.
 */
public class SimpleItxTransactionProcesser implements ItxTransactionProcesser {

    private SchemaValidation schemaValidation;


    @Override
    public ItxResponse doTransaction(ItxRequest request) {
        SchemaValidationResult schemaValidationResult = this.schemaValidation.validate(request);

        return null;
    }
}
