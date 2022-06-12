package com.hrheima.IOdemo;


import java.io.*;
import java.util.Properties;

public class ObjectIODemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties Ps=new Properties();
        /*Ps.setProperty("1","dfsf");
        Ps.setProperty("2","s");
        Ps.setProperty("3","ssf");
        FileOutputStream fos=new FileOutputStream("pss",true);*/
        FileInputStream fis=new FileInputStream("pss");
//        Ps.store(fos,null);
        Ps.clone();
        Ps.load(fis);
        System.out.println(Ps);
    }
}
