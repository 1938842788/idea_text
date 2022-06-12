package com.hrheima.FileDemO;



import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos=new FileOutputStream("idea_text\\bos.txt");
        BufferedOutputStream bos =new BufferedOutputStream(new FileOutputStream("idea_text\\bos.txt"));

        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("idea_text\\mmm.txt"));
        /*int by;
        while ((by=bis.read())!=-1){
            System.out.print((char)by);
        }*/
        byte[] bys=new byte[1024];
        int by;
        while((by=bis.read(bys))!=-1){
            bos.write(bys,0,by);
        }

        bis.close();
    }
}
