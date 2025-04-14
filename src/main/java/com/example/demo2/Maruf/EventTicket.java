package com.example.demo2.Maruf;

public class EventTicket {
    private String eventTicketId;
    private String EventName;
    private String UserId;
    private float Price;
    private String Status;
    public EventTicket(String id,String name,String user,float p, String s){
        eventTicketId = id;
        EventName= name;
        UserId= user;
        Price= p;
        Status = s;

    }

    public EventTicket(String eventTicketId, String status, float price, String userId, String eventName) {
        this.eventTicketId = eventTicketId;
        Status = status;
        Price = price;
        UserId = userId;
        EventName = eventName;
    }

    public String getEventTicketId() {
        return eventTicketId;
    }

    public void setEventTicketId(String eventTicketId) {
        this.eventTicketId = eventTicketId;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "EventTicket{" +
                "eventTicketId='" + eventTicketId + '\'' +
                ", EventName='" + EventName + '\'' +
                ", UserId='" + UserId + '\'' +
                ", Price=" + Price +
                ", Status='" + Status + '\'' +
                '}';
    }
}
