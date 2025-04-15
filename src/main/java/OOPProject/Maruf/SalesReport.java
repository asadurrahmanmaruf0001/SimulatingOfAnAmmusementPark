package com.example.demo2.Maruf;

import java.time.LocalDate;

public class SalesReport {
    private String reportId;
    private int totalTicketSold;
    private double totalSales;
    private LocalDate reportDate;

    public SalesReport(String reportId, int totalTicketSold, double totalSales, LocalDate reportDate) {
        this.reportId = reportId;
        this.totalTicketSold = totalTicketSold;
        this.totalSales = totalSales;
        this.reportDate = reportDate;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public int getTotalTicketSold() {
        return totalTicketSold;
    }

    public void setTotalTicketSold(int totalTicketSold) {
        this.totalTicketSold = totalTicketSold;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "SalesReport{" +
                "reportId='" + reportId + '\'' +
                ", totalTicketSold=" + totalTicketSold +
                ", totalSales=" + totalSales +
                ", reportDate=" + reportDate +
                '}';
    }
}
