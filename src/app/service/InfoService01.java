package app.service;

import app.entity.Client;

import java.util.Scanner;

public class InfoService01 {

    Scanner scanner;
    String name;
    String email;

    public String getData() {
       return formData(getInputs());
    }

    private Client<String, String> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Enter client's name: ");
        name = DataInputs.nameInputs();
        System.out.print("Enter client's email: ");
        email = DataInputs.emailInputs();
        return new Client<>(name, email);
    }

    private String formData(Client<String, String> client) {
        return "Client's name is " + client.key() +
                ", email is " + client.value();
    }
}
