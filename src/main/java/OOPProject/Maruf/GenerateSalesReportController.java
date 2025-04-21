package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class GenerateSalesReportController
{
    @javafx.fxml.FXML
    private DatePicker datePickReport;
    @javafx.fxml.FXML
    private Label lblReportSalesResult;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void btnPrintReport(ActionEvent actionEvent) {
        lblReportSalesResult.setText("Report printed/downloaded successfully");

    }

    @javafx.fxml.FXML
    public void btnGenerate(ActionEvent actionEvent) {
        if(datePickReport.getValue()==null){
            lblReportSalesResult.setText("Please select a date");
        }else{
            String selectedDate=datePickReport.getValue().toString();
            ReportOfSales report = new ReportOfSales(selectedDate, 120);
            lblReportSalesResult.setText("Tickets sold on"+ report.getDate()+
                    ":"+report.getTicketSold());
        }
    }
}