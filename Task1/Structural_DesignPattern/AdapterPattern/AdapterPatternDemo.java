package Task1.Structural_DesignPattern.AdapterPattern;

import java.util.Scanner;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;  // Control loop

        while (running) {
            System.out.print("Enter the type of media (mp3/mp4) or 'exit' to quit: ");
            String audioType = scanner.nextLine();

            if (audioType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                running = false;
                break;
            }

            System.out.print("Enter the file name: ");
            String fileName = scanner.nextLine();

            audioPlayer.play(audioType, fileName);
        }

        scanner.close();
    }
}
