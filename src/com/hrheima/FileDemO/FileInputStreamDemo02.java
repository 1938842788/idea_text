package com.hrheima.FileDemO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fos=new FileInputStream("idea_text\\bos.txt");
        FileOutputStream fis=new FileOutputStream("idea_text\\java.txt");

        int read;
        while((read = fos.read())!=-1){
            fis.write(read);
        }
    }
}
