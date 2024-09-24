package Task1.Creational_DesignPattern.FactoryMethodPattern;

import java.util.Scanner;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;  // Boolean flag to control loop

        while (running) {
            System.out.println("Enter shape type (circle/rectangle) or 'exit' to quit:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                running = false;  // Set flag to false to exit loop
            } else {
                // Get the appropriate shape based on user input
                Shape shape = shapeFactory.getShape(input);
                if (shape != null) {
                shape.draw();
                } else {
                System.out.println("Invalid shape type. Please try again.");
                }
            }
        }

        scanner.close();
    }
}
