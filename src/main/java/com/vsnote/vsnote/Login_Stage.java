package com.vsnote.vsnote;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login_Stage {
    public Login_Stage(Stage stage) {

        VBox vBoxLayout = new VBox();
        Label usernameLabel = new Label("Username");
        Label passwordLabel = new Label("Password");
        Button loginButton = new Button("Log in");
        Button testLoginButton = new Button("Test log in");
        TextField usernameTextField = new TextField();
        PasswordField passwordTextField = new PasswordField();
        HBox hBoxLayout = new HBox();
        hBoxLayout.setSpacing(50);
        hBoxLayout.setAlignment(Pos.CENTER);

        vBoxLayout.getChildren().add(usernameLabel);
        vBoxLayout.getChildren().add(usernameTextField);
        vBoxLayout.getChildren().add(passwordLabel);
        vBoxLayout.getChildren().add(passwordTextField);
        vBoxLayout.getChildren().add(hBoxLayout);
        hBoxLayout.getChildren().add(loginButton);
        hBoxLayout.getChildren().add(testLoginButton);

        Scene loginScene = new Scene(vBoxLayout, 350, 350);
        stage.setScene(loginScene);
        stage.show();
    }
}
