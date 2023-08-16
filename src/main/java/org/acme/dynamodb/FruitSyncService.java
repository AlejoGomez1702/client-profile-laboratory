package org.acme.dynamodb;

import java.util.List;
import java.util.stream.Collectors;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import software.amazon.awssdk.services.dynamodb.DynamoDbClient;

@ApplicationScoped
public class FruitSyncService extends AbstractService 
{
	@Inject
    DynamoDbClient dynamoDB;
	
	public List<Fruit> findAll() 
	{
        return dynamoDB.scanPaginator(scanRequest()).items().stream()
                .map(Fruit::from)
                .collect(Collectors.toList());
    }

    public void add(Fruit fruit) 
    {
        dynamoDB.putItem(putRequest(fruit));
    }

    public Fruit get(String name) 
    {
        return Fruit.from(dynamoDB.getItem(getRequest(name)).item());
    }

}
