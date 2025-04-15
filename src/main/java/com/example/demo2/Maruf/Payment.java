package com.example.demo2.Maruf;

import java.time.LocalDate;

public class Payment {
    private String paymentId;
    private double amount;
    private String method;
    private String Status;
    private LocalDate paymentDate;

    public Payment(String paymentId, double amount, String method, String status, LocalDate paymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
        Status = status;
        this.paymentDate = paymentDate;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", amount=" + amount +
                ", method='" + method + '\'' +
                ", Status='" + Status + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
