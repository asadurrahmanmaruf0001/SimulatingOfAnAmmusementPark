package OOPProject.Maruf;

public class ReportOfSales {
    private String date;
    private int ticketSold;

    public ReportOfSales(String date, int ticketSold) {
        this.date = date;
        this.ticketSold = ticketSold;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTicketSold() {
        return ticketSold;
    }

    public void setTicketSold(int ticketSold) {
        this.ticketSold = ticketSold;
    }

    @Override
    public String toString() {
        return "ReportOfSales{" +
                "date='" + date + '\'' +
                ", ticketSold=" + ticketSold +
                '}';
    }
}
