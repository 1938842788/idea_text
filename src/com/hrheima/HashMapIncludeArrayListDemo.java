package com.hrheima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapIncludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> hm=new HashMap<String, ArrayList<String>>();
        ArrayList<String> sgyy=new ArrayList<>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        hm.put("三国演义",sgyy);
         ArrayList<String>xyj=new ArrayList<>();
        xyj.add("孙悟空");
        xyj.add("猪八戒");
        hm.put("西游记",xyj);
         ArrayList<String> sfz=new ArrayList<>();
        sfz.add("鲁智深");
        System.out.println(  sfz.add("武松"));
        hm.put("水浒传",sfz);

        Set<String> keySet = hm.keySet();
        for(String key:keySet){
            ArrayList<String> value = hm.get(key);
            System.out.println(key);
            for(int i=0;i<value.size();i++){
                String s = value.get(i);
                System.out.println(s);
            }


        }
    }
}
