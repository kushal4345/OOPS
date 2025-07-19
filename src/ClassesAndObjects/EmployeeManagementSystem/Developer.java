package ClassesAndObjects.EmployeeManagementSystem;

public class Developer extends Employee {
    private static int hourlyRate = 2000;
    private int hoursWorked;

    public Developer(String name, int id, double salary ,int hoursWorked){
        super(name,id,salary);

        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalaray() {
        return super.getSalary() + hoursWorked*hourlyRate ;
    }
}
