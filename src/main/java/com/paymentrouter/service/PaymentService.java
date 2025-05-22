package com.paymentrouter.service;

import com.paymentrouter.model.PaymentRequest;
import com.paymentrouter.repostiory.DynamoDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private CurrencyConverter currencyConverter;
    @Autowired
    private DynamoDBRepository dynamoDBRepository;

    public String processPayment(PaymentRequest request) {
        if (request.getAmount() <= 0 || request.getSenderId() == null || request.getReceiverId() == null) {
            throw new IllegalArgumentException("Invalid payment details");
        }
        double amountInUSD = currencyConverter.convertToUSD(request.getAmount(), request.getCurrency());
        dynamoDBRepository.savePayment(request.getSenderId(), request.getReceiverId(), amountInUSD);
        return "Payment processed: " + amountInUSD + " USD";
    }
}