/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Abhiram, Madugula
 */
public class StudentGPA {
    /**Responsible for Implementing the Student GPA class
     */
       //private int sum = 0;
       private String studentFirstName;
       private String studentLastName;
       private int studentIdentificationNumber;
       private String javaGrade;
       private String adbGrade;
       private String webAppsGrade;
       private double GPA;
       
   public StudentGPA(String studentFirstName, String studentLastName, int studentIdentificationNumber, String javaGrade, String adbGrade, String webAppsGrade){ 
    /**Parameterized Constructor for Student GPA class
     * @param studentFirstName the command line arguments
     * @param studentLastName
     * @param studentIdentificationNumber
     * @param javaGrade
     * @param adbGrade
     * @param webAppsGrade 
     */ 
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentIdentificationNumber = studentIdentificationNumber;
        this.javaGrade = javaGrade;
        this.adbGrade = adbGrade;
        this.webAppsGrade = webAppsGrade;
    }

    public String getJavaGrade() {
     /**Getter method for Java Grade
     */ 
        return javaGrade;
    }

    public String getAdbGrade() {
     /**Getter method for Java Grade
     */    
        return adbGrade;
    }

    public String getWebAppsGrade() {
     /**Getter method for Java Grade
     */ 
        return webAppsGrade;
    }

    public String gradesToPoints(String grade){
     /**Method for conversion of Subject Grades to Grade Points
     * @param grade
     */
        String[] gradeGrid = {"Aa4", "Bb3", "Cc2", "Dd1", "Ff0"};
        for(int i=0; i<gradeGrid.length; i++){
            if (gradeGrid[i].contains(grade)){
                return gradeGrid[i].substring(2);
            }
        }
        System.out.println("Invalid input Grade. Hence returning zero");
        return "0";
        }
    public double calculateGPA(int javaGradePoints, int adbGradePoints, int webAppsGradePoints){
      /**Method to calculate Student Grade Point Average
     * @param javaGradePoints
     * @param adbGradePoints
     * @param webAppsGradePoints
     */ 
        
        this.GPA = 3.0 * (javaGradePoints + adbGradePoints + webAppsGradePoints)/9;
        return this.GPA;
    }

    @Override
    public String toString() {
        /**Method to represent object in the form of object
         * 
         */
        return "Student " + "named " + studentFirstName + " " + studentLastName + " bearing studentIdentificationNumber: " + studentIdentificationNumber + " obtained\n\tjavaGrade: " + javaGrade + "\n\tadbGrade: " + adbGrade + "\n\twebAppsGrade: " + webAppsGrade + "\nsecured GPA of: " + GPA;
    }
   
   

}
