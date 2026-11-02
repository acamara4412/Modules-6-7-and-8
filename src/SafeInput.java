/**
 * Student Name: Alpha Camra
 * Date: October 29, 2026
 * Module: Module 8 - Java Methods (SafeInput Library)
 * Purpose: Provides reusable static input validation and formatting methods.
 */
import java.util.Scanner;

public class SafeInput {

    /**
     * Prompts the user for a non-zero length string.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the prompt message for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * Prompts the user for a valid integer with error checking.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt the prompt message for the user
     * @return a valid integer entered by the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear newline fix
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }
        } while (!done);
        return retVal;
    }

    /**
     * Prints a 3-line pretty header that is 60 characters wide with a centered message.
     *
     * @param msg the message to center in the header
     */
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int sideStarsLen = 3;
        int innerWidth = totalWidth - (sideStarsLen * 2); // 54 characters available

        // Print top row of asterisks using a loop
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Calculate spacing for centering the message
        int msgLen = msg.length();
        int totalSpaces = innerWidth - msgLen;
        int leftSpaces = totalSpaces / 2;
        int rightSpaces = totalSpaces - leftSpaces;

        // Print middle row
        System.out.print("***");
        for (int i = 0; i < leftSpaces; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpaces; i++) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print bottom row of asterisks using a loop
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}