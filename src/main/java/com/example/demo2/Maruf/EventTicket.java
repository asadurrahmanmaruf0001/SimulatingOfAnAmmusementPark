package com.example.demo2.Maruf;

public class EventTicket {
    private String eventTicketId;
    private String EventName;
    private String userId;
    private float Price;
    private String Status;
    public EventTicket(String id,String name,String user,float p, String s){
        eventTicketId = id;
        EventName= name;
        userId= user;
        Price= p;
        Status = s;

    }

}
