package com.example.carpark;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarParkController {
    private final Map<String, Boolean> parkingStatus = new HashMap<>();
    private static final int TOTAL_SPOTS = 40;

    private List<Button> getAllButtons() {
        return Arrays.asList(
                A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,
                B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,
                C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,
                D1,D2,D3,D4,D5,D6,D7,D8,D9,D10
        );
    }
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
        parkingStatus.put("A3", true);
        parkingStatus.put("A4", true);
        parkingStatus.put("A5", true);
        parkingStatus.put("A6", true);
        parkingStatus.put("A7", true);
        parkingStatus.put("A8", true);
        parkingStatus.put("A9", true);
        parkingStatus.put("A10", true);

        // Reihe B
        parkingStatus.put("B1", true);
        parkingStatus.put("B2", true);
        parkingStatus.put("B3", true);
        parkingStatus.put("B4", true);
        parkingStatus.put("B5", true);
        parkingStatus.put("B6", true);
        parkingStatus.put("B7", true);
        parkingStatus.put("B8", true);
        parkingStatus.put("B9", true);
        parkingStatus.put("B10", true);

        // Reihe C
        parkingStatus.put("C1", true);
        parkingStatus.put("C2", true);
        parkingStatus.put("C3", true);
        parkingStatus.put("C4", true);
        parkingStatus.put("C5", true);
        parkingStatus.put("C6", true);
        parkingStatus.put("C7", true);
        parkingStatus.put("C8", true);
        parkingStatus.put("C9", true);
        parkingStatus.put("C10", true);

        // Reihe D
        parkingStatus.put("D1", true);
        parkingStatus.put("D2", true);
        parkingStatus.put("D3", true);
        parkingStatus.put("D4", true);
        parkingStatus.put("D5", true);
        parkingStatus.put("D6", true);
        parkingStatus.put("D7", true);
        parkingStatus.put("D8", true);
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

        Button[] allButtons = {
                A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,
                B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,
                C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,
                D1,D2,D3,D4,D5,D6,D7,D8,D9,D10
        };

        for (Button b : allButtons) {
            applyBaseColor(b);
            b.setOnAction(this::onClick);
        }

        levelSelector.getItems().setAll(
                "Alle Etagen",
                "Etage 0",
                "Etage 1",
                "Etage 2",
                "Etage 3"
        );
        for (Button b : allButtons) {
            String id = b.getId();
            if (parkingStatus.get(id)) {
                b.setStyle("-fx-background-color: #32CD32;");
            } else {
                b.setStyle("-fx-background-color: #FF0000;");
            }
        }
    }


    private static final String COLOR_FREE = "-fx-background-color: #32CD32;";
    private static final String COLOR_USED = "-fx-background-color: #FF0000;";
    private static final String COLOR_HOVER = "-fx-background-color: #EEEE00;";

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
    private void showRow(Button... buttons) {
        for (Button b : buttons) b.setVisible(true);
    }

    private void showRowA() {
        showRow(A1,A2,A3,A4,A5,A6,A7,A8,A9,A10);
    }

    private void showRowB() {
        showRow(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10);
    }

    private void showRowC() {
        showRow(C1,C2,C3,C4,C5,C6,C7,C8,C9,C10);
    }

    private void showRowD() {
        showRow(D1,D2,D3,D4,D5,D6,D7,D8,D9,D10);
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
        double percent = (TOTAL_SPOTS - free) * 2.5;

        anzeige.setText(
                "Freie Parkplätze: " + free + " von " + TOTAL_SPOTS +
                        " | Auslastung: " + percent + " %"
        );
    }

    public void hover(MouseEvent mouseEvent) {
        Button b = (Button) mouseEvent.getSource();

        if (mouseEvent.getEventType() == MouseEvent.MOUSE_ENTERED) {
            b.setStyle(COLOR_HOVER); // Hover-Gelb
        }
        else if (mouseEvent.getEventType() == MouseEvent.MOUSE_EXITED) {
            applyBaseColor(b); // zurück zur normalen Farbe
        }

    }
    private void applyBaseColor(Button b) {
        String id = b.getId();
        boolean free = parkingStatus.get(id);

        if (free) b.setStyle(COLOR_FREE);
        else b.setStyle(COLOR_USED);
    }
    public void onClick(ActionEvent event) {
        Button clicked = (Button) event.getSource();
        String id = clicked.getId();

        parkingStatus.compute(id, (k, current) -> Boolean.FALSE.equals(current));

        applyBaseColor(clicked);     // Zustand neu einfärben
        updateFreeSpotsDisplay();    // Anzeige aktualisieren
    }






}
