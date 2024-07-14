
/**
 * Write a description of class StudentMarksStatistics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class StudentMarksStatistics
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //inputing assignment name
        System.out.print("Enter the assignment name: ");
        //saving the name
        String assignmentName = scanner.nextLine();
        
        //input student marks
        //int[] marks = new int[30]; //creating an array that holds 30 elements
        //for (int i = 0; i < 30; i++) {
        //    while (true) {
        //       System.out.print("Enter mark for student " + (i + 1) + " (0-30): ");
        //        String input = scanner.next();
        //        try {
        //            int mark = Integer.parseInt(input);
        //            if (mark >= 0 && mark <= 30) { //checking if the marks are between or equal to 0 and 30
        //                marks[i] = mark;
        //                break;
        //            } else {
        //                System.out.println("Invalid mark. Please enter a value between 0 and 30.");
        //            }
        //        } catch (NumberFormatException e) { //if its anything other than int type catch it and throw error
        //            System.out.println("Invalid input. Please enter a valid mark.");
        //        }
        //    }
        //}
        // Input student marks TESTING
        
        int[] marks = new int[4];
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.print("Enter mark for student " + (i + 1) + " (0-30): ");
                String input = scanner.next();
                try {
                    int mark = Integer.parseInt(input); //this make sure the user enters a string that is a integer
                    if (mark >= 0 && mark <= 4) {//checking if the marks are between or equal to 0 and 30
                        marks[i] = mark;//push the current input to the array
                        break;
                    } else {
                        System.out.println("Invalid mark. Please enter a value between 0 and 30.");
                    }
                } catch (NumberFormatException e) { //if its anything other than int type catch it and throw error
                    System.out.println("Invalid input. Please enter a valid mark.");
                }
            }
        }
        
        // Print assignment name and marks
        System.out.println("Assignment: " + assignmentName);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        if (marks.length > 0) { //checking if the user has not input any marks or not
            int minMark = calMinimum(marks); //calculate minimum
            System.out.println("Minimum marks: " + minMark);

        } else {
            System.out.println("No marks were entered.");
        }

        scanner.close();
    }
    
    private static int calMinimum(int[] marks) {
        int minMark = marks[0];
        for (int mark : marks) {//loop throught the array to find the lowest mark
            if (mark < minMark) {
                minMark = mark;
            }
        }
        return minMark;
    }
    
}
