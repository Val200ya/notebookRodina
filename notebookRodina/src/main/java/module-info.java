module com.example.notebookrodina {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notebookrodina to javafx.fxml;
    exports com.example.notebookrodina;
}