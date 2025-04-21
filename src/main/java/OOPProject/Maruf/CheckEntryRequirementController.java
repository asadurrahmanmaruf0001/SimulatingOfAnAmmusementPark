package OOPProject.Maruf;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class CheckEntryRequirementController
{
    @javafx.fxml.FXML
    private TableColumn<Rule,String> ruleCateTabCol;
    @javafx.fxml.FXML
    private TableColumn <Rule,String>ruleTableCol;
    @javafx.fxml.FXML
    private TextArea ruleDetailsArea;
    @javafx.fxml.FXML
    private TableView<Rule> ruleTableView;
    @javafx.fxml.FXML
    private TableColumn<Rule,String> ruleDesColumn;

    @javafx.fxml.FXML
    public void initialize() {
        ruleTableCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        ruleCateTabCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        ruleDesColumn.setCellValueFactory(new PropertyValueFactory<>("shortDesc"));
        ruleTableView.getItems().addAll(new Rule("R01","Age","minimum age 12","must be at least 12"),new Rule("R02","Safety","Follow the safety rules","obey all instructions"),new Rule("r03","Items","No outside foods","outside food not allowed"));



    }}