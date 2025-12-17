package ClassesAndObjects.StudentForm;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String Class;
    private String department;


    Student(int id , String name, String Class , String department){
        this.id = id;
        this.name = name;
        this.Class = Class;
        this.department = department;
    }
    String getName(){
        return name;
    }
    String getclass(){
        return Class;
    }

  String getdepartmentName(){
        return department;
  }
  void setDepartment(String department){
        this.department = department;
  }
}
