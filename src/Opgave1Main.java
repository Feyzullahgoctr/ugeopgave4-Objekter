import java.util.ArrayList;

public class Opgave1Main {


    public void findStudent(Student[] students ,String studentID) {
        for (Student s : students) {
            if (studentID.equals(s.getStudent())) {
                System.out.println("Found Student Name : " + s.getName() );
                return;
            }
        }
        System.out.println("There is no student with this ID :" + studentID);
    }


    void main() {


        Student student1 = new Student("Feyzullah", 37,"IBN-001");
        Student student2 = new Student("Sercan", 36,"IBN-002");
        Student student3 = new Student("Poyraz", 12,"IBN-003");
        Student student4 = new Student("Ela", 10,"IBN-004");

        Student[] students = {student1, student2, student3, student4};

        System.out.println("=== Alle Students ===");
        for (Student s : students) {
            s.printInfo();
            // System.out.println(s);  with toString
        }

        int maxAge = students[0].getAge();
        for (int i = 0; i < students.length; i++) {
            if (maxAge < students[i].getAge()) {
                maxAge = students[i].getAge();
            }
        }

        System.out.println("\nMax Age : " + maxAge);

        // Ekstra udfordring
        findStudent(students,"IBN-001");
        findStudent(students,"IBN-003");
        findStudent(students,"IBN-005");
        findStudent(students,"IBN-006");

    }



}
