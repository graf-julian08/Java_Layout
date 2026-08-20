# Java Layout Engine

## Übersicht
Die **Java Layout Engine** ist eine Desktop-Anwendung auf Maven-Basis zur Demonstration und Analyse verschiedener grafischer Layout-Manager in Java.

## Projektstruktur & Architektur
- `src/main/java/Main.java`: Hauptklasse zur Initialisierung der Benutzeroberfläche.
- `src/main/java/Launcher.java`: Starter-Klasse zur Entkopplung des Modulstarts.
- `pom.xml`: Maven-Konfigurationsdatei für Bau-Prozesse und Abhängigkeiten.
- `target/`: Generierter Bytecode und kompilierte `.class`-Dateien.

## Hauptfunktionalitäten
- **Layout-Demonstration**: Vergleich unterschiedlicher Java Swing/JavaFX Layout-Verhalten.
- **Saubere Trennung**: Verwendung einer Starter-Klasse zur Vermeidung von JavaFX-Laufzeitfehlern.
- **Standardisiertes Build-System**: Vollständige Verwaltung über Apache Maven.

## Ausführung & Nutzung
Kompilierung und Ausführung erfolgen über Maven mit `mvn clean compile exec:java`.

## Lizenz
Dieses Projekt steht under der MIT-Lizenz.
