package com.hrheima;


import java.util.HashMap;
import java.util.Scanner;

public class CollectiosDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            Integer  value= hm.get(key);
            if(value==null){
                hm.put(key,1);
            }else{
                hm.put(key,++value);
            }
        }
        System.out.println(hm);

    }
}
