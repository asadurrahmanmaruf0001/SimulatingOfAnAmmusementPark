package com.example.demo2.Maruf;

import java.time.LocalDate;

public class Ticket {
    private String ticketId;
    private String type;
    private double price;
    private LocalDate visitDate;

    public Ticket(String ticketId, String type, double price, LocalDate visitDate) {
        this.ticketId = ticketId;
        this.type = type;
        this.price = price;
        this.visitDate = visitDate;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", visitDate=" + visitDate +
                '}';
    }
}
