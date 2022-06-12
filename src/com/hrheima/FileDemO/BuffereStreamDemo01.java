package com.hrheima.FileDemO;



import java.io.*;
import java.util.Collections;

public class BuffereStreamDemo01 {
    public static void main(String[] args) throws IOException {
     getBuff("idea_text\\mmm.txt");

    }
    public static void getBuff(String s1) throws IOException {

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(s1));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("idea_text\\nn.txt"));
        byte[] arr=new byte[1024];
        int by;
        while((by=bis.read(arr))!=-1) {
           bos.write(arr,0,by);
        }
        bis.close();
        bos.close();
    }
}
