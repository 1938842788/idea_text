package com.hrheima.doudizu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//        File f = new File("E:\\ruanjian\\hhh");
//        System.out.println(f.mkdirs());
//        File f1 = new File("E:\\ruanjian\\hhh\\java.txt");
//        System.out.println(f1.createNewFile());
//        FileOutputStream fos = new FileOutputStream(f1, true);
//        fos.write("ffdsfs\n\r".getBytes());
//        f1.delete();
//        fos.write("sfsfsd\n\rsgfdfsgdfg".getBytes());
        char[] bytes = "A".toCharArray();
        int a=bytes[0];
        System.out.println(a);
        System.out.println();
        FileInputStream fis=new FileInputStream("E:\\ruanjian\\hhh\\java.txt");
        byte[] arr=new byte[1024];
        int b;
        while ((b=fis.read(arr))!=-1) {
            System.out.println(new String(arr,0,b));
        }
    }
}
