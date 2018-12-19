package com.soft1841.week3;

public class ShapeTest {
    public static void main(String[] args) {
       Shape shape = new Triangle(4.0,3.0);
        System.out.println("三角形面积是：" + shape.getArea());
        Shape shape1 = new Triangle(4.0,3.0);
        System.out.println("矩形面积是：" + shape1.getArea());
        Cude cude = new Cude(4.0,3.0,2.0);


        System.out.println("立方体积是：" +cude.getVolumn());
    }
}
