package com.hrheima;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo01 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String,String> map=new HashMap<>();
     map.put("张无忌","赵敏");
     map.put("郭靖","黄蓉");
     map.put("杨过","小龙女");
        Set<String> key = map.keySet();
        for(String s:key){
            String s1 = map.get(s);
            System.out.println(s+","+s1);
        }
        Set<Map.Entry<String, String>> entrys = map.entrySet();
        for(Map.Entry<String, String> key1:entrys){
            String key4 = key1.getKey();
            String value = key1.getValue();
            System.out.println(key4+","+value);
        }
//    System.out.println(map.remove("郭靖"));
//        System.out.println(map.remove("郭襄"));//删除建值对应的元素
//        map.clear();//清空所有建值和元素
//        System.out.println(map.containsKey("郭靖"));
//        System.out.println(map.containsKey("郭襄"));//判断集合中是否有建
      /*  System.out.println(map.containsValue("小龙女"));//判断集合中是否包含指定值//
        System.out.println(map.isEmpty() );//

        System.out.println(map.size());
        System.out.println(map);*/

//        System.out.println(map.get("张无忌"));//根据建获取值
//        System.out.println(map.get("张三丰"));//没有建返回null
   /*     Set<String>  keySet = map.keySet();//keySet获取所有建的集合Set
        for (String s: keySet){
            System.out.println(s);
        }*/
        /*Collection<String> values = map.values();//获取所有值的集合
        for (String s:values){
            System.out.println(s);
        }
*/
    }
}
