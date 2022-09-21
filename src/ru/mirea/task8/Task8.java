package ru.mirea.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import ru.mirea.task7.Square;

public class Task8 extends Application
{
    Random random = new Random();
    int numberOfRows = 5;
    int numberOfColumns = 4;
    public void start(Stage primaryStage)
    {
        /*//List circles
        List<Circle> circles = new ArrayList();
        for (int i = 0; i < numberOfColumns * numberOfRows; i++) {
            circles.add(new Circle(50, getRandomColor()));
        }
        GridPane gridPane = new GridPane();
        addCirclesToGridPane(gridPane, circles);
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        //Button settings
        Button btn = new Button();
        btn.setText("Randomize!");
        btn.setOnAction((ActionEvent event) -> {
            Collections.shuffle(circles);
            for(int i = 0; i < numberOfColumns * numberOfRows; i++)
            {
                Circle c = circles.get(i);
                GridPane.setColumnIndex(c, i % numberOfColumns);
                GridPane.setRowIndex(c, i / numberOfColumns);
            }
        });
        VBox vBox = new VBox(gridPane, new StackPane(btn));
        vBox.setMaxSize(Control.USE_COMPUTED_SIZE, Control.USE_COMPUTED_SIZE);
        StackPane root = new StackPane(vBox);
        root.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        Scene scene = new Scene(root);

        //draw
        primaryStage.setTitle("Random Figures");
        primaryStage.setScene(scene);
        primaryStage.show();*/
        Group root = new Group();
        Scene scene = new Scene(root,800,800,Color.WHITE);
        Canvas canvas = new Canvas(800, 800);
        root.getChildren().add(canvas);
        primaryStage.setTitle("Random Figures!");
        primaryStage.setScene(scene);
        for (int i = 0 ; i < 5; i++){
            for ( int j = 0; j < 1; j++){
                //circle generation
                Circle circle = new Circle();
                circle.setCenterX(Math.random()*750+20);
                circle.setCenterY(Math.random()*750+20);
                circle.setRadius(Math.random()*50+20);
                circle.setFill(getRandomColor());
                //rectangle generation
                Rectangle rectangle = new Rectangle();
                rectangle.setWidth(Math.random()*100+20);
                rectangle.setHeight(Math.random()*100+20);
                rectangle.setX(Math.random()*700+20);
                rectangle.setY(Math.random()*700+20);
                rectangle.setFill(getRandomColor());
                //ellipse generation
                Ellipse ellipse = new Ellipse();
                ellipse.setCenterX(Math.random()*750+20);
                ellipse.setCenterY(Math.random()*750+20);
                ellipse.setFill(getRandomColor());
                ellipse.setRadiusX(Math.random()*100+20);
                ellipse.setRadiusY(Math.random()*100+30);
                //arc generation
                Arc arc = new Arc();
                arc.setCenterX(Math.random()*750+20);
                arc.setCenterY(Math.random()*750+20);
                arc.setRadiusX(Math.random()*300+50);
                arc.setRadiusY(Math.random()*300+20);
                arc.setLength(Math.random()*300+20);
                arc.setFill(getRandomColor());
                //generate figures
                root.getChildren().addAll(circle,rectangle,ellipse,arc);
            }
        }

        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }

    public Color getRandomColor()
    {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return Color.rgb(r, g, b);
    }
    public void addCirclesToGridPane(GridPane gridPane, List<Circle> circles)
    {
        for (int i = 0; i < numberOfColumns * numberOfRows; i++) {
            gridPane.add(circles.get(i), i % numberOfColumns, i / numberOfColumns);
        }
    }
}