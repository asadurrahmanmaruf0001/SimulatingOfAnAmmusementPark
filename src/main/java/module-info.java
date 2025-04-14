module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens OOPProject to javafx.fxml;
    opens OOPProject.Akib to javafx.fxml;
    exports OOPProject;
    exports OOPProject.Akib;
}