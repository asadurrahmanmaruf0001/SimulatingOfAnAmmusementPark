package OOPProject.Akib;

import OOPProject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;


public class MaintanceDashboardController {

    @javafx.fxml.FXML
    private BorderPane bpBorderPane;

    String id;
    String password;


    public void getter(){

    }
    public void setter(String id, String password){
        this.id= id;
        this.password=password;
    }
    @javafx.fxml.FXML
    public void equipmentButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/equipmentFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);

    }

    @javafx.fxml.FXML
    public void maintenanceTaskScheduleButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/maintenanceTaskScheduleFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void maintenanceHistoryButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/maintenanceHistoryFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);

    }

    @Deprecated
    public void completionRepairButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/completeRepairFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void technicalIsuueButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/technicalIssueFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void dashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/maintenanceDesign.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void emergencyRepairButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/emergencyRepairFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void maintenanceStaffButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/maintenanceStaffFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void sparePartsOrderButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/sparePartsOrderFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void completeRepairButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/completeRepairFxml.fxml"));
        Parent root = fxmlLoader.load();
        bpBorderPane.setCenter(root);
    }

    @javafx.fxml.FXML
    public void logOutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginFxml.fxml"));
        Parent root = fxmlLoader.load();

        javafx.stage.Stage stage = (javafx.stage.Stage) bpBorderPane.getScene().getWindow();

        stage.setScene(new javafx.scene.Scene(root));
        stage.setTitle("Login Page");
        stage.show();

    }
}
