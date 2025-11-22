
// Members:
// Dimaculangan, Darlene N.
// Guce, Mark Jester C.

/*The Animal Adoption Center program is designed to manage animals available for adoption and record
 adoption transactions in an organized and efficient way. It allows staff to register animals, display
 available pets, and record adopter information when an adoption occurs. The system also maintains an
 adoption history for tracking past adoptions.
*/
import java.util.*;
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
            System.out.println("1. Register as an adopter");
            System.out.println("2. Register Animal");
            System.out.println("3. Display Available Animals");
            System.out.println("4. Adopt an Animal");
            System.out.println("5. View Adoption History");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Choice: ");
            int choice = Validation.getValidatedInt(1,5);

            switch (choice) {
                case 1:
                    registerAdopter();
                    break;

                case 2:
                    System.out.println("Are you already registered? (Y/N): ");
                    boolean ans = Validation.getYesOrNo().equals("Y");

                    if (!ans) {
                        registerAdopter();
                    }
                    registerAnimal();
                    break;

                case 3:
                    System.out.println("Displaying Available Animals...");
                    TextFileHandling.displayAvailableAnimal();
                    break;

                case 4:
                    System.out.print("Are you already registered? (Y/N)");
                    ans = Validation.getYesOrNo().equals("Y");

                    if (!ans) {
                        registerAdopter();
                    }
                    adopt();
                    break;

                case 5:
                    System.out.println("Viewing Adoption History...");
                    TextFileHandling.displayAdoptioHistory();
                    break;

                case 6:
                    System.out.println("Thank you for using the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.print("Would you like to do something else?: (Y/N): ");
            repeat = Validation.getYesOrNo().equals("Y");
        }
        while(repeat);
    }

    public static void registerAnimal(){
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean repeat;

        do{
            System.out.println("======================================");
            System.out.println("            Register Animal           ");
            System.out.println("======================================");
            System.out.println();

            System.out.print("Enter Animal ID: ");
            String id = Validation.sc.nextLine();

            System.out.print("Enter Animal Name: ");
            String name = Validation.getValidatedName();

            System.out.print("Enter Animal Age: ");
            int age = Validation.getPositiveInt();

            System.out.println("Select Animal Species:");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Hamster");
            System.out.println("4. Rabbit");
            System.out.print("Choice: ");
            int sp = Validation.getValidatedInt(1,4);

            System.out.print("Is the animal make? (Y/N): ");
            boolean male = Validation.getYesOrNo().equals("Y");

            Animal animal = null;

            switch (sp) {
                case 1: animal = new Dog(id, name, age, male); break;
                case 2: animal = new Cat(id, name, age, male); break;
                case 3: animal = new Hamster(id, name, age, male); break;
                case 4: animal = new Rabbit(id, name, age, male); break;
            }
            TextFileHandling.saveAnimal(animal);

            System.out.println("------Animal has been registered------");
            System.out.print("Would you like to Register another Animal? (Y/N): ");
            repeat = Validation.getYesOrNo().equals("Y");
        }
        while(repeat);
    }

    public static void registerAdopter() {
        System.out.println("========== ADOPTER REGISTRATION ==========");

        System.out.print("Full Name: ");
        String name = Validation.getValidatedName();

        System.out.print("Age: ");
        int age = Validation.getPositiveInt();

        System.out.print("Contact Number: ");
        String contact = Validation.getValidatedContact();

        System.out.print("Email Address: ");
        String email = Validation.getValidatedEmail();

        System.out.print("Address: ");
        String address = Validation.getValidatedAddress();

        Adopter adopter = new Adopter(name, age, contact, email, null, address);

        TextFileHandling tf = new TextFileHandling();
        tf.saveAdopter(adopter);

        System.out.println("Adopter successfully registered.");
    }


    public static void adopt() {
        Scanner sc = new Scanner(System.in);
        boolean choice2;

        do {
            System.out.println("======================================");
            System.out.println("            Animal Adoption!          ");
            System.out.println("======================================");
            System.out.println();
            System.out.println("Here are the animals who are ready for adoption: ");
            TextFileHandling.displayAvailableAnimal();

            System.out.println();

            System.out.print("Enter the animal's ID: ");
            String adoptId = sc.nextLine();

            // Get adopter's name for the history record
            System.out.print("Enter your name: ");
            String adopterName = sc.nextLine();

            // Get the animal info before deleting
            String animalInfo = TextFileHandling.getAnimalById(adoptId);

            if (animalInfo != null) {
                // Save to adoption history with date and adopter info
                String date = java.time.LocalDate.now().toString();
                String historyRecord = animalInfo + "," + adopterName + "," + date;
                TextFileHandling.saveAdoptionHistory(historyRecord);

                // Remove from available animals
                TextFileHandling.deleteAnimalById(adoptId);

                System.out.println("You have successfully adopted a pet!");
            } else {
                System.out.println("Animal with ID " + adoptId + " not found.");
            }

            System.out.print("Would you like to adopt another animal? (Y/N): ");
            choice2 = Validation.getYesOrNo().equals("Y");
        }
        while (choice2);
    }
}
