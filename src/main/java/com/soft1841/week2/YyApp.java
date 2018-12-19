package com.soft1841.week2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class YyApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/main.fxml"));
        Scene scene = new Scene(root,1920,1020);
        scene.getStylesheets().add(YyApp.class.getResource("/css/style.css").toExternalForm());
        primaryStage.setTitle("QQ音乐");
        //窗口设置图标
        primaryStage.getIcons().add(new Image("/img/c.jpg"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
