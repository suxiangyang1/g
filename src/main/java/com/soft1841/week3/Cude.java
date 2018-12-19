package com.soft1841.week3;

public final class Cude extends Rectangle{
    private double height;
    public Cude(){
    }
    public Cude(double x, double y, double height){
        super(x, y);
        this.height =height;
    }
    public double getVolumn(){
       return super.getArea()*this.height;
    }

}
