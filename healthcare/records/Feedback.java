package healthcare.records;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Feedback {
    private String patientName;
    private String feedbackMessage;
    private float rating;

    public Feedback(String patientName, String feedbackMessage, float rating) {
        this.patientName = patientName;
        this.feedbackMessage = feedbackMessage;
        this.rating = rating;
    }

    public void writeFeedbackToCSV() {
        String fileName = "patient_feedback.csv";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.printf("\"%s\",\"%s\",%f%n", patientName, feedbackMessage, rating);
        } catch (IOException e) {
            System.err.println("Error writing to CSV file: " + e.getMessage());
        }
    }

    public static void collectFeedback(Scanner scanner) {
        System.out.println("===========================================");
        System.out.println("               Submit Feedback             ");
        System.out.println("===========================================");

        System.out.print("Enter patient name: ");
        String patientName = scanner.nextLine();

        System.out.print("Enter feedback message: ");
        String feedbackMessage = scanner.nextLine();

        float rating = 0;
        boolean validRating = false;
        while (!validRating) {
            System.out.print("Enter rating (1 to 5): ");
            try {
                rating = Float.parseFloat(scanner.nextLine());
                if (rating >= 1 && rating <= 5) {
                    validRating = true;
                } else {
                    System.out.println("Please enter a rating between 1 and 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value between 1 and 5.");
            }
        }

        Feedback feedback = new Feedback(patientName, feedbackMessage, rating);
        feedback.writeFeedbackToCSV();

        System.out.println("===========================================");
        System.out.println("Thank you! Your feedback has been recorded.");
        System.out.println("===========================================");
    }
}
