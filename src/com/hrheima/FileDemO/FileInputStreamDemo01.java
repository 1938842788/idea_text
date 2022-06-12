package com.hrheima.FileDemO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        File f1=new File("idea_text\\bos.txt");
        FileInputStream fis = new FileInputStream("idea_text\\bos.txt");
        byte[] arr = new byte[1024];

        int read;
        while((read=fis.read(arr))!=-1){
            System.out.println(new String(arr,0,read));
        }
        System.out.println(read);
    }
}
