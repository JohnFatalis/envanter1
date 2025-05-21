package com.inventory.ui;

import javax.swing.*;
import java.awt.*;
import com.inventory.dao.ProductDAO;
import com.inventory.model.Product;

public class AddProductFrame extends JFrame {
    public AddProductFrame() {
        setTitle("Ürün Ekle");
        setSize(300, 200);
        setLocationRelativeTo(null);

        JTextField nameField = new JTextField(15);
        JTextField quantityField = new JTextField(15);
        JButton saveButton = new JButton("Kaydet");

        saveButton.addActionListener(e -> {
            String name = nameField.getText();
            int qty = Integer.parseInt(quantityField.getText());
            new ProductDAO().addProduct(new Product(name, qty));
            JOptionPane.showMessageDialog(this, "Ürün eklendi.");
            dispose();
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ürün Adı:"));
        panel.add(nameField);
        panel.add(new JLabel("Adet:"));
        panel.add(quantityField);
        panel.add(saveButton);

        add(panel);
        setVisible(true);
    }
}
