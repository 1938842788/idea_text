package com.hrheima.FileDemO;

public class fneshuDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher() {
            @Override
            public void get(int age) throws Exception {
                if (age > 100 || age < 0) {
                    throw new Exception();
                } else {
                    System.out.println(age);
                }
            }
        };
        try {
            teacher.get(123);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
