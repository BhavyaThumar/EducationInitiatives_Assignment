package SatelliteCommandSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSatellite Control System:");
            System.out.println("1. Rotate Satellite");
            System.out.println("2. Activate Solar Panels");
            System.out.println("3. Deactivate Solar Panels");
            System.out.println("4. Collect Data");
            System.out.println("5. Get Satellite Status");
            System.out.println("6. Exit");

            System.out.print("Choose a command: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter direction (North, South, East, West): ");
                    String direction = scanner.nextLine();
                    Command rotateCommand = new RotateCommand(satellite, direction);
                    rotateCommand.execute();
                    break;
                case 2:
                    Command activatePanels = new SolarPanelCommand(satellite, true);
                    activatePanels.execute();
                    break;
                case 3:
                    Command deactivatePanels = new SolarPanelCommand(satellite, false);
                    deactivatePanels.execute();
                    break;
                case 4:
                    Command collectData = new CollectDataCommand(satellite);
                    collectData.execute();
                    break;
                case 5:
                    satellite.getStatus();
                    break;
                case 6:
                    System.out.println("Exiting Satellite Control System...");
                    satellite.getStatus();  // Print final status before exiting
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please choose again.");
            }
        }
    }
}
