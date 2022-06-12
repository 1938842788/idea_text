package com.hrheima.FileDemO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
           fos = new FileOutputStream("idea_text\\bos.txt");
       fos.write("hello000".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fos!=null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
