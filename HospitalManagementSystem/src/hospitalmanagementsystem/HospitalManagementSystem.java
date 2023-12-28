package hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = scanner.next();
                    System.out.print("Enter patient age: ");
                    int age = scanner.nextInt();
                    Patient patient = new Patient(name, age);
                    hospital.addPatient(patient);
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    List<Patient> patientList = hospital.getPatients();
                    System.out.println("Patients in the hospital:");
                    for (Patient p : patientList) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
