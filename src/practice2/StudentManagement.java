package practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManagement{
    private List<Student> students=new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void displayStudent()
    {
        for (Student student: students)
        {
            System.out.println(student.toString());
        }
    }
    public void editStudent(int index,Student student)
    {
        students.set(index,student);
    }
    public void removeStudent(int index)
    {
        students.remove(index);
    }
    public void sortStudent()
    {
        Collections.sort(students);


    }
}
