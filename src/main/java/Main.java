import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {
        Application.launch(MainApp.class, args);
    }

    public static class MainApp extends Application {
        @Override
        public void start(Stage stage) {

            // Nr 1
            HBox hbox1 = new HBox();
            hbox1.getChildren().add(new Button("Button 1"));
            hbox1.getChildren().add(new Button("Button 2"));

            VBox vbox1 = new VBox();
            vbox1.getChildren().add(new Button("Button 3"));
            vbox1.getChildren().add(new Button("Button 4"));

            VBox innerVBox = new VBox();
            innerVBox.getChildren().add(new Button("Inner VBox"));
            hbox1.getChildren().add(innerVBox);

            HBox innerHBox = new HBox();
            innerHBox.getChildren().add(new Button("Inner HBox"));
            vbox1.getChildren().add(innerHBox);

            HBox root1 = new HBox(20);
            root1.getChildren().add(hbox1);
            root1.getChildren().add(vbox1);
            Scene scene1 = new Scene(root1, 500, 300);

            // Nr 2
            BorderPane root2 = new BorderPane();
            root2.setPadding(new Insets(10, 20, 20, 20));
            TextArea text1 = new TextArea();
            BorderPane.setMargin(text1, new Insets(10, 10, 10, 10));
            root2.setTop(new Button("Oben"));
            root2.setBottom(new Button("Unten"));
            root2.setLeft(new Button("Links"));
            root2.setRight(new Button("Rechts"));
            root2.setCenter(text1);
            Scene scene2 = new Scene(root2, 550, 250);

            // Nr 3
            StackPane root3 = new StackPane();
            root3.getChildren().add(new Circle(100));
            root3.getChildren().add(new Sphere(50));
            root3.getChildren().add(new Text("Text"));
            Scene scene3 = new Scene(root3, 300, 300);

            // Nr 4
            GridPane root4 = new GridPane();
            root4.setGridLinesVisible(true);
            root4.setPadding(new Insets(20));
            root4.setHgap(10);
            root4.setVgap(10);
            root4.setPrefSize(400, 300);

            Label lab1 = new Label("Oben Links");
            GridPane.setMargin(lab1, new Insets(10));
            lab1.setPrefSize(150, 100);

            root4.add(lab1, 0, 0);
            root4.add(new Button("Oben Rechts"), 1, 0);
            root4.add(new Button("Unten Links"), 0, 1);
            root4.add(new Button("Unten Rechts"), 1, 1);
            Scene scene4 = new Scene(root4, 500, 400);

            // Nr 5
            GridPane root5 = new GridPane();
            root5.setPadding(new Insets(10));
            root5.setHgap(10);
            root5.setVgap(10);
            root5.add(new Label("To:"), 0, 0);
            root5.add(new TextField(), 1, 0);
            root5.add(new Label("Cc:"), 0, 1);
            root5.add(new TextField(), 1, 1);
            root5.add(new Label("Subject:"), 0, 2);
            root5.add(new TextField(), 1, 2);
            root5.add(new TextArea(), 0, 3, 2, 1);
            root5.add(new Button("Send"), 1, 4);
            Scene scene5 = new Scene(root5, 500, 400);

            // Nr 6
            FlowPane flow = new FlowPane();
            flow.getChildren().add(new Button("Flow 1"));
            flow.getChildren().add(new Button("Flow 2"));
            TilePane tile = new TilePane();
            tile.getChildren().add(new Button("Tile 1"));
            tile.getChildren().add(new Button("Tile 2"));
            VBox layout6 = new VBox(20);
            layout6.getChildren().add(flow);
            layout6.getChildren().add(tile);
            ScrollPane root6 = new ScrollPane();
            root6.setContent(layout6);
            Scene scene6 = new Scene(root6, 400, 300);

            // Nr 7
            BorderPane root7 = new BorderPane();
            root7.setPadding(new Insets(10));
            VBox centerBox = new VBox(10);
            HBox row1 = new HBox(10);
            row1.getChildren().add(new Label("Vorname:"));
            row1.getChildren().add(new TextField());
            HBox row2 = new HBox(10);
            row2.getChildren().add(new Label("Nachname:"));
            row2.getChildren().add(new TextField());
            HBox row3 = new HBox(10);
            row3.getChildren().add(new Label("Email:"));
            row3.getChildren().add(new TextField());
            centerBox.getChildren().add(row1);
            centerBox.getChildren().add(row2);
            centerBox.getChildren().add(row3);
            root7.setCenter(centerBox);
            HBox bottomBox = new HBox(10);
            bottomBox.getChildren().add(new Button("Speichern"));
            bottomBox.getChildren().add(new Button("Abbrechen"));
            root7.setBottom(bottomBox);
            Scene scene7 = new Scene(root7, 400, 300);

            // Nr 8
            GridPane root8 = new GridPane();
            root8.setPadding(new Insets(10));
            root8.setHgap(10);
            root8.setVgap(10);
            root8.add(new Label("Vorname:"), 0, 0);
            root8.add(new TextField(), 1, 0);
            root8.add(new Label("Nachname:"), 0, 1);
            root8.add(new TextField(), 1, 1);
            root8.add(new Label("Email:"), 0, 2);
            root8.add(new TextField(), 1, 2);
            HBox gridButtons = new HBox(10);
            gridButtons.getChildren().add(new Button("Speichern"));
            gridButtons.getChildren().add(new Button("Abbrechen"));
            root8.add(gridButtons, 1, 3);
            Scene scene8 = new Scene(root8, 400, 300);

            int activeScene = 7;

            switch (activeScene) {
                case 1:
                    stage.setScene(scene1);
                    break;
                case 2:
                    stage.setScene(scene2);
                    break;
                case 3:
                    stage.setScene(scene3);
                    break;
                case 4:
                    stage.setScene(scene4);
                    break;
                case 5:
                    stage.setScene(scene5);
                    break;
                case 6:
                    stage.setScene(scene6);
                    break;
                case 7:
                    stage.setScene(scene7);
                    break;
                case 8:
                    stage.setScene(scene8);
                    break;
            }

            stage.show();
        }
    }
}
