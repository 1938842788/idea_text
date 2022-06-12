package com;

import java.util.Arrays;

public class sdf {
    public static void main(String[] args) {
        byte[] bytes = "sdfs123123".getBytes();
        System.out.println(Arrays.toString(bytes));
        String s=new String(bytes,2,4);
        System.out.println(s);
    }
}
