package application;

import entities.Student;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Name: ");
        student.setName(scanner.nextLine());

        System.out.println("Grade 1: ");
        student.setGrade1(scanner.nextDouble());

        System.out.println("Grade 2: ");
        student.setGrade2(scanner.nextDouble());

        System.out.println("Grade 3: ");
        student.setGrade3(scanner.nextDouble());

        System.out.printf("FINAL GRADE = %.2f", student.finalGrade());
            if(student.finalGrade() < 60) {
                System.out.println("\nFAILED");
                System.out.printf("MISSING %.2f POINTS", student.missingPoints());


            }else {
                System.out.println("\nPASS");

            }



    }

}
