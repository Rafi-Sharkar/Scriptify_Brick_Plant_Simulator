module rs.oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens rs.oop to javafx.fxml;
    exports rs.oop;
    exports rs.oop.brickfield.controller.supervisor;
    opens rs.oop.brickfield.controller.supervisor to javafx.fxml;
    exports rs.oop.brickfield.controller.salesmanager;
    opens rs.oop.brickfield.controller.salesmanager to javafx.fxml;
}