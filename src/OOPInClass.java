import java.util.Scanner;

public class OOPInClass {
    // Scanner object should be inside a method or a constructor
    Scanner input = new Scanner(System.in);

    // Inner class should not have parameters in its declaration
    public static class Student {
        // Constructor for Student class
        public Student(int rollNumber) {
            System.out.print("Student Id is 23058");
            System.out.println(rollNumber);
        }
    }

    public static void main(String[] args) {
        System.out.println("This program is running.");

        // Creating an instance of the Student class
        OOPInClass outerObject = new OOPInClass();
        Student Angkit =new Student(59);
//        OOPInClass.Student Angkit = outerObject.new Student(50);
    }
}
