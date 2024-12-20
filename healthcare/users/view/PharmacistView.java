package healthcare.users.view;

import java.util.Scanner;

public class PharmacistView {

    public void displayPharmacistMenu() {
        Screen.clearConsole();
        System.out.println("===========================================");
        System.out.println("              Pharmacist Menu              ");
        System.out.println("===========================================");
        System.out.println("|                                         |");
        System.out.println("|  1. View Appointment Outcome Record     |");
        System.out.println("|  2. Update Prescription Status          |");
        System.out.println("|  3. View Medication Inventory           |");
        System.out.println("|  4. Submit Replenishment Request        |");
        System.out.println("|  5. Logout                              |");
        System.out.println("|                                         |");
        System.out.println("===========================================");
    }

    public void displayMessage(String message) {
        Screen.clearConsole();
        System.out.println("===========================================");
        System.out.println("                Message                    ");
        System.out.println("===========================================");
        System.out.println("   " + message);
        System.out.println("===========================================");
    }

    public void displayError(String errorMessage) {
        Screen.clearConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("                 ERROR                     ");
        System.out.println("===========================================");
        System.out.println("   Error: " + errorMessage);
        System.out.println("===========================================");
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();

    }

    public void displayAppointmentOutcome(String appointmentDetails) {
        Screen.clearConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("         Appointment Outcome Record        ");
        System.out.println("===========================================");
        System.out.println(appointmentDetails);
        System.out.println("===========================================");
        scanner.nextLine();

    }

    public void displayMedicationInventory(String inventoryDetails) {
        Screen.clearConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("          Medication Inventory             ");
        System.out.println("===========================================");
        System.out.println(inventoryDetails);
        System.out.println("===========================================");
        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();

    }

}
