package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import OOPProject.Akib.VisitorEntryFxmlController;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;


public class VisitorEntryFxmlController {
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> ticketIdComboBox;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private TextField purposeTextField;

    ArrayList<VisitorEntryModel> visitorList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableView<VisitorEntryModel> visitorEntryTableView;
    @javafx.fxml.FXML
    private TableColumn<VisitorEntryModel, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<VisitorEntryModel, String> ticketIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<VisitorEntryModel, String> purposeTableColumn;


    @javafx.fxml.FXML
    public void initialize() {
        ticketIdComboBox.getItems().addAll("Passport", "National ID", "Driving License");

        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        purposeTableColumn.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        ticketIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("ticketId"));

    }


    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String purpose = purposeTextField.getText();
        String ticketId = ticketIdComboBox.getValue();


        if (name.isEmpty() || purpose.isEmpty() || ticketId == null) {
            messageLabel.setText("Please fill all fields and select ID proof.");
            return;
        }
        VisitorEntryModel entry = new VisitorEntryModel(name, purpose, ticketId);
        visitorList.add(entry);

        messageLabel.setText("Visitor entry saved");

        nameTextField.clear();
        purposeTextField.clear();
        ticketIdComboBox.getSelectionModel().clearSelection();

        visitorEntryTableView.getItems().setAll(visitorList);
    }
}
