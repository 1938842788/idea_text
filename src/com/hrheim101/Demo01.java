package com.hrheim101;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("jaa"));
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("jaa"));

//        FileReader fr=new FileReader("java111");/*写数据输入*/
//
//        FileWriter fw=new FileWriter("java111");
        osw.write("阿斯顿");
        osw.close();

        int by1;
        while ((by1=isr.read())!=-1){
            System.out.println((char)by1);
        }
       isr.close();
        BufferedInputStream bfs=new BufferedInputStream(new FileInputStream("E:\\OIP-C.jpg"));
        BufferedOutputStream bis=new BufferedOutputStream(new FileOutputStream("mm.jpg",true));
        byte[] arr1 = "sfs是德国梵蒂冈".getBytes();



  /*      int by;
        while ((by=bfs.read())!=-1){
            bis.write(by);
        }
bfs.close();
        bis.close();
    }*/
       /* BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("java.txt"),"GBK"));
        String s;
        while ((s = br.readLine())!=null){
            System.out.println(s);
        }
*/
          /*  while((by=br.readLine()!=null)){
                System.out.println(by);
            }*/
       /* BufferedInputStream bis=new BufferedInputStream(new FileInputStream("java.txt"));
        byte[] arr=new byte[1024];
        int by;
        while((by=bis.read(arr))!=-1){
            System.out.print(new String(arr,0,by,"GBK"));
        }*/

       /* OutputStreamWriter ots=new OutputStreamWriter(new FileOutputStream("javavava.txt"),"GBK");
        ots.write("sfasdfasdffsafdasfadfwf21\n23423e他");
        ots.close();
        FileInputStream fis=new FileInputStream("javavava.txt");
        byte[]arr=new byte[1024];

        int by;
        while((by=fis.read(arr))!=-1){
            System.out.print(new);
        }
        fis.close();
*/
    }
}
