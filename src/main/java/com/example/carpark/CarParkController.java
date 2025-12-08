package com.example.carpark;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class CarParkController {

    @FXML
    private Label A1;

    @FXML
    private Label A2;

    @FXML
    private Label A3;

    @FXML
    private Label A4;

    @FXML
    private Label A5;

    @FXML
    private Label A6;

    @FXML
    private Label A7;

    @FXML
    private Label A8;

    @FXML
    private Label A9;

    @FXML
    private Label A10;

    @FXML
    private Label B1;

    @FXML
    private Label B2;

    @FXML
    private Label B3;

    @FXML
    private Label B4;

    @FXML
    private Label B5;

    @FXML
    private Label B6;

    @FXML
    private Label B7;

    @FXML
    private Label B8;

    @FXML
    private Label B9;

    @FXML
    private Label B10;

    @FXML
    private Label C1;

    @FXML
    private Label C2;

    @FXML
    private Label C3;

    @FXML
    private Label C4;

    @FXML
    private Label C5;

    @FXML
    private Label C6;

    @FXML
    private Label C7;

    @FXML
    private Label C8;

    @FXML
    private Label C9;

    @FXML
    private Label C10;

    @FXML
    private Label D1;

    @FXML
    private Label D2;

    @FXML
    private Label D3;

    @FXML
    private Label D4;

    @FXML
    private Label D5;

    @FXML
    private Label D6;

    @FXML
    private Label D7;

    @FXML
    private Label D8;

    @FXML
    private Label D9;

    @FXML
    private Label D10;

    @FXML
    private Label anzeige;

    @FXML
    private ComboBox<String> levelSelector;

    @FXML
    private Pane parkspace;

    @FXML
    void initialize() {
        levelSelector.getItems().setAll("Etage 0",
                "Etage 1",
                "Etage 2",
                "Etage 3",
                "Etage 4");

        anzeige.setText("Freie Parkplätze: ");
    }


    @FXML
    void onShow(ActionEvent event) {

    }



}
