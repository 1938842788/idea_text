package com.hrheim101;



import java.io.*;

public class ConversionStreamDemo03 {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        OutputStreamWriter prw=new OutputStreamWriter(new FileOutputStream("javaaa.java"));
        InputStreamReader isr=new InputStreamReader(new FileInputStream("idea_text\\src\\com\\hrheim101\\ConversionStreamDemo.java"));
        BufferedReader f1=new BufferedReader(isr);
BufferedWriter bfw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("2342"),"UTF-8"));
        BufferedWriter f2=new BufferedWriter(prw);
        f2.newLine();

          char[] arr=new char[1024];
        int by;;
        while((by=isr.read(arr))!=-1){
            prw.write(arr,0,by);
//            prw.write(by);
            System.out.print(new String(arr,0,by));
        }
        isr.close();
        prw.close();
        long l1 = System.currentTimeMillis();
        long l2 = l1 - l;
        System.out.println(l2);
    }
}
