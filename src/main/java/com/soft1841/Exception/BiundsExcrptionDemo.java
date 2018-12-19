package com.soft1841.Exception;

import java.sql.SQLOutput;

/**
 * 数组下的越界异常
 */
public class BiundsExcrptionDemo {
    public static void main(String[] args) {
        int[] arrr ={1,2,3,4,5};
        try {
            for (int i = 0; i < arrr.length + 1; i++) {
                System.out.println("arr[i]" + "");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            //友好处理
            System.out.println("下标越界了=");
        }
    }
}
