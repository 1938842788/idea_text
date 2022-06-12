package com.hrheim101;



import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class FileInputStreaDemo {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();

        FileOutputStream fis=new FileOutputStream("java.txt");
        fis.write("helloworld中国".getBytes("GBK"));
        fis.write("helloworld中国".getBytes("GBK"));
        fis.write("helloworld中国".getBytes("GBK"));
fis.close();
        FileInputStream fos=new FileInputStream("java.txt");
        byte[]arr=new byte[1024];
        int by;
        while((by=fos.read(arr))!=-1){
            System.out.print(new String(arr,0,by,"GBK"));
        }

//fos.close();
        long l1 = System.currentTimeMillis();
        long l2 = l1 - l;
        System.out.println();
        System.out.println(l2);

    }
}
