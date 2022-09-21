package ru.mirea.task8;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class Animation extends Application {
    Random random = new Random();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setX(250);
        rectangle.setY(250);
        rectangle.setFill(getRandomColor());

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(200));
        rotateTransition.setNode(rectangle);
        rotateTransition.setByAngle(90);
        rotateTransition.setCycleCount(1000);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();
        Group root = new Group(rectangle);
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("Rotating square!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public Color getRandomColor()
    {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return Color.rgb(r, g, b);
    }
}
