package Task1.Behavioral_DesignPattern.CommandPattern;

import java.util.Scanner;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        // Receiver
        Light livingRoomLight = new Light();

        // Concrete Commands
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();

        while (running) {
            System.out.println("Enter command (on/off/exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("on")) {
                remoteControl.setCommand(lightOnCommand);
                remoteControl.pressButton();
            } else if (input.equalsIgnoreCase("off")) {
                remoteControl.setCommand(lightOffCommand);
                remoteControl.pressButton();
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Unknown command, please try again.");
            }
        }

        scanner.close();
    }
}
