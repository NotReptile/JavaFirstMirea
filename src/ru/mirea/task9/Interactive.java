package ru.mirea.task9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Collections;

public class Interactive extends Application {
    int x = 0,y = 0;
    String lastScorer = "";
    String winner = "";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        vbox.setAlignment(Pos.TOP_CENTER);
        hbox.setAlignment(Pos.BOTTOM_CENTER);
        Label label = new Label("Result 0 : 0" );
        Label label1 = new Label("Last Scorer: N/A" );
        Label label2 = new Label("Winner: DRAW");

        Button btnMilan = new Button();
        btnMilan.setText("Milan");
        Button btnMadrid = new Button();
        btnMadrid.setText("Madrid");
        btnMilan.setOnAction((ActionEvent event) -> {
            x++;
            lastScorer = "Milan";
            winLabel(label, label1, label2);
        });
        btnMadrid.setOnAction((ActionEvent event) -> {
            y++;
            lastScorer = "Madrid";
            winLabel(label, label1, label2);
        });

        btnMilan.setMaxWidth(Double.MAX_VALUE);
        btnMadrid.setMaxWidth(Double.MAX_VALUE);

        hbox.getChildren().addAll(btnMilan, btnMadrid);
        vbox.getChildren().addAll(label, label1, label2, hbox);

        Scene scene = new Scene(vbox, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void winLabel(Label label, Label label1, Label label2) {
        label.setText("Result " + x + " : " + y);
        label1.setText("Last Scorer: " + lastScorer);
        if (x > y){
            winner = "Milan";
            label2.setText("Winner: " + winner);
        }
        else if (x < y){
            winner = "Madrid";
            label2.setText("Winner: " + winner);
        }
        else{
            winner = "DRAW";
            label2.setText("Winner: " + winner);
        }
    }
}
