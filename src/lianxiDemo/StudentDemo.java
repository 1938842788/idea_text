package lianxiDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;

public class StudentDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();
        Student s1 = new Student("林青霞", 23, "湖北荆州");
        Student s2 = new Student("风清扬", 99, "湖北咸宁");
        Student s3 = new Student("张曼玉", 45, "湖北宜昌");
        array.add(s1);
        array.add(s2);
        array.add(s3);
        Collections.sort(array);
        System.out.println(array);
        PrintStream ps=new PrintStream("idea_text\\ps.txt");
        for(Student s4:array){
            ps.println(s4.getName()+s4.getAge()+s4.getDz());
            ps.flush();
        }
    }
}
