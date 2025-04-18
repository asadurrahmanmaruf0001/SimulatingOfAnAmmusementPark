package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class RevenueReportEvent {
    private double totalTicketSales;
    private double totalConcessions;

    public RevenueReportEvent(double totalTicketSales, double totalConcessions) {
        this.totalTicketSales = totalTicketSales;
        this.totalConcessions = totalConcessions;
    }

    public double getTotalTicketSales() {
        return totalTicketSales;
    }

    public double getTotalConcessions() {
        return totalConcessions;
    }

    @Override
    public String toString() {
        return "RevenueReportEvent{" +
                "totalTicketSales=" + totalTicketSales +
                ", totalConcessions=" + totalConcessions +
                '}';
    }
}