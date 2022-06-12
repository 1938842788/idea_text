package com.hrheima.FileDemO;

import java.io.*;

public class CopyJpgDemp {
    public static void main(String[] args) throws IOException {
        FileInputStream fis =new FileInputStream("E:\\OIP-C.jpg");
        FileOutputStream fos=new FileOutputStream("idea_text\\mn.jpg");
File f1=new File("sdfd","jsif");

        int len;
        while((len=fis.read())!=-1){
            fos.write(len);

        }
        fis.close();
        fos.close();
    }
}
