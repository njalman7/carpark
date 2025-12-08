package com.example.carpark;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CarParkController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
