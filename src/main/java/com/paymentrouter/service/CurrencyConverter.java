package com.paymentrouter.service;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConverter {
    private static final double CAD_TO_USD = 0.72;

    public double convertToUSD(double amount, String currency) {
        if ("EUR".equalsIgnoreCase(currency)) {
            return amount / CAD_TO_USD;
        }
        return amount; // Assume USD if no conversion needed
    }
}