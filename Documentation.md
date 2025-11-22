**Members:**
1. Dimaculangan, Darlene N.
2. Guce, Mark Jester C.

**Project Overview**

Title: Animal Adoption Center

Scope: The Animal Adoption Center program is designed to manage animals available for adoption and record adoption transactions in an organized and efficient way. It allows staff to register animals, display available pets, and record adopter information when an adoption occurs. The system also maintains an adoption history for tracking past adoptions.

**Main Features**
- Register animals (dogs, cats, hamsters, etc.)
- Display available animals with their details.
- Adopt an animal (record adopter’s info and remove the animal from the available list).
- View adoption history.
- Search/filter animals by species

**Applying 4 OOP Concepts**

**ENCAPSULATION**
- Protecting animal data such as species, name, & age
- Protecting adopter data such as name, age, & contact information
- Setting up getters and setters to access Animal & Adopter data

**ABSTRACTION**
- When someone adopts an animal, the system handles all the steps (like updating the list and saving adopter info) behind a simple method like adoptAnimal().

**INHERITANCE**
- Subclasses such as the specific animal type (Dog, Cat, or Hamster) inherit basic information from the parent class (Animal)

**POLYMORPHISM**
- Displaying animal details. Override a method in subclasses to show specific attributes

**Plan for Implementing**

The implementation of the Animal Adoption Center program will be developed using Java as a console-based application.

