package OOPProject;

import OOPProject.Akib.MaintanceDashboardController;
import OOPProject.Santo.ParkAdminDashBoardController;
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



    private final ArrayList<String> loginAttempts = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void continueButtonOnAction(ActionEvent actionEvent) throws IOException {
        String userID = userIDTextField.getText();
        String password = passwordPasswordField.getText();

        // Store login attempt
        loginAttempts.add("ID: " + userID + ", Password: " + password);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene;
        FXMLLoader fxmlLoader;
        Parent root;

        if (userID.equals("123456") && password.equals("akib2331454")) {
            // Load Security Officer Dashboard
            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/SecurityDashboardFxml.fxml"));
            root = fxmlLoader.load();
            scene = new Scene(root, 800, 400);
            stage.setScene(scene);
            stage.setTitle("Security Dashboard");
            stage.show();


        } else if (userID.equals("1234567") && password.equals("akib2331454")) {
            // Load Maintenance Officer Dashboard
            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Akib/MaintananceDashboardFxml.fxml"));
            root = fxmlLoader.load();

            // Set optional data to controller
            MaintanceDashboardController controller = fxmlLoader.getController();
            controller.setter("akib", "2331454");

            scene = new Scene(root, 800, 400);
            stage.setScene(scene);
            stage.setTitle("Maintenance Dashboard");
            stage.show();

        }

            else if (userID.equals("123456") && password.equals("santo123456")) {

            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/ParkAdminDashBoard.fxml"));
            root = fxmlLoader.load();


            scene = new Scene(root, 800, 400);
            stage.setScene(scene);
            stage.setTitle("Park Admin Dashboard");
            stage.show();
        }
                else if (userID.equals("234567") && password.equals("santo234567")) {

                fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Santo/ParkAdminDashBoard.fxml"));
                root = fxmlLoader.load();


                scene = new Scene(root, 800, 400);
                stage.setScene(scene);
                stage.setTitle("Ride Operator Dashboard");
                stage.show();





        } else {
            // Invalid login
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText("Invalid credentials");
            alert.setContentText("Please check your ID and password.");
            alert.showAndWait();
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


//    }




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
    @javafx.fxml.FXML
    public void createAccountButtonOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createAccountFxml.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Maintenance Dashboard");
        stage.show();


    }



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


