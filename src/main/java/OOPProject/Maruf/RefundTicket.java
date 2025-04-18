package OOPProject.Maruf;

public class RefundTicket {
    private String ticketNumber;
    private boolean iseligible;

    public RefundTicket(String ticketNumber, boolean iseligible) {
        this.ticketNumber = ticketNumber;
        this.iseligible = iseligible;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public boolean isIseligible() {
        return iseligible;
    }

    public void setIseligible(boolean iseligible) {
        this.iseligible = iseligible;
    }

    @Override
    public String toString() {
        return "RefundTicket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", iseligible=" + iseligible +
                '}';
    }
}
