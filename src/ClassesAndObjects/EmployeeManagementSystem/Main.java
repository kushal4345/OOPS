package ClassesAndObjects.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee m1 = new Manager("Kushal Sharma", 101, 50000, 10000);
        Employee d1 = new Developer("Priya Verma", 102, 40000, 10);

        PayrollSystem payroll = new PayrollSystem();
        payroll.processSalary(m1);
        payroll.processSalary(d1);
    }
}
