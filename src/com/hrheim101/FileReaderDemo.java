package com.hrheim101;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader f1=new FileReader("javaaa.java");
        FileWriter f2=new FileWriter("jva.txt");
        BufferedWriter f3=new BufferedWriter(f2);
BufferedReader f4=new BufferedReader(f1);
     int by;
     while ((by=f1.read())!=-1){
         f2.write(by);
     }
     f2.close();
    }
}
