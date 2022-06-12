package com.hrheima;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 30);
        Student s3 = new Student("王祖贤", 33);
        System.out.println( map.put("ithrima00", s1));
        map.put("ithrima002", s2);
        map.put("ithrima003", s3);
        Set<String> keyset = map.keySet();
        for(String key: keyset){
            Student value = map.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
        StringBuffer s24=new StringBuffer();

        Set<Map.Entry<String, Student>> entries = map.entrySet();
        for(Map.Entry<String, Student> me:entries){
            Student value = me.getValue();
            String key = me.getKey();
            System.out.println(key+","+value.getName()+value.getAge());
        }
    }
}
