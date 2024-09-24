package Task1.Creational_DesignPattern.SingletonPattern;

import java.util.Scanner;

public class SingletonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;  // Boolean flag to control loop

        while (running) {
            System.out.println("Type 'get' to retrieve the Singleton instance or 'exit' to quit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("get")) {
                // Access Singleton instance
                Singleton singleton = Singleton.getInstance();
                singleton.showMessage();
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                running = false;  // Set flag to false to exit loop
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }

        scanner.close();
    }
}
