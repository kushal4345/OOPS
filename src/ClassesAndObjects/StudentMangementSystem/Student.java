package ClassesAndObjects.StudentMangementSystem;

import java.sql.SQLOutput;

public class Student {
    private String name;
    private int id;
    private int age;
    private String Course;

    Student(String name,int id,int age,String Course){
        this.name = name;
        this.id = id;
        this.age = age;
        this.Course = Course;
    }
    public int GetId(){
        return id;
    }
    public void setName(String name){
        if(name.length()<3){
            System.out.println("Enter valid name");
        }
        else{
        this.name = name;
        }
    }
    public String getName(){
         return name;
    }
    public int getAge(){
        return age;
    }
    public String Course(){
        return Course;
    }
    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age + " | Course: " + Course);
    }

}

