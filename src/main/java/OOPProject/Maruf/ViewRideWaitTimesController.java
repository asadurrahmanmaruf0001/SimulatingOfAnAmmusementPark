package OOPProject.Maruf;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewRideWaitTimesController
{
    @javafx.fxml.FXML
    private TableColumn<com.example.demo2.Maruf.Ride,String> colWaitTime;
    @javafx.fxml.FXML
    private Label rideMessageLabel;
    @javafx.fxml.FXML
    private TableView<com.example.demo2.Maruf.Ride> rideTableView;
    @javafx.fxml.FXML
    private TableColumn<com.example.demo2.Maruf.Ride,String> colRideName;
    @javafx.fxml.FXML
    private TableColumn<com.example.demo2.Maruf.Ride,String> colStatus;

    @javafx.fxml.FXML
    public void initialize() {
        colRideName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colWaitTime.setCellValueFactory(new PropertyValueFactory<>("waitTime"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        rideTableView.getItems().addAll(new com.example.demo2.Maruf.Ride("SkyDrop","Open",15),new com.example.demo2.Maruf.Ride("Water wave","Closed",15),new com.example.demo2.Maruf.Ride("Boomerang","Open",10 ));
    }

    @javafx.fxml.FXML
    public void btnViewStatus(ActionEvent actionEvent) {
        com.example.demo2.Maruf.Ride selected = rideTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            rideMessageLabel.setText("The Ride is Currenntly Unavailable");

        } else {
            rideMessageLabel.setText("");
        }
    } }