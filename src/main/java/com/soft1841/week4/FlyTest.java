package com.soft1841.week4;

public class FlyTest {
    public static void main(String[] args) {
        //通过接口回调，创建一个Plane的实例给接口变量
    Fly fly = new Plane("波音747",940.0);
//通用fly（）方法，输出飞机的飞行信息
        System.out.println(fly.fly());
                //通过接口回调，创建一个Bird的实例给接口变量
                Fly fly11= new Plane("老鹰",80.8);
                //调用fly()方法，输出飞禽的飞行信息
                System.out.println(fly11.fly());
                }
                }
