package OOPProject.Maruf;

public class OnlineTicket {
    private String name;
    private String ticketType;
    private String visitDate;
    private boolean paymentCondirmed;

    public OnlineTicket(String name, String ticketType, String visitDate, boolean paymentCondirmed) {
        this.name = name;
        this.ticketType = ticketType;
        this.visitDate = visitDate;
        this.paymentCondirmed = paymentCondirmed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public boolean isPaymentCondirmed() {
        return paymentCondirmed;
    }

    public void setPaymentCondirmed(boolean paymentCondirmed) {
        this.paymentCondirmed = paymentCondirmed;
    }
}
