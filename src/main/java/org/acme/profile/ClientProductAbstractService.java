package org.acme.profile;

import java.util.HashMap;
import java.util.Map;

import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;

public class ClientProductAbstractService 
{
    public final static String CLIENT_PRODUCT_TABLE_NAME = "clients_products";
    
    protected GetItemRequest getClientProductRow(String primaryKey) 
    {
        Map<String, AttributeValue> key = new HashMap<>();
        key.put("PK", AttributeValue.builder().s(primaryKey).build());

        return GetItemRequest.builder()
                .tableName(CLIENT_PRODUCT_TABLE_NAME)
                .key(key)
                //.attributesToGet(FRUIT_NAME_COL, FRUIT_DESC_COL)
                .build();
    }
}
