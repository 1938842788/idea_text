package com.hrheima.FileDemO;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("idea_text\\ddd");

        System.out.println(f1.mkdirs());
        System.out.println(f1.delete());
    }
}
