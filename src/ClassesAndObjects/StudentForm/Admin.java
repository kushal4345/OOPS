package ClassesAndObjects.StudentForm;
import java.security.SecureRandom;
import java.util.HashMap;

public class Admin {
   private static HashMap<Integer,Student> map = new HashMap<>();

   // get student details using his id provided by clg

    void getStudentDetails(int id ){
        if(!map.containsKey(id)){
            System.out.println("Student details is not present in College database");
            return;
        }
        System.out.println("These are the details : \n Student -> " + map.get(id).getName() + "\n Class -> " + map.get(id).getclass() + "\n department -> " + map.get(id).getdepartmentName());
    }

    // set the student details and store into clg database

    boolean SetStudentDetails(int id ,String StudentName, String Class , String depart){
        if(StudentName.length()<3||Class.length()<2||depart.length()<2){
            System.out.println("Enter valid details in the given format");
        }
        else if(map.containsKey(id)){
            System.out.println("Student already registered");
        }
        else{
            Student student = new Student(id,StudentName,Class,depart);
            map.put(id,student);
            return true;
        }
  return false;
    }

    // taking admission

    int Admission(String StudentName , String Class , String depart){
        SecureRandom sr = new SecureRandom();
        int id = sr.nextInt(900000) + 100000;

        boolean success = SetStudentDetails(id, StudentName, Class, depart);
        if(!success){
            return -1; // admission failed
        }
        return id;
    }
    String changeDepartment(int id , String NewDept){
        if(!map.containsKey(id)){
            return " Student details not found";
        }
        Student s  =  map.get(id);
        s.setDepartment(NewDept);

      return s.getdepartmentName();
    }
}
