package com.siebre.itx.schema.generation;

import com.siebre.itx.module.ModuleNode;
import com.siebre.itx.module.NodeType;

/**
 * Created by jhonelee on 2017/9/6.
 */
public class JsonSchemaGeneration implements SchemaGeneration {

    @Override
    public String createSchema(ModuleNode moduleNode) {
        String result = "";

        String[] strArray = {
                "{\n",
                "   \"$schema\" : \"http://json-schema.org/draft-06/schema#\",\n",
                "   \"title\" : \"" + moduleNode.getNodeName() + "\",\n",
                "   \"description\" : \"" + moduleNode.getNodeName() + "\",\n",

                "}",
        };

        return null;
    }

    private String getTypeStr(NodeType type) {
        if (NodeType.ARRAY.equals(type)) {
            return "array";
        }
        else if (NodeType.OBJECT.equals(type)) {
            return "object";
        }
        else if (NodeType.INTEGER.equals(type)) {
            return "integer";
        }
        else if (NodeType.STRING.equals(type)) {
            return "string";
        }
        return null;
    }
}
