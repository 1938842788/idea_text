package com.hrheima;


import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListDemp {
    public static void main(String[] args) {
        TreeSet<Student> arrlist = new TreeSet<Student>() ;
        Student s1 = new Student("林青霞", 23);
        Student s2 = new Student("王祖贤",43);
        Student s3 = new Student("张曼玉", 33);
        arrlist.add(s1);
        arrlist.add(s1);
        Iterator<Student> iterator = arrlist.iterator();
        while(iterator.hasNext()){
            Student next = iterator.next();
            System.out.println(next.getName());
        }


    }
}