package Average;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        // Declare variables
        int x; // number of students
        float grade, sum = 0, Ava; // individual grade, sum of grades, average
        
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Print welcome message and prompt the user to enter the number of students
        System.out.println("Welcome to calculate the Average");
        System.out.println("Please enter the number of students:");
        x = input.nextInt();
        
        // Prompt the user to enter the grades of each student
        System.out.println("Please enter the grades of " + x + " students:");

        // Loop to iterate over each student
        int i = 0;
        while (i < x) {
            // Prompt the user to enter the grade of the current student
            System.out.println("Please enter the grade of student number " + (i + 1) + ":");
            grade = input.nextFloat(); // Read the grade
            sum += grade; // Add the grade to the sum
            i++; // Increment the student counter
        }
        
        // Calculate the average grade
        Ava = sum / x;
        
        // Print the average grade
        System.out.println("The Average = " + Ava);
        
        input.close();
    }    
}

