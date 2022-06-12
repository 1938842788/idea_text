package com.hrheima.doudizu;

public class DIGuiDemo01 {
    public static void main(String[] args) {
        int result=jc(5);
        System.out.println(result);
    }
    public static int jc(int n){
        if(n==1){
            return 1;
        }else {
            return n*jc(n-1);
        }
    }
}
