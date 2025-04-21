package OOPProject.Santo.ControllerCode;

public class TrackRevenueAndExpenses {
    private double dailyRevenue;
    private double dailyExpenses;

    public TrackRevenueAndExpenses(double dailyRevenue, double dailyExpenses) {
        this.dailyRevenue = dailyRevenue;
        this.dailyExpenses = dailyExpenses;
    }

    public double getDailyRevenue() {
        return dailyRevenue;
    }

    public void setDailyRevenue(double dailyRevenue) {
        this.dailyRevenue = dailyRevenue;
    }

    public double getDailyExpenses() {
        return dailyExpenses;
    }

    public void setDailyExpenses(double dailyExpenses) {
        this.dailyExpenses = dailyExpenses;
    }

    @Override
    public String toString() {
        return "TrackRevenueAndExpenses{" +
                "dailyRevenue=" + dailyRevenue +
                ", dailyExpenses=" + dailyExpenses +
                '}';
    }
}