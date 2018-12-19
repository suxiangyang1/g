package com.soft1841.week3;

public class Triangle extends Shape{
    public Triangle(){
        super();
    }
    public Triangle(double x,double y){
        super(x,y);
    }
    @Override
    public void show(){
        super.show();
        System.out.println("三角形面积是：");
    }
    @Override
    public double getArea() {
        return super.x*super.y*0.5;
    }
}
