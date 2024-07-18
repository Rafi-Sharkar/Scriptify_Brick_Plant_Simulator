package rs.oop.brickfield.controller.supervisor;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class SupervisorDashboard
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
//  set supervisor's tasks at combobox
        tasksCB.getItems().addAll("Employee's Attendence", "Need Employee", "Check Machinery", "Repair Machine", "Set Target for Employee", "Check Target", "Overtime Request", "View Daily Status");
        tasksCB.setValue("Choose task");

    }

    @Deprecated
    public void logOut(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectTask(ActionEvent actionEvent) {
    }
}