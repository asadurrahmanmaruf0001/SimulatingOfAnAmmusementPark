package OOPProject.Maruf;

public class Tickets {
    private String ticketNumber;
    private String visitorName;
    private String date;

    public Tickets(String ticketNumber, String visitorName, String date) {
        this.ticketNumber = ticketNumber;
        this.visitorName = visitorName;
        this.date = date;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
