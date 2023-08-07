package app.utils;

import java.util.regex.Pattern;

public class Validator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // В данном примере, считаем номер валидным, если он состоит из 10 цифр
        // и начинается с кода страны "+380" или "380" (без знака плюса)
        String regex = "^(\\+?380|380)?\\d{9}$";
        return Pattern.matches(regex, phoneNumber);
    }

    public static boolean isValidEmail(String email) {
        //Примеры валидных адресов электронной почты:
        //user@example.com
        //first.last@example.co.uk
        //12345@mail-server.com
        String regex = "^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

}
