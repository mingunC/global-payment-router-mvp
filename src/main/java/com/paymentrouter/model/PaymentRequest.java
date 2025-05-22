package com.paymentrouter.model;

public class PaymentRequest {
    private String senderId;
    private String receiverId;
    private double amount;
    private String currency;

    // Getters and Setters
    public String getSenderId() {
        return senderId; }
    public void setSenderId(String senderId) {
        this.senderId = senderId; }
    public String getReceiverId() {
        return receiverId; }
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId; }
    public double getAmount() {
        return amount; }
    public void setAmount(double amount) {
        this.amount = amount; }
    public String getCurrency() {
        return currency; }
    public void setCurrency(String currency) {
        this.currency = currency; }
}