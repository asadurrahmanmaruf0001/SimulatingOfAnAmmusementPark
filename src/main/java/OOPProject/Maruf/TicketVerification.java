package OOPProject.Maruf;

public class TicketVerification {
    private String ticketCode;

    public TicketVerification(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    @Override
    public String toString() {
        return "TicketVerification{" +
                "ticketCode='" + ticketCode + '\'' +
                '}';
    }
}
