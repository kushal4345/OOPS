package ClassesAndObjects.StudentMangementSystem;
import java.sql.SQLOutput;
import java.util.*;
public class admin {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudentById(int id){
        if(id<0){
            System.out.println("Error pls Enter vaild Student Id");
        }
        else{
            students.removeIf(s -> s.GetId() == id);// remove student if student is exist in student list
        }
    }
    public void ViewAllStudent(){
        if(students.isEmpty()){
            System.out.println("There is no Student in your College Data");
            return;
        }
        else{
            for(Student s:students){  // display All the Student in you data
                s.displayStudent();
            }
        }
    }
    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.GetId() == id) return s;
        }
        return null;
    }

}
