package com.siebre.itx.schema.validation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jhonelee on 2017/8/25.
 */
public class SchemaValidationResult {

    private boolean successed;

    private List<String> messages = new ArrayList<String>();

    public boolean isSuccessed() {
        return successed;
    }

    public void setSuccessed(boolean successed) {
        this.successed = successed;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
