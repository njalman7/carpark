package com.example.carpark;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class CarParkController {

    @FXML
    private Label anzeige;

    @FXML
    private ComboBox<?> levelSelector;

    @FXML
    private Pane parkspace;

    @FXML
    void onShow(ActionEvent event) {

    }

}
