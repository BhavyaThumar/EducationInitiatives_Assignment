package Task1.Structural_DesignPattern.FacadePattern;

import java.util.Scanner;

public class FacadePatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;  // Control loop

        while (running) {
            System.out.print("Type 'start' to boot the computer or 'exit' to quit: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("start")) {
                computer.start();
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                running = false;
            } else {
                System.out.println("Unknown command. Please try again.");
            }
        }

        scanner.close();
    }
}
