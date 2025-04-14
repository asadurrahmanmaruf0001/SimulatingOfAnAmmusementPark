package OOPProject.Akib;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AccessLogsFxmlController {
    @javafx.fxml.FXML
    private TableView accessLogsTableView;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn entryTimeTableColumn;
    @javafx.fxml.FXML
    private TableColumn locationTableColumn;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private ComboBox selectLocationComboBox;

    @javafx.fxml.FXML
    public void filterButtonOnAction(ActionEvent actionEvent) {
    }
}
