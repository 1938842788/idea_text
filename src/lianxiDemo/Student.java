package lianxiDemo;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private String   dz;
    public Student() {
    }

    public Student(String name, int age, String dz) {
        this.name = name;
        this.age = age;
        this.dz = dz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDz() {
        return dz;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dz='" + dz + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(dz, student.dz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dz);
    }

    @Override
    public int compareTo(Student o) {
        int number=this.age-o.getAge();
        return number;
    }
}
