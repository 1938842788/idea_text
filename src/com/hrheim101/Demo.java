package com.hrheim101;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String s="f国dsafs";
       int c = s.charAt(1);
        System.out.println(c);
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

    }
}
