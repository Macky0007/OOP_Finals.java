
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

    public static Animal getAnimalById(String animalId) {
    try (Scanner fileScanner = new Scanner(new File("ANIMALS.txt"))) {
        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] parts = line.split(",");
            
            if (parts.length >= 5 && parts[0].trim().equals(animalId)) {
                String id = parts[0].trim();
                String name = parts[1].trim();
                int age = Integer.parseInt(parts[2].trim());
                boolean isMale = Boolean.parseBoolean(parts[3].trim());
                String species = parts[4].trim();
                
                switch (species.toLowerCase()) {
                    case "dog":
                        return new Dog(name, age, id, isMale);
                    case "cat":
                        return new Cat(name, age, id, isMale);
                    case "hamster":
                        return new Hamster(name, age, id, isMale);
                    case "rabbit":
                        return new Rabbit(name, age, id, isMale);
                }
            }
        }
    } catch (Exception e) {
        System.out.println("Error reading animal: " + e.getMessage());
    }
    return null;
}

    public static boolean deleteAnimalById(String animalId) {
        File inputFile = new File("ANIMALS.txt");
        File tempFile = new File("ANIMALS_temp.txt");
        boolean found = false;

        try (Scanner fileScanner = new Scanner(inputFile);
             FileWriter writer = new FileWriter(tempFile)) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                // Check if this line contains the animal with the given ID
                // Assuming format: species,name,age,isMale,animalID
                if (parts.length >= 5 && parts[0].trim().equals(animalId)) {
                    found = true; // Skip this line (don't write it to temp file)
                    System.out.println("Animal with ID " + animalId + " has been removed.");
                } else {
                    writer.write(line + "\n");
                }
            }

        } catch (IOException e) {
            System.out.println("Error deleting animal: " + e.getMessage());
            return false;
        }

        // Delete original file and rename temp file
        if (found) {
            if (inputFile.delete()) {
                tempFile.renameTo(inputFile);
            } else {
                System.out.println("Error: Could not update the file.");
                return false;
            }
        } else {
            tempFile.delete(); // Clean up temp file if animal wasn't found
            System.out.println("Animal with ID " + animalId + " not found.");
        }

        return found;
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
