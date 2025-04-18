package OOPProject.Akib;

import OOPProject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class SecurityDashboardFxmlController {
    @javafx.fxml.FXML
    private BorderPane securityBorderPane;

    String id;
    String password;

    public void getter(){

    }
    public void setter(String id, String password){
        this.id= id;
        this.password=password;
    }

    @javafx.fxml.FXML
    public void activeAlarmsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/activeAlarmsFxml.fxml"));
        Parent root = fxmlLoader.load();
        securityBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void accessLogsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/accessLogsFxml.fxml"));
        Parent root = fxmlLoader.load();
        securityBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void visitorEntryButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/visitorEntryFxml.fxml"));
        Parent root = fxmlLoader.load();
        securityBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void surveillanceButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/surveillanceFxml.fxml"));
        Parent root = fxmlLoader.load();
        securityBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void emergencyProtocolButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/emergencyProtocolFxml.fxml"));
        Parent root = fxmlLoader.load();
        securityBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void incidentReportButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/incidentReportFxml.fxml"));
        Parent root = fxmlLoader.load();
        securityBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void dashboardButtonOnAction(ActionEvent actionEvent) throws IOException {

    }

    @javafx.fxml.FXML
    public void clearanceButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/clearanceFxml.fxml"));
        Parent root = fxmlLoader.load();
        securityBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void assignDutyButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/assignDutyFxml.fxml"));
        Parent root = fxmlLoader.load();
        securityBorderPane.setCenter(root);
    }
}
