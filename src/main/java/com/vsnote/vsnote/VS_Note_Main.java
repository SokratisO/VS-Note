package com.vsnote.vsnote;

import javafx.application.Application;
import javafx.stage.Stage;

public class VS_Note_Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Login_Stage login_stage = new Login_Stage(stage);
    }
}
