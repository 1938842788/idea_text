package com.hrheim101;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter fos=new OutputStreamWriter("java.txt");
        FileOutputStream fos=new FileOutputStream("jva.txt",true);

        FileInputStream fis=new FileInputStream("jva.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
        osw.write("中国人");
        osw.write("中国人");
        osw.write("中国人");
        osw.write("中国人");
osw.flush();
       InputStreamReader isr=new InputStreamReader(fis,"GBK");
       int ch;
       while ((ch=isr.read())!=-1){
           System.out.print((char)ch);
       }


    }
}
