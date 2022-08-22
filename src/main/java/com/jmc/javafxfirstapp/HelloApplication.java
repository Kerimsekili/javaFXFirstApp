package com.jmc.javafxfirstapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        root.setSpacing(20);
        Label text = new Label("This is Label");
        Button button = new Button("Click Me");
        Button button1 = new Button("Exit Explicitly");
        button.setOnAction(e -> text.setText("Welcome to JavaFX Application !"));
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseEvent -> text.setText("Thank you for clicking the button!!"));
        root.getChildren().addAll(text, button, button1);
        Scene scene = new Scene(root, 350, 300);
        stage.setScene(scene);
        stage.setOnShowing(windowEvent -> System.out.println("Stage is showing"));
        stage.setTitle("JavaFX Application");
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Closing the Application");
    }

    public static void main(String[] args) {
        launch();
    }
}