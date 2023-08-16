package org.acme.profile;

import java.util.Map;

import jakarta.inject.Inject;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;
import software.amazon.awssdk.services.dynamodb.model.GetItemRequest;

public class ClientProductSyncService extends ClientProductAbstractService
{
	@Inject
    DynamoDbClient dynamoDB;
	
	public ClientProductDTO getClientProduct(String primaryKey) 
    {
		GetItemRequest getItem = getClientProductRow(primaryKey);
		Map<String, AttributeValue> item = dynamoDB.getItem( getItem ).item();
		
		return ClientProductDTO.from(item);
    }

}
