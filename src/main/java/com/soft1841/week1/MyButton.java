package com.soft1841.week1;
/**
 * 自定义按钮
 */

import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;

public class MyButton extends Button {
    //自定义构造方法，实现一个指定宽和高和背景色定位按钮
    public MyButton(){
        this.setPrefSize(100,30);
        this.setStyle("-fx-background-color: rgb(52,103,132);");
    }

}
