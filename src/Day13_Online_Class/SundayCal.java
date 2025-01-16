package Day13_Online_Class;

import java.util.Scanner;

public class SundayCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input starting day and number of days
        System.out.println("Enter the starting day of the week (1 for Sunday, 2 for Monday, ..., 7 for Saturday): ");
        int startingDay = sc.nextInt();

        System.out.println("Enter the number of days: ");
        int numDays = sc.nextInt();

        // Calculate total weeks and extra days
        int fullWeeks = numDays / 7;
        int extraDays = numDays % 7;

        // Count Sundays in full weeks
        int countSundays = fullWeeks;

        // Check for Sundays in extra days
        // If starting day + extra days surpasses a Sunday within the range
        for (int i = 0; i <= extraDays; i++) {
            int currentDay = (startingDay + i) % 7; // Modulo 7 gives the current day of the week
            if (currentDay == 1 || (startingDay == 1 && i == 0)) {
                countSundays++;
            }
        }

        System.out.println("Total number of Sundays: " + countSundays);
    }
}

