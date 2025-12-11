package com.example.carpark;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarParkController {
    private final Map<String, Boolean> parkingStatus = new HashMap<>();
    private static final int TOTAL_SPOTS = 60;

    private List<Button> getAllButtons() {
        return Arrays.asList(
                U11,U12,U13,U14,U15,U16,U17,U18,U19,U110,
                E01,E02,E03,E04,E05,E06,E07,E08,E09,E010,
                E11,E12,E13,E14,E15,E16,E17,E18,E19,E110,
                E21,E22,E23,E24,E25,E26,E27,E28,E29,E210,
                E31,E32,E33,E34,E35,E36,E37,E38,E39,E310,
                E41,E42,E43,E44,E45,E46,E47,E48,E49,E410
        );
    }
    private void hideAllSpots() {
        U11.setVisible(false);
        U12.setVisible(false);
        U13.setVisible(false);
        U14.setVisible(false);
        U15.setVisible(false);
        U16.setVisible(false);
        U17.setVisible(false);
        U18.setVisible(false);
        U19.setVisible(false);
        U110.setVisible(false);

        E01.setVisible(false);
        E02.setVisible(false);
        E03.setVisible(false);
        E04.setVisible(false);
        E05.setVisible(false);
        E06.setVisible(false);
        E07.setVisible(false);
        E08.setVisible(false);
        E09.setVisible(false);
        E010.setVisible(false);

        E11.setVisible(false);
        E12.setVisible(false);
        E13.setVisible(false);
        E14.setVisible(false);
        E15.setVisible(false);
        E16.setVisible(false);
        E17.setVisible(false);
        E18.setVisible(false);
        E19.setVisible(false);
        E110.setVisible(false);

        E21.setVisible(false);
        E22.setVisible(false);
        E23.setVisible(false);
        E24.setVisible(false);
        E25.setVisible(false);
        E26.setVisible(false);
        E27.setVisible(false);
        E28.setVisible(false);
        E29.setVisible(false);
        E210.setVisible(false);

        E31.setVisible(false);
        E32.setVisible(false);
        E33.setVisible(false);
        E34.setVisible(false);
        E35.setVisible(false);
        E36.setVisible(false);
        E37.setVisible(false);
        E38.setVisible(false);
        E39.setVisible(false);
        E310.setVisible(false);

        E41.setVisible(false);
        E42.setVisible(false);
        E43.setVisible(false);
        E44.setVisible(false);
        E45.setVisible(false);
        E46.setVisible(false);
        E47.setVisible(false);
        E48.setVisible(false);
        E49.setVisible(false);
        E410.setVisible(false);
    }
    private void setupParkingStatus() {

        // Reihe -1
        parkingStatus.put("U11", true);
        parkingStatus.put("U12", true);
        parkingStatus.put("U13", true);
        parkingStatus.put("U14", true);
        parkingStatus.put("U15", true);
        parkingStatus.put("U16", true);
        parkingStatus.put("U17", true);
        parkingStatus.put("U18", true);
        parkingStatus.put("U19", true);
        parkingStatus.put("U110", true);

        // Reihe 0
        parkingStatus.put("E01", true);
        parkingStatus.put("E02", true);
        parkingStatus.put("E03", true);
        parkingStatus.put("E04", true);
        parkingStatus.put("E05", true);
        parkingStatus.put("E06", true);
        parkingStatus.put("E07", true);
        parkingStatus.put("E08", true);
        parkingStatus.put("E09", true);
        parkingStatus.put("E010", true);

        // Reihe 1
        parkingStatus.put("E11", true);
        parkingStatus.put("E12", true);
        parkingStatus.put("E13", true);
        parkingStatus.put("E14", true);
        parkingStatus.put("E15", true);
        parkingStatus.put("E16", true);
        parkingStatus.put("E17", true);
        parkingStatus.put("E18", true);
        parkingStatus.put("E19", true);
        parkingStatus.put("E110", true);

        // Reihe 2
        parkingStatus.put("E21", true);
        parkingStatus.put("E22", true);
        parkingStatus.put("E23", true);
        parkingStatus.put("E24", true);
        parkingStatus.put("E25", true);
        parkingStatus.put("E26", true);
        parkingStatus.put("E27", true);
        parkingStatus.put("E28", true);
        parkingStatus.put("E29", true);
        parkingStatus.put("E210", true);

        // Reihe 3
        parkingStatus.put("E31", true);
        parkingStatus.put("E32", true);
        parkingStatus.put("E33", true);
        parkingStatus.put("E34", true);
        parkingStatus.put("E35", true);
        parkingStatus.put("E36", true);
        parkingStatus.put("E37", true);
        parkingStatus.put("E38", true);
        parkingStatus.put("E39", true);
        parkingStatus.put("E310", true);

        // Reihe 4
        parkingStatus.put("E41", true);
        parkingStatus.put("E42", true);
        parkingStatus.put("E43", true);
        parkingStatus.put("E44", true);
        parkingStatus.put("E45", true);
        parkingStatus.put("E46", true);
        parkingStatus.put("E47", true);
        parkingStatus.put("E48", true);
        parkingStatus.put("E49", true);
        parkingStatus.put("E410", true);
    }

    @FXML
    private Button U11;

    @FXML
    private Button U12;

    @FXML
    private Button U13;

    @FXML
    private Button U14;

    @FXML
    private Button U15;

    @FXML
    private Button U16;

    @FXML
    private Button U17;

    @FXML
    private Button U18;

    @FXML
    private Button U19;

    @FXML
    private Button U110;

    @FXML
    private Button E01;

    @FXML
    private Button E02;

    @FXML
    private Button E03;

    @FXML
    private Button E04;

    @FXML
    private Button E05;

    @FXML
    private Button E06;

    @FXML
    private Button E07;

    @FXML
    private Button E08;

    @FXML
    private Button E09;

    @FXML
    private Button E010;

    @FXML
    private Button E11;

    @FXML
    private Button E12;

    @FXML
    private Button E13;

    @FXML
    private Button E14;

    @FXML
    private Button E15;

    @FXML
    private Button E16;

    @FXML
    private Button E17;

    @FXML
    private Button E18;

    @FXML
    private Button E19;

    @FXML
    private Button E110;

    @FXML
    private Button E21;

    @FXML
    private Button E22;

    @FXML
    private Button E23;

    @FXML
    private Button E24;

    @FXML
    private Button E25;

    @FXML
    private Button E26;

    @FXML
    private Button E27;

    @FXML
    private Button E28;

    @FXML
    private Button E29;

    @FXML
    private Button E210;

    @FXML
    private Button E31;

    @FXML
    private Button E32;

    @FXML
    private Button E33;

    @FXML
    private Button E34;

    @FXML
    private Button E35;

    @FXML
    private Button E36;

    @FXML
    private Button E37;

    @FXML
    private Button E38;

    @FXML
    private Button E39;

    @FXML
    private Button E310;

    @FXML
    private Button E41;

    @FXML
    private Button E42;

    @FXML
    private Button E43;

    @FXML
    private Button E44;

    @FXML
    private Button E45;

    @FXML
    private Button E46;

    @FXML
    private Button E47;

    @FXML
    private Button E48;

    @FXML
    private Button E49;

    @FXML
    private Button E410;

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
                U11, U12, U13, U14, U15, U16, U17, U18, U19, U110,
                E01, E02, E03, E04, E05, E06, E07, E08, E09, E010,
                E11, E12, E13, E14, E15, E16, E17, E18, E19, E110,
                E21, E22, E23, E24, E25, E26, E27, E28, E29, E210,
                E31, E32, E33, E34, E35, E36, E37, E38, E39, E310,
                E41, E42, E43, E44, E45, E46, E47, E48, E49, E410
        };

        for (Button b : allButtons) {
            applyBaseColor(b);
            b.setOnAction(this::onClick);
        }

        levelSelector.getItems().setAll(
                "Alle Etagen",
                "Untergeschoss -1",
                "Etage 0",
                "Etage 1",
                "Etage 2",
                "Etage 3",
                "Etage 4"
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
                showRowU1();
                showRowE0();
                showRowE1();
                showRowE2();
                showRowE3();
                showRowE4();
                break;
            case "Untergeschoss -1":
                showRowU1();
                break;
            case "Etage 0":
                showRowE0();
                break;
            case "Etage 1":
                showRowE1();
                break;
            case "Etage 2":
                showRowE2();
                break;
            case "Etage 3":
                showRowE3();
                break;
            case "Etage 4":
                showRowE4();
                break;
        }

    }
    private void showRow(Button... buttons) {
        for (Button b : buttons) b.setVisible(true);
    }

    private void showRowU1() {
        showRow(U11, U12, U13, U14, U15, U16, U17, U18, U19, U110);
    }

    private void showRowE0() {
        showRow(E01, E02, E03, E04, E05, E06, E07, E08, E09, E010);
    }

    private void showRowE1() {
        showRow(E11, E12, E13, E14, E15, E16, E17, E18, E19, E110);
    }

    private void showRowE2() {
        showRow(E21, E22, E23, E24, E25, E26, E27, E28, E29, E210);
    }

    private void showRowE3() {
        showRow(E31, E32, E33, E34, E35, E36, E37, E38, E39, E310);
    }
    private void showRowE4() {
        showRow(E41, E42, E43, E44, E45, E46, E47, E48, E49, E410);
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
        double percent = (double) 100 / TOTAL_SPOTS * (TOTAL_SPOTS - free);
        double finalPercent = Math.round(percent * 100.0) / 100.0;

        anzeige.setText(
                "Freie Parkplätze: " + free + " von " + TOTAL_SPOTS +
                        "    |    Auslastung: " + finalPercent + " %"
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
