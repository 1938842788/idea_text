package com.hrheima.FileDemO;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        File f1=new File("idea_text");

        getAllFilePath(f1);


    }
    public static void getAllFilePath(File f1){
        File[] files = f1.listFiles();

        if(files!=null){
            for(File file:files){
                if(file.isDirectory()){
                    getAllFilePath(file);
                }else {
                    System.out.println(file.getAbsoluteFile());

                }
            }
        }
    }
}
