import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test prettyHeader
        SafeInput.prettyHeader("MODULE 8 METHODS");

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(scanner, "Enter your name (try pressing enter blank first)");
        System.out.println("Returned name: " + name);

        // Test getInt
        int number = SafeInput.getInt(scanner, "Enter an integer (try typing abc first)");
        System.out.println("Returned integer: " + number);

        scanner.close();
    }
}