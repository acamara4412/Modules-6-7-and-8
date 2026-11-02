/**
 * Student Name: Alpha Camra
 * Date: October 29, 2026
 * Module: Module 7 - Looping in Java
 * Purpose: Demonstrates various loop structures (for, while, do-while) and string character processing.
 */
public class LoopPractice {
    public static void main(String[] args) {

        // PART A: COUNTING AND STEPPING
        System.out.println("PART A: COUNTING AND STEPPING");

        // Print integers 1 through 20 on one line
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line

        // Print even integers 0 through 20 using i = i + 2
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // PART B: COUNTDOWN
        System.out.println("PART B: COUNTDOWN");
        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("Blast off!\n");

        // PART C: THREE GREETINGS
        System.out.println("PART C: THREE GREETINGS");
        int greetingCount = 0;
        boolean keepRunning = true;
        do {
            System.out.println("Hello");
            greetingCount++;
            if (greetingCount >= 3) {
                keepRunning = false;
            }
        } while (keepRunning);
        System.out.println();

        // PART D: STRING CHARACTERS
        System.out.println("PART D: STRING CHARACTERS");
        String word = "LOOP";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}