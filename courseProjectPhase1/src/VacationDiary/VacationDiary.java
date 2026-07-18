package vacationdiary1;

import java.util.Scanner;

/**
 * @author John LeCates
 * @date July 18, 2026
 * @version 1.0
 * Course: CIS406 - JAVA Programming I
 * Lab: Vacation Diary Part 1
 */
public class VacationDiary1 {

    public static void main(String[] args) {
        // Instantiate the Scanner object for console data entry
        Scanner input = new Scanner(System.in);
        
        // Title
        System.out.println("Vacation Diary");
        
        // 1. Prompt for and accept vacation date
        System.out.print("Enter Date Vacation Started (mm/dd/yyyy): ");
        String startDate = input.nextLine();
        
        // 2. Prompt for and accept city
        System.out.print("Enter City Visited: ");
        String city = input.nextLine();
        
        // 3. Prompt for and accept country
        System.out.print("Enter Country Visited: ");
        String country = input.nextLine();
        
        // 4. Prompt for and accept number of days
        System.out.print("Enter number of days: ");
        int days = input.nextInt();
        
        // Consume the leftover newline character after reading the integer
        input.nextLine();
        
        // 5. Prompt for and accept mode of travel
        System.out.print("Enter Mode of Travel (car, airplane, ship, train, bus): ");
        String travelMode = input.nextLine();
        
        System.out.println(); // Blank line for output formatting
        
        // Output trip details exactly as formatted in the sample results
        System.out.println("Details of your trip:");
        System.out.println("Date: " + startDate);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Number of Days: " + days);
        System.out.println("Traveled By: " + travelMode);
        System.out.println("Bye!!!");
        
        // Close the scanner resource
        input.close();
    }
}
