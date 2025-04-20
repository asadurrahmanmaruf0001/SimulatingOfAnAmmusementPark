module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens OOPProject to javafx.fxml;
    opens OOPProject.Akib to javafx.fxml;
    opens OOPProject.Maruf to javafx.fxml;
    exports OOPProject;
    exports OOPProject.Akib;
}