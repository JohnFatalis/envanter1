package com.inventory.ui;

import javax.swing.*;
import com.inventory.dao.UserDAO;
import com.inventory.model.User;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Giriş");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JTextField userField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);
        JButton loginBtn = new JButton("Giriş");

        panel.add(new JLabel("Kullanıcı:"));
        panel.add(userField);
        panel.add(new JLabel("Şifre:"));
        panel.add(passField);
        panel.add(loginBtn);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            User u = new UserDAO().login(user, pass);
            if (u != null) {
                JOptionPane.showMessageDialog(this, "Giriş başarılı!");

                // Ana pencereyi aç
                new MainFrame().setVisible(true);

                // Login ekranını kapat
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Hatalı giriş.");
            }
        });

        add(panel);
        setVisible(true);
    }
}
