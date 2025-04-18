package OOPProject;

import OOPProject.Akib.MaintanceDashboardController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class LoginFxml
{
    @javafx.fxml.FXML
    private CheckBox showPasswordCheckBox;
    @javafx.fxml.FXML
    private TextField userIDTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private Label showPasswordLabel;

    private final String securityOfficerID = "123456";
    private final String securityOfficerPassword = "Akib2331454";

    private final String maintenanceOfficerID = "1234567";
    private final String maintenanceOfficerPassword = "Hassan2331454";

    private final ArrayList<String> loginAttempts = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        showPasswordCheckBox.setOnAction(e -> {
            if (showPasswordCheckBox.isSelected()) {
                showPasswordLabel.setText(passwordPasswordField.getText());
            } else {
                showPasswordLabel.setText("");
            }
        });

        passwordPasswordField.textProperty().addListener((obs, oldText, newText) -> {
            if (showPasswordCheckBox.isSelected()) {
                showPasswordLabel.setText(newText);
            }
        });


    }

    @javafx.fxml.FXML
    public void continueButtonOnAction(ActionEvent actionEvent) throws IOException {

        String userID = userIDTextField.getText().trim();
        String password = passwordPasswordField.getText().trim();

        loginAttempts.add("Tried: " + userID);

        if (userID.equals(securityOfficerID) && password.equals(securityOfficerPassword)) {
            // Load Security Officer Dashboard
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("securityOfficerDashboard.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Security Officer Dashboard");
            stage.show();

        } else if (userID.equals(maintenanceOfficerID) && password.equals(maintenanceOfficerPassword)) {
            // Load Maintenance Officer Dashboard
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/MaintananceDashboardFxml.fxml"));
            Parent root = fxmlLoader.load();
            MaintanceDashboardController dc = fxmlLoader.getController();
            dc.setter("akib", "2331454");

            Scene scene = new Scene(root, 800, 400);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Maintenance Dashboard");
            stage.show();

        } else {
            showAlert("Login Failed", "Incorrect User ID or Password.");

        }
    }




//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/MaintananceDashboardFxml.fxml"));
//        Parent root = fxmlLoader.load();
//        MaintanceDashboardController dc= fxmlLoader.getController();
//        dc.setter("akib", "2331454");
//
//        Scene scene = new Scene(root, 800, 400);
//        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//        stage.setScene(scene);
//        stage.setTitle("Maintenance Dashboard");
//        stage.show();
//
//    }
//
//
//    @javafx.fxml.FXML
    public void createAccountButtonOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createAccountFxml.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();


    }


    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.show();
    }
////        FXMLLoader fxmlLoader = new FXMLLoader(LoginFxml.class.getResource("createAccountFxml.fxml"));
////        Scene scene = new Scene(fxmlLoader.load());
////        Stage stage= new Stage();
////        stage.setTitle("Create Account!");
////        stage.setScene(scene);
////        stage.show();
//
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createAccountFxml.fxml"));
//        Parent root = fxmlLoader.load();
//        Scene scene = new Scene(root);
//        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
//        stage.setScene(scene);
//        stage.setTitle("Maintenance Dashboard");
//        stage.show();
//
//    }
}

