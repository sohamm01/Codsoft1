package task2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int numSubjects = 5;
        int totalMarks = 0;
 
        System.out.println("Enter marks out of 100 for the following subjects:");
 
        
        for (int i = 0; i < numSubjects; i++) {
            switch (i) {
                case 0:
                    System.out.print("CS: ");
                    break;
                case 1:
                    System.out.print("Elect: ");
                    break;
                case 2:
                    System.out.print("M3: ");
                    break;
                case 3:
                    System.out.print("DC: ");
                    break;
                case 4:
                    System.out.print("Java: ");
                    break;
            }
            int marks = scanner.nextInt();
            totalMarks += marks;
        }
 
        
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
 
        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade ='F';
        }
 
     
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);
    }
    
}
