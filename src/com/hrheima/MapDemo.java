package com.hrheima;

import java.text.CollationElementIterator;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
       HashMap<String,String> hs=new HashMap<>();
       hs.put("sfs","fsdf");
       hs.put("ss","fsdf");
       hs.put("sf","fsdf");
        Set<String> keySet = hs.keySet();
        for(String key:keySet){
            String s = hs.get(key);
            System.out.println(s);
        }
    }
}
