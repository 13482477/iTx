package com.siebre.itx.schema.validation;

import com.siebre.itx.request.ItxRequest;

/**
 * Created by jhonelee on 2017/8/25.
 */
public interface SchemaValidation {

    public SchemaValidationResult validate(ItxRequest itxRequest);

}
