package com.paymentrouter.repostiory;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DynamoDBRepository {
    @Autowired
    private AmazonDynamoDB amazonDynamoDB;

    public void savePayment(String senderId, String receiverId, double amount) {
        Map<String, AttributeValue> item = new HashMap<>();
        item.put("senderId", new AttributeValue().withS(senderId));
        item.put("receiverId", new AttributeValue().withS(receiverId));
        item.put("amount", new AttributeValue().withN(String.valueOf(amount)));
        PutItemRequest request = new PutItemRequest().withTableName("Payments").withItem(item);
        amazonDynamoDB.putItem(request);
    }
}