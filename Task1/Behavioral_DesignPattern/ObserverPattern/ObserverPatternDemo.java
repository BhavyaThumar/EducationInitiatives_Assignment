package Task1.Behavioral_DesignPattern.ObserverPattern;

import java.util.Scanner;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Stock Price Notifier!");
        System.out.print("Enter the number of investors to add: ");
        int numInvestors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < numInvestors; i++) {
            System.out.print("Enter name of investor " + (i + 1) + ": ");
            String name = scanner.nextLine();
            stock.addObserver(new Investor(name));
        }

        while (true) {
            System.out.print("Enter new stock price (or type 'exit' to quit): ");
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting the Stock Price Notifier...");
                break;
            }
            try {
                float price = Float.parseFloat(input);
                stock.setPrice(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price. Please enter a numeric value.");
            }
        }

        scanner.close();
    }
}
