package com.example.demo2.Maruf;

public class EventTicket {
    private String eventTicketId;
    private String eventName;
    private String userId;
    private float price;
    private String status;

    public EventTicket(String eventTicketId, String eventName, float price, String userId, String status) {
        this.eventTicketId = eventTicketId;
        this.eventName = eventName;
        this.price = price;
        this.userId = userId;
        this.status = status;
    }

    public String getEventTicketId() {
        return eventTicketId;
    }

    public void setEventTicketId(String eventTicketId) {
        this.eventTicketId = eventTicketId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EventTicket{" +
                "eventTicketId='" + eventTicketId + '\'' +
                ", eventName='" + eventName + '\'' +
                ", userId='" + userId + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
