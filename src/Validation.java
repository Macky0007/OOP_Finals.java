import java.time.LocalDate;
import java.util.Scanner;

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
