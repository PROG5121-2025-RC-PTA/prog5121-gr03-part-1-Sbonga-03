/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login_signup;

import javax.swing.JOptionPane;

public class Login_SignUp {
    
private String[] usernames = new String[10];
private String[] passwords = new String[10];
private int userCount = 0;

public static void main(String[] args) {
    
    
   
    
    try {
        // Set the look and feel to the system's default (optional)
        javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    // Run the GUI in the Event Dispatch Thread (best practice for Swing)
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new Login().setVisible(true); // Launch the Login frame
        }
    });
}
}
     
                    //OpenAl.(2025).ChatGBT[Large language model].
                    //Avalible at : https://chat.openai.com (Accessed 10 April 2025)


   
