package com.inventory.ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Envanter Yönetim Sistemi");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton addButton = new JButton("Ürün Ekle");
        JButton listButton = new JButton("Ürünleri Listele");

        addButton.addActionListener(e -> new AddProductFrame());
        listButton.addActionListener(e -> new ProductListFrame());

        JPanel panel = new JPanel();
        panel.add(addButton);
        panel.add(listButton);

        add(panel);
        setVisible(true);
    }
}
