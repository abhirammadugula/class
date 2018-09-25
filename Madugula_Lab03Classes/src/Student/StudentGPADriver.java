/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.util.Scanner;

/**
 *
 * @author Abhiram, Madugula
 */
public class StudentGPADriver {

    /**Responsible for Driving the Student GPA class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /**Main method Responsible for Driving the Student GPA class
     * @param args the command line arguments
     */
        Scanner student = new Scanner(System.in);
        System.out.println("Enter Student Details");
        System.out.println("Enter Student first name:");
        String studentFirstName = student.next();
        System.out.println("Enter Student last name:");
        String studentLastName = student.next();
        System.out.println("Enter Student identification number:");
        int sudentIdentificationNumber = student.nextInt();
        System.out.println("Enter java grade:");
        String javaGrade = student.next();
        System.out.println("Enter adb grade:");
        String adbGrade = student.next();
        System.out.println("Enter webapp Grade:");
        String webAppsGrade = student.next();
        StudentGPA studentReference = new StudentGPA(studentFirstName, studentLastName, sudentIdentificationNumber, javaGrade, adbGrade, webAppsGrade);
        //studentReference.
        //System.out.println(grades.split(" "));
        int javaGradePoints = Integer.parseInt(studentReference.gradesToPoints(studentReference.getJavaGrade()));
        int adbGradePoints = Integer.parseInt(studentReference.gradesToPoints(studentReference.getAdbGrade()));
        int webAppsGradePoints = Integer.parseInt(studentReference.gradesToPoints(studentReference.getWebAppsGrade()));
        //For calculation following considerations were made A-4pts, B-3pts, C-2pts, D-1pt, F-0pt GPA = 3*(Sum of pts from 3 grades)/Total Credits
        double GPA = studentReference.calculateGPA(javaGradePoints, adbGradePoints, webAppsGradePoints);
        System.out.println(studentReference);
    }
    
}
