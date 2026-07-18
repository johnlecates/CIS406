package courseProjectPhase1;

import java.util.Scanner;

/**
 * @author John LeCates
 * @date July 18, 2026
 * @version 1.0
 * Course: CIS406 - JAVA Programming I
 * Lab: Student Registration Lab
 */
public class StudentRegistration {

    public static void main(String[] args) {
        // Instantiate the Scanner object for console data entry
        Scanner input = new Scanner(System.in);
        
        // Display form title matching the sample layout
        System.out.println("Student Registration Form");
        
        // 1. & 2. Prompt for and accept first and last names
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        
        // 3. Prompt for and accept year of birth
        System.out.print("Enter year of birth: ");
        int birthYear = input.nextInt();
        
        System.out.println(); // Print a blank line to match sample output layout
        
        // 4. Concatenate the names to create the full name
        String fullName = firstName + " " + lastName;
        
        // 5. Generate the temporary password string
        String password = firstName + "*" + birthYear;
        
        // Output confirmation and credentials using the required labels
        System.out.println("Welcome " + fullName + "!");
        System.out.println("Your registration is complete.");
        System.out.println("Your temporary password is: " + password);
        
        // Close the scanner resource
        input.close();
    }
}
