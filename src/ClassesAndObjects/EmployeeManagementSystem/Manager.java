package ClassesAndObjects.EmployeeManagementSystem;

public class Manager extends Employee {
    private int Bonus;
    public Manager(String name, int id, double BaseSalary,int Bonus){
        super(name,id,BaseSalary);  // pass the parameter to the parent class
        this.Bonus = Bonus;   // add bonus
    }

    @Override
    public double calculateSalaray() { // calculate the salary of the emp according to their designation
        return getSalary() + Bonus;
    }
}
