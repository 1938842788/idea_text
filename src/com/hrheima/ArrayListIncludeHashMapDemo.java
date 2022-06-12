package com.hrheima;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> arr=new ArrayList<>();
        HashMap<String,String> hm1=new HashMap<>();
        hm1.put("孙策","大乔");
        hm1.put("周瑜","小乔");
        HashMap<String,String> hm2=new HashMap<>();
        hm2.put("郭靖","黄蓉");
        hm2.put("杨过","小龙女");
        HashMap<String,String> hm3=new HashMap<>();
        hm3.put("令狐冲","任盈盈");
        hm3.put("林平之","岳灵珊");
        arr.add(hm1);
        arr.add(hm2);
        arr.add(hm3);

            for(int i=0;i<arr.size();i++){
                HashMap<String, String> hm = arr.get(i);
                Set<String> keyset = hm.keySet();
                for(String s:keyset){
                    String value = hm.get(s);
                    System.out.println(s+","+value);


                }
            }

    }
}
