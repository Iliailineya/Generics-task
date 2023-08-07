package app.service;

import app.entity.Client;
import app.utils.Rounder;

public class InfoService02 {

    String phone;
    double amount;
    public String getData() {
        return formData(getInputs());
    }

    private Client<String, Double> getInputs() {
        System.out.print("Enter client's phone: ");
        phone = DataInputs.phoneInputs();
        System.out.print("Enter client's purchase amount: ");
        amount = DataInputs.amountInputs();
        return new Client<>(phone, amount);
    }

    private String formData( Client<String, Double> client) {
        String amountRounded = Rounder.roundValue(client.value());
        return "Client's phone is " + client.key() +
                ", purchase amount is USD " + amountRounded;
    }
}
