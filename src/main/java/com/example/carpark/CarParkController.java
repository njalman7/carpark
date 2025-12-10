package com.example.carpark;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class CarParkController {
    private Map<String, Boolean> parkingStatus = new HashMap<>();
    private static final int TOTAL_SPOTS = 200;
    private int freeSpots;
    private void hideAllSpots() {
        A1.setVisible(false);
        A2.setVisible(false);
        A3.setVisible(false);
        A4.setVisible(false);
        A5.setVisible(false);
        A6.setVisible(false);
        A7.setVisible(false);
        A8.setVisible(false);
        A9.setVisible(false);
        A10.setVisible(false);

        B1.setVisible(false);
        B2.setVisible(false);
        B3.setVisible(false);
        B4.setVisible(false);
        B5.setVisible(false);
        B6.setVisible(false);
        B7.setVisible(false);
        B8.setVisible(false);
        B9.setVisible(false);
        B10.setVisible(false);

        C1.setVisible(false);
        C2.setVisible(false);
        C3.setVisible(false);
        C4.setVisible(false);
        C5.setVisible(false);
        C6.setVisible(false);
        C7.setVisible(false);
        C8.setVisible(false);
        C9.setVisible(false);
        C10.setVisible(false);

        D1.setVisible(false);
        D2.setVisible(false);
        D3.setVisible(false);
        D4.setVisible(false);
        D5.setVisible(false);
        D6.setVisible(false);
        D7.setVisible(false);
        D8.setVisible(false);
        D9.setVisible(false);
        D10.setVisible(false);
    }
    private void setupParkingStatus() {

        // Reihe A
        parkingStatus.put("A1", true);
        parkingStatus.put("A2", true);
        parkingStatus.put("A3", false);
        parkingStatus.put("A4", true);
        parkingStatus.put("A5", false);
        parkingStatus.put("A6", true);
        parkingStatus.put("A7", true);
        parkingStatus.put("A8", false);
        parkingStatus.put("A9", true);
        parkingStatus.put("A10", true);

        // Reihe B
        parkingStatus.put("B1", true);
        parkingStatus.put("B2", false);
        parkingStatus.put("B3", true);
        parkingStatus.put("B4", true);
        parkingStatus.put("B5", true);
        parkingStatus.put("B6", false);
        parkingStatus.put("B7", true);
        parkingStatus.put("B8", true);
        parkingStatus.put("B9", false);
        parkingStatus.put("B10", true);

        // Reihe C
        parkingStatus.put("C1", true);
        parkingStatus.put("C2", true);
        parkingStatus.put("C3", false);
        parkingStatus.put("C4", true);
        parkingStatus.put("C5", true);
        parkingStatus.put("C6", false);
        parkingStatus.put("C7", true);
        parkingStatus.put("C8", false);
        parkingStatus.put("C9", true);
        parkingStatus.put("C10", true);

        // Reihe D
        parkingStatus.put("D1", true);
        parkingStatus.put("D2", false);
        parkingStatus.put("D3", true);
        parkingStatus.put("D4", true);
        parkingStatus.put("D5", false);
        parkingStatus.put("D6", true);
        parkingStatus.put("D7", true);
        parkingStatus.put("D8", false);
        parkingStatus.put("D9", true);
        parkingStatus.put("D10", true);
    }

    @FXML
    private Button A1;

    @FXML
    private Button A2;

    @FXML
    private Button A3;

    @FXML
    private Button A4;

    @FXML
    private Button A5;

    @FXML
    private Button A6;

    @FXML
    private Button A7;

    @FXML
    private Button A8;

    @FXML
    private Button A9;

    @FXML
    private Button A10;

    @FXML
    private Button B1;

    @FXML
    private Button B2;

    @FXML
    private Button B3;

    @FXML
    private Button B4;

    @FXML
    private Button B5;

    @FXML
    private Button B6;

    @FXML
    private Button B7;

    @FXML
    private Button B8;

    @FXML
    private Button B9;

    @FXML
    private Button B10;

    @FXML
    private Button C1;

    @FXML
    private Button C2;

    @FXML
    private Button C3;

    @FXML
    private Button C4;

    @FXML
    private Button C5;

    @FXML
    private Button C6;

    @FXML
    private Button C7;

    @FXML
    private Button C8;

    @FXML
    private Button C9;

    @FXML
    private Button C10;

    @FXML
    private Button D1;

    @FXML
    private Button D2;

    @FXML
    private Button D3;

    @FXML
    private Button D4;

    @FXML
    private Button D5;

    @FXML
    private Button D6;

    @FXML
    private Button D7;

    @FXML
    private Button D8;

    @FXML
    private Button D9;

    @FXML
    private Button D10;

    @FXML
    private Label anzeige;

    @FXML
    private ComboBox<String> levelSelector;

    @FXML
    private Pane parkspace;

    @FXML
    void initialize() {
        setupParkingStatus();
        updateFreeSpotsDisplay();

        double utilization = calculateUtilization();

        levelSelector.getItems().setAll(
                "Alle Etagen",
                "Etage 0",
                "Etage 1",
                "Etage 2",
                "Etage 3"
        );

        updateAnzeige(utilization);
    }


    @FXML
    void onShow(ActionEvent event) {
        String selected = levelSelector.getValue();

        if (selected == null) return;

        hideAllSpots();

        switch (selected) {
            case "Alle Etagen":
                showRowA();
                showRowB();
                showRowC();
                showRowD();
                break;
            case "Etage 0":
                showRowA();
                break;
            case "Etage 1":
                showRowB();
                break;
            case "Etage 2":
                showRowC();
                break;
            case "Etage 3":
                showRowD();
                break;
        }

    }

    private void showRowA() {
        A1.setVisible(true);
        A2.setVisible(true);
        A3.setVisible(true);
        A4.setVisible(true);
        A5.setVisible(true);
        A6.setVisible(true);
        A7.setVisible(true);
        A8.setVisible(true);
        A9.setVisible(true);
        A10.setVisible(true);
    }

    private void showRowB() {
        B1.setVisible(true);
        B2.setVisible(true);
        B3.setVisible(true);
        B4.setVisible(true);
        B5.setVisible(true);
        B6.setVisible(true);
        B7.setVisible(true);
        B8.setVisible(true);
        B9.setVisible(true);
        B10.setVisible(true);
    }

    private void showRowC() {
        C1.setVisible(true);
        C2.setVisible(true);
        C3.setVisible(true);
        C4.setVisible(true);
        C5.setVisible(true);
        C6.setVisible(true);
        C7.setVisible(true);
        C8.setVisible(true);
        C9.setVisible(true);
        C10.setVisible(true);
    }

    private void showRowD() {
        D1.setVisible(true);
        D2.setVisible(true);
        D3.setVisible(true);
        D4.setVisible(true);
        D5.setVisible(true);
        D6.setVisible(true);
        D7.setVisible(true);
        D8.setVisible(true);
        D9.setVisible(true);
        D10.setVisible(true);
    }


    private void updateAnzeige(double utilization) {
        anzeige.setText(
                " Freie Parkplätze: " + freeSpots + " von " + TOTAL_SPOTS +
                        " | Auslastung: " + utilization + "%"
        );
    }

    private double calculateUtilization() {
        return (100.0 / TOTAL_SPOTS) * freeSpots;

    }
    private int countFreeSpots() {
        int count = 0;

        for (Boolean isFree : parkingStatus.values()) {
            if (isFree) {
                count++;
            }
        }

        return count;
    }
    private void updateFreeSpotsDisplay() {
        int free = countFreeSpots();
        double percent = (100.0 / TOTAL_SPOTS) * free;

        anzeige.setText(
                "Freie Parkplätze: " + free + " von " + TOTAL_SPOTS +
                        " | Auslastung: " + percent + " %"
        );
    }

    public void hover(MouseEvent mouseEvent) {
        Button button = (Button) mouseEvent.getSource();
        if (mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED) {
            button.setStyle("-fx-background-color: #EEEE00;"); // Farbe beim Hover
        }
        else if (mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED) { button.setStyle("-fx-background-color: #32CD32;"); // ursprüngliche Farbe
        }
    }

    private boolean free = true; // true -> grün, false -> rot
    private Button[][] spaces;

    public void onClick() {
        // fick mein Leben
        //Array befüllen
        spaces = new Button[][]{
                {A1, B1, C1, D1},
                {A2, B2, C2, D2},
                {A3, B3, C3, D3},
                {A4, B4, C4, D4},
                {A5, B5, C5, D5},
                {A6, B6, C6, D6},
                {A7, B7, C7, D7},
                {A8, B8, C8, D8},
                {A9, B9, C9, D9},
                {A10, B10, C10, D10}
        };
        // Aktionen für Felder setzen
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                Button b = spaces[r][c];
                // b.setOnAction(e -> handleMove(b));
            }
        }
    }






}
