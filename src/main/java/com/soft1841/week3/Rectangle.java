package com.soft1841.week3;

public class Rectangle extends Shape {
    public Rectangle(){
        super();
    }
    public Rectangle(double x ,double y){
        super.x = x;
        super.y =y;
    }

    @Override
    public double getArea() {
        return super.x*super.y;
    }
}
