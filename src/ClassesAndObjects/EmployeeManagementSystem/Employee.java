package ClassesAndObjects.EmployeeManagementSystem;
import java.util.*;
public class Employee {
    private String name;
    private int id;
    private double BaseSalary;

    public Employee(String name, int id, double BaseSalary) {
        this.name = name;
        this.id = id;
        this.BaseSalary = BaseSalary;
    }

    public String getName(){return name;}
    public int getId(){return id;}

    public double getSalary(){
         return BaseSalary;                         // salary of the employee
    }
    public double calculateSalaray(){
        return BaseSalary;
    }

    public void DisplayInfo(){
        System.out.println("name" + name + "\n" + "id" +  id);
    }
}

