package com.hrheim101;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ConversionStreamDemo01 {
    public static void main(String[] args) throws IOException {
       /* OutputStreamWriter osr=new OutputStreamWriter(new FileOutputStream("java"));
        char[]arr={'2','3','3'};
        osr.write(arr,0,2);
        osr.close();*/
//        BufferedOutputStream bfs=new BufferedOutputStream(new FileOutputStream("java",true));
//        bfs.write("他们".getBytes());
//        bfs.flush();
//        osr.write(97);
//        osr.flush();
//        FileOutputStream fo=new FileOutputStream("java");
//        fo.write("sdfso".getBytes());
      /*  BufferedInputStream bis=new BufferedInputStream(new FileInputStream("java"));
        byte[] arr=new byte[1024];
        int by;
        while ((by=bis.read(arr))!=-1){
            System.out.print(new String(arr,0,by));
        }*/
       InputStreamReader isr=new InputStreamReader(new FileInputStream("java"));
      /* int by;
       while((by=isr.read())!=-1){

           System.out.println(by);
       }*/
        char[] chs=new char[1024];
        int by;
        while((by=isr.read(chs))!=-1){
            System.out.println(new String(chs,0,by));
        }
        isr.close();

    }
}
