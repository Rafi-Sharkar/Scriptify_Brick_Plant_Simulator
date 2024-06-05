module rs.oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.oop to javafx.fxml;
    exports rs.oop;
}