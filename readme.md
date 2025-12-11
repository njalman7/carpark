# Projekt Carpark JavaFX Parkplatzverwaltung
* Das Programm mit Github verbunden
* Branch erstellt und freigegeben für collab
* Programm soll alle Ebenen zusammen anzeigen, aber auch jede Etage einzeln
### Funktionsübersicht:
* Parkplatzstatus per Klick ändern  
Jeder Parkplatz lässt sich frei/belegt schalten
* Farbcodiertes UI
    * Grün -> Frei
    * Rot -> Belegt
    * Gelb -> Hover-Effekt
* Etagenfilter  
Auswahl zwischen:
    * Alle Etagen
    * Untergeschoss -1
    * Etagen 0-4
* Live Auslastungsanzeige  
Zeigt freie Plätze, Gesamtkapazität & Auslastung in %
* 60 Parkplätze in übersichtlichter Struktur (U1,E0-4)

### Projektstruktur
CarPark/  
│
├── src/main/java/com/example/carpark/  
│   ├── CarParkController.java  
│   ├── Main.java  
│   └── ... weitere Dateien  
│  
└── src/main/resources/  
├── carpark.fxml  
└── application.css  
### Technische Details
#### Backend-Logik  
* Eine Map<String,Boolean> speichert den Zustand jedes Parkplatzes 
* Buttons repräsentieren Parkplätze und aktualisieren ihren Status dynamisch 
* Mouse-Hover und Klicks ändern die Farbe & Logik sofort

#### UI
* Implementiert mit JavaFX(FXML,Pane,Button,ComboBox,Label)
* Dynamisches Ein-/Ausblenden pro Etage
