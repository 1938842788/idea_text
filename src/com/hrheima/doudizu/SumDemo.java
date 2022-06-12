package com.hrheima.doudizu;

public class SumDemo {
    public static void main(String[] args) {
        int f = f(20);
        System.out.println(f);

    }

        public static int f(int n){//递归求解问题，把一个复杂的问题简单化，用最少的代码求解问题
        if(n==1||n==2){//递归必须有出口，不能溢出
            return 1;
        }else {
            return f(n - 1) + f(n - 2);
        }
        }

}
