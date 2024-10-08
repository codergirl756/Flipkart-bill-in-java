// Write a code for flipkart bill using string method..
import java.util.Scanner;

public class FlipkartBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input product details
        System.out.println("***Welcome to Flipkart!***");
        System.out.println("Enter the product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter the quantity of product: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ₹ ");
        double pricePerItem = scanner.nextDouble();
        scanner.close();

        // Calculate total cost before discount
        double totalCost = quantity * pricePerItem;

        // Apply a discount of 10% if total cost is above ₹1000
        double discount = 0;
        if (totalCost > 1000) {
            discount = 0.10 * totalCost;
        }
        double finalCost = totalCost - discount;

        // Use String.format to create a bill format
        String bill = String.format(
                "\n********** Flipkart Bill **********\n" +
                "Product: %s\n" +
                "Quantity: %d\n" +
                "Price per item: ₹ %.2f\n" +
                "Total cost (before discount): ₹ %.2f\n" +
                "Discount applied: ₹ %.2f\n" +
                "Final cost (after discount): ₹ %.2f\n" +
                "***********************************",
                productName, quantity, pricePerItem, totalCost, discount, finalCost
        );

        // Display the bill
        System.out.println("*** ThankYou for Shopping with Flipkart! Have a Nice Day...");
        System.out.println(bill);
        System.out.println("***Thanks for shopping with flipkart***");
    }
}
