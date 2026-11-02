import java.util.Scanner;

public class PizzaTotalCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // 1. INPUT
        System.out.print("Enter the pizza price: $");
        double price = scanner.nextDouble();

        System.out.print("Enter the tax rate as a decimal (e.g., 0.07): ");
        double taxRate = scanner.nextDouble();

        // 2. PROCESSING
        double tax = price * taxRate;
        double total = price + tax;

        // 3. OUTPUT
        System.out.println("\n--- Pizza Order Summary ---");
        System.out.printf("Pizza price: $%.2f | Tax: $%.2f | Final price: $%.2f\n", price, tax, total);

        scanner.close();
    }
}