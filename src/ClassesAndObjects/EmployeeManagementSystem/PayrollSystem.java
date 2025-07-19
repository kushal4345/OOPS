package ClassesAndObjects.EmployeeManagementSystem;



public class PayrollSystem {
    public void processSalary(Employee emp) {
        emp.DisplayInfo();
        System.out.println("Salary: " + emp.calculateSalaray());
        System.out.println("--------");
    }
}
