package bank.management.system;

import javax.swing.*;

public class Login extends JFrame {

    Login() {

        setTitle("ATM - Automated Teller Machine");

        setSize(1200, 800);
        setVisible(true);
        setLocation(130, 50);

    }

    public static void main(String[] args) {
        new Login();
    }
}