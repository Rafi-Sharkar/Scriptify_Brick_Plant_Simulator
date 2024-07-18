package rs.oop.brickfield.controller.salesmanager;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SalesManagerDashboard
{
    @javafx.fxml.FXML
    private ComboBox<String> tasksCB;
    @javafx.fxml.FXML
    private Label genderLB;
    @javafx.fxml.FXML
    private Label shiftLB;
    @javafx.fxml.FXML
    private Label phoneLB;
    @javafx.fxml.FXML
    private Label uidLB;
    @javafx.fxml.FXML
    private Label dobLB;
    @javafx.fxml.FXML
    private Label addressLB;
    @javafx.fxml.FXML
    private Label notificationLB;
    @javafx.fxml.FXML
    private Label nameLB;
    @javafx.fxml.FXML
    private Label emailLB;

    @javafx.fxml.FXML
    public void initialize() {
//  set salesmanager's tasks at combobox
        tasksCB.getItems().addAll("View Production Report", "Add product", "Hendle help request", "Check Refund Request", "Set discount", "Create a delivery for order");
        tasksCB.setValue("Choose task");

    }

    @Deprecated
    public void logOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectTask(ActionEvent actionEvent) {
    }
}