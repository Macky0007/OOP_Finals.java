// Members:
// Dimaculangan, Darlene N.
// Guce, Mark Jester C.


/*The Animal Adoption Center program is designed to manage animals available for adoption and record 
  adoption transactions in an organized and efficient way. It allows staff to register animals, display 
  available pets, and record adopter information when an adoption occurs. The system also maintains an 
  adoption history for tracking past adoptions.
 */


import java.util.*;

public class OOp_finals {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------------------------");
        System.out.println("Welcome to the Animal Adoption Center!");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1. Register Animal");
        System.out.println("2. Display Available Animals");
        System.out.println("3. Adopt an Animal");
        System.out.println("4. View Adoption History");
        System.out.println("5. Exit");
        System.out.println();
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Registering Animal...");
                break;
            case 2:
                System.out.println("Displaying Available Animals...");
                break;
            case 3:
                System.out.println("Adopting an Animal...");
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
    }
}

//Implementing Abstraction
abstract class Animal{
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

class Adopter{
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
}