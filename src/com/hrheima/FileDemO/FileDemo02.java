package com.hrheima.FileDemO;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File f1=new File("idea_text\\java.txt");
        System.out.println(f1);
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getParent());
        System.out.println(f1.getName());
        System.out.println("-----------------");

        File f2=new File("E:");
        String[] StrArray = f2.list();
        for(String s:StrArray){
            System.out.println(s);
        }
        File[] fileArray = f2.listFiles();
        for(File file :fileArray){
        if(file.isFile()){
            System.out.println(file.getName());
        }
        }

    }
}
