package practice2;

import practice1.Product;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private String hometown;
    private String classname;
    private String score;

    public Student() {
    }

    public Student(String id, String name, String hometown, String classname, String score) {
        this.id = id;
        this.name = name;
        this.hometown = hometown;
        this.classname = classname;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", classname='" + classname + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student o) {
        return this.score.compareTo(o.getScore());
    }
}
