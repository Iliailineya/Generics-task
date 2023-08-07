package app.service;

import app.utils.Validator;

import java.util.Scanner;

public class DataInputs {
    public static String phoneInputs() {
        String phone;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            phone = scanner.nextLine();
            if (Validator.isValidPhoneNumber(phone)) {
                return phone;
            } else {
                System.out.println("Invalid phone number. Please enter the value of the form +380XXXXXXXXX or 380XXXXXXXXX:");
            }
        }
    }

    public static Double amountInputs() {
        Scanner scanner = new Scanner(System.in);
        double amount;

        while (true) {
            try {
                amount = scanner.nextDouble();
                if (amount < 0||amount>1000000000000000L) {
                    System.out.println("Invalid amount. Please enter a positive value less than 10^15:");
                } else {
                    return amount;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a valid number:");
            }
        }
    }
    public static String nameInputs() {
        Scanner scanner = new Scanner(System.in);
                return scanner.nextLine();
    }
    public static String emailInputs() {
        String email;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            email = scanner.nextLine();
            if (Validator.isValidEmail(email)) {
                return email;
            } else {
                System.out.println("Invalid email. Please enter a valid email:");
            }
        }
    }
}
