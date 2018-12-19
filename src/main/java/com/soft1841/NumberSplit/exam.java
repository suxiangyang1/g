package com.soft1841.NumberSplit;
/**
 * 数字分割练习
 * 如88888 分割为88，888
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String nums = scanner.nextLine();
        StringBuffer str = new StringBuffer(nums);
        System.out.println("需要处理的字符串");
        System.out.println(str);
        //进行 逗号的处理
        for (int i=nums.length(); i>0;i=i-3){
            if (i>3){
                str.insert(i-3,',');
            }
        }
        System.out.println("str");

    }
}
