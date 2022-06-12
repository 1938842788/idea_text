package com.hrheima;

import com.sun.deploy.services.Service;

import javax.annotation.processing.Completion;
import javax.crypto.SecretKey;
import javax.sound.midi.Sequencer;
import java.awt.*;
import java.io.Serializable;
import java.util.Comparator;

    public class Student  implements Serializable {

        private  String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void  setAge(int age) {
            this.age=age;
        }

        public int getAge() {
            return age;
        }



    }
