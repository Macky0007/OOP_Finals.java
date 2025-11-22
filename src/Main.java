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