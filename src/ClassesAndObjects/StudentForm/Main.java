package ClassesAndObjects.StudentForm;

public class Main {
    public static void main(String[] args) {
    Admin Mukesh = new Admin();
   int id =  Mukesh.Admission("Aman","Mba","Accounting");
        System.out.println(id);
        Mukesh.getStudentDetails(841899);
    }
}
