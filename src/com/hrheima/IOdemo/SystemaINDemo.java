package com.hrheima.IOdemo;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.FieldPosition;
import java.util.Arrays;


public class SystemaINDemo {


    public static void main(String[] args) throws IOException {
        File f1=new File("E:\\itcact\\hhh.txt");
        File f2=new File("idea_text");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f2));
             BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f1));
            byte[] arr=new byte[1024];
            int by;
            while ((by=bis.read(arr))!=-1){
                bos.write(arr,0,by);
            }

bos.close();
            bis.close();

       /* IOfile(f1,f2);

    }*/}
    public static void  IOfile(File srcFile,File deFolder) {
       /* File[] files = srcFile.listFiles();
        if(files!=null){
        for(File file:files) {
            if (file.isDirectory()) {
                File deFile = new File(deFolder, file.getName());
                deFile.mkdir();
                IOfile(file, deFile);
            } else {

                IOget(file, deFolder);
            }
        }

        }*/
        IOget(srcFile, deFolder);
    }
  public static void IOget(File srcFile,File deFile) {


      try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(srcFile));
           BufferedInputStream bis = new BufferedInputStream(new FileInputStream(deFile))){
          byte[] arr=new byte[1024];
          int by;
          while ((by=bis.read(arr))!=-1){
              bos.write(arr,0,by);
          }


      }catch(IOException e){
          e.printStackTrace();
      }
  }
    }

