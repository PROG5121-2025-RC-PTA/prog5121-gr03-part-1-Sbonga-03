/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login_signup;

import javax.swing.JOptionPane;

public class Login_SignUp {

    static String[] userDetails = new String[3];

    public static void main(String[] args) {
        getUsername();
        getPassword();
        getPhoneNumber();

        JOptionPane.showMessageDialog(null, "✅ Account Created Successfully!");
    }

    public static void getUsername() {
        String username = "";
        boolean isValid = false;

        while (!isValid) {
            username = JOptionPane.showInputDialog("Enter a Username");
            if (username != null && username.contains("_") && username.length() <= 5) {
                userDetails[0] = username;
                JOptionPane.showMessageDialog(null, "✅ Username successfully captured!");
                isValid = true;
            } else {
                JOptionPane.showMessageDialog(null, "❌ Invalid username.\nPlease ensure that your username contains an underscore and is no more than five characters in length");
            }
        }
    }

    public static void getPassword() {
        String password = "";
        boolean isValid = false;

        while (!isValid) {
            password = JOptionPane.showInputDialog("Enter a Password");
            if (password != null && password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*()_+=\\-{}\\[\\]:;\"'<>,.?/\\\\|].*")) //
           
            { 
                userDetails[1] = password;
                JOptionPane.showMessageDialog(null, "✅ Password successfully captured!");
                isValid = true;
            } else {
                JOptionPane.showMessageDialog(null, "❌ Invalid password.\nPlease ensure that the password contains at least eight characters, a capital letter, a number, and a special character");
            }
        }
    }

    public static void getPhoneNumber() {
        String phone = "";
        boolean isValid = false;

        while (!isValid) {
            phone = JOptionPane.showInputDialog("Enter a phone number");
            if (phone != null && 
               ((phone.startsWith("+27") && phone.length() == 13) ||
               (phone.startsWith("0") && phone.length() == 10 && phone.matches("[0-9]+")))) {
                
                userDetails[2] = phone;
                JOptionPane.showMessageDialog(null, "✅ Phone number successfully added");
                isValid = true;
            } else {
                JOptionPane.showMessageDialog(null, "❌ Invalid phone number.\nCell phone number is incorrectly formated or does not contain international code");
            }
        }
    }
}

                    //OpenAl.(2025).ChatGBT[Large language model].
                    //Avalible at : https://chat.openai.com (Accessed 10 April 2025)


   
