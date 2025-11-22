// Members:
// Dimaculangan, Darlene N.
// Guce, Mark Jester C.

/*The Animal Adoption Center program is designed to manage animals available for adoption and record
  adoption transactions in an organized and efficient way. It allows staff to register animals, display
  available pets, and record adopter information when an adoption occurs. The system also maintains an
  adoption history for tracking past adoptions.
 */

import java.sql.SQLOutput;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean repeat;

        do {
            System.out.println("======================================");
            System.out.println("Welcome to the Animal Adoption Center!");
            System.out.println("======================================");
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Register Animal");
            System.out.println("2. Display Available Animals");
            System.out.println("3. Adopt an Animal");
            System.out.println("4. View Adoption History");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Choice: ");
            int choice = Validation.getValidatedInt(1,5);

            switch (choice) {
                case 1:
                    System.out.println("Registering Animal...");
                    break;
                case 2:
                    System.out.println("Displaying Available Animals...");
                    break;
                case 3:
                    adopt();
                    break;
                case 4:
                    System.out.println("Viewing Adoption History...");
                    break;
                case 5:
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println("Would you like to do something else?: (Y/N): ");
            repeat = Validation.getYesOrNo().equals("Y");
        }
        while(repeat);
    }

    public static void adopt(){
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean choice2;

        do {
            System.out.println("======================================");
            System.out.println("            Animal Adoption!          ");
            System.out.println("======================================");
            System.out.println();
            System.out.println("What species of animal would you like to adopt?");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Hamster");
            System.out.println("4. Rabbit");
            System.out.println("5. Exit");
            System.out.println("Choice: ");
            choice = Validation.getValidatedInt(1,5);;
            System.out.println();
            switch (choice) {
                case 1:
            }
            System.out.println("Would you like to adopt another animal? (Y/N)");
            choice2 = Validation.getYesOrNo().equals("Y");
        }
        while(choice2);
    }

    public static void viewHistory(){

    }
}

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

    public void saveDog(Dog dog) {
        try {
            FileWriter writer = new FileWriter("DOG.txt", true); // true = append mode
            writer.write(dog.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving client: " + e.getMessage());
        }
    }

    public void saveCat(Cat cat) {
        try {
            FileWriter writer = new FileWriter("CAT.txt", true); // true = append mode
            writer.write(cat.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving client: " + e.getMessage());
        }
    }

    public void saveHamster(Hamster hamster) {
        try {
            FileWriter writer = new FileWriter("HAMSTER.txt", true); // true = append mode
            writer.write(hamster.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving client: " + e.getMessage());
        }
    }

    public void saveRabbit(Rabbit rabbit) {
        try {
            FileWriter writer = new FileWriter("RABBIT.txt", true); // true = append mode
            writer.write(rabbit.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error saving client: " + e.getMessage());
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

public class Adopter{

    public String adopterName;
    public int adopterAge;
    public String adopterContact;
    public Animal adoptedAnimal;
    private String adopterAddress;

    public Adopter(String adopterName, int adopterAge,String adopterContact, Animal adoptedAnimal, String adopterAddress){
        this.adopterName = adopterName;
        this.adopterAge = adopterAge;
        this.adopterContact = adopterContact;
        this.adoptedAnimal = adoptedAnimal;
        this.adopterAddress = adopterAddress;
    }

    public String toString(){
        return adopterName + "," + adopterAge + "," + adopterContact + "," + adoptedAnimal;
    }
}

public class Adopter{

    public String adopterName;
    public int adopterAge;
    public String adopterContact;
    public Animal adoptedAnimal;
    private String adopterAddress;

    public Adopter(String adopterName, int adopterAge,String adopterContact, Animal adoptedAnimal, String adopterAddress){
        this.adopterName = adopterName;
        this.adopterAge = adopterAge;
        this.adopterContact = adopterContact;
        this.adoptedAnimal = adoptedAnimal;
        this.adopterAddress = adopterAddress;
    }

    public String toString(){
        return adopterName + "," + adopterAge + "," + adopterContact + "," + adoptedAnimal;
    }
}

public class Validation {
    public static Scanner sc = new Scanner(System.in);

    public static String getValidatedName() {
        while (true) {
            String fullName = sc.nextLine();
            if (fullName != null && !fullName.trim().isEmpty()) {
                return fullName;
            }
            System.out.println("Invalid name.");
            System.out.print("Full Name: ");
        }
    }

    public static String getValidatedAddress() {
        while (true) {
            String address = sc.nextLine();
            if (address != null && !address.trim().isEmpty()) {
                return address;
            }
            System.out.println("Invalid address.");
            System.out.print("Address: ");
        }
    }

    public static String getValidatedContact() {
        while (true) {
            String contact = sc.nextLine();
            if (contact.matches("\\d{10,13}")) {
                return contact;
            }
            System.out.println("Invalid contact number. Enter 10 to 13 digits: ");
            System.out.print("Phone number: ");
        }
    }

    public static int getValidatedInt(int min, int max) {
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine());
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.print("Invalid range. Enter between " + min + " and " + max + ": ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
                System.out.print("Choice: ");
            }
        }
    }


    public static Object getYesOrNo() {
        while (true) {
            String input = sc.nextLine().trim().toUpperCase();
            if (input.equals("Y") || input.equals("N")) {
                return input;
            } else {
                System.out.print("Invalid input. Enter Y or N: ");
            }
        }
    }

    public static int getPositiveInt() {
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine());
                if (value > 0) return value;
                else System.out.print("Must be positive. Enter again: ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter a number: ");
            }
        }
    }

    public static String getValidatedDate() {
        while (true) {
            String date = sc.nextLine();
            try {
                LocalDate.parse(date);
                return date;
            } catch (Exception e) {
                System.out.print("Invalid date format (YYYY MM DD). Try again: ");
            }
        }
    }
}

class Animal{
    public String name;
    public String species;
    public int age;
    private String animalID;
    private boolean isMale = true;

    public Animal(String name, String species, int age, String animalID, boolean isMale){
        this.name = name;
        this.species = species;
        this.age = age;
        this.animalID = animalID;
        this.isMale = isMale;
    }
    public String toString(){
        return species + "," + name + "," + age + "," + isMale;
    }
}

//Classes of different species of animal as an implementation of Inheritance
class Dog extends Animal{
    public Dog(String name, int age, String animalID, boolean isMale){
        super(name, "Dog", age, animalID, isMale);
    }

}

class Cat extends Animal{
    public Cat(String name, int age, String animalID, boolean isMale){
        super(name, "Cat", age, animalID, isMale);
    }
}

class Hamster extends Animal{
    public Hamster(String name, int age, String animalID, boolean isMale){
        super(name, "Hamster", age, animalID, isMale);
    }
}

class Rabbit extends Animal{
    public Rabbit(String name, int age, String animalID, boolean isMale){
        super(name, "Rabbit", age, animalID, isMale);
    }
}