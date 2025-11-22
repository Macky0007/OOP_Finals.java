
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileHandling {
    public void saveAdopter(Adopter adopter) {
        try {
            FileWriter writer = new FileWriter("ADOPTER.txt", true); // true = append mode
            writer.write(adopter.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving client: " + e.getMessage());
        }
    }

    public void saveAnimal(Animal animal) {
        try {
            FileWriter writer = new FileWriter("ANIMALS.txt", true);
            writer.write(animal.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving animal: " + e.getMessage());
        }
    }

    public static void displayAvailableAnimal() {
        try (Scanner fileScanner = new Scanner("ANIMALS.txt")) {
            System.out.println("======================================");
            System.out.println("           Available Animals          ");
            System.out.println("======================================");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading Available animal: " + e.getMessage());
        }
    }

    public static void saveAdoptionHistory(String record) {
        try {
            FileWriter writer = new FileWriter("HISTORY.txt", true);
            writer.write(record + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving reservation: " + e.getMessage());
        }
    }

    public static void displayAdoptioHistory() {
        try (Scanner fileScanner = new Scanner(new File("HISTORY.txt"))) {
            System.out.println("======================================");
            System.out.println("           Adoption History           ");
            System.out.println("======================================");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error reading reservations: " + e.getMessage());
        }
    }
}
