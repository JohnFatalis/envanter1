package com.inventory.ui;

import javax.swing.*;
import java.awt.*;

public class DashboardFrame extends JFrame {
    public DashboardFrame() {
        setTitle("Envanter Yönetim Paneli");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JTabbedPane tabs = new JTabbedPane();
        tabs.add("Ürünler", new ProductPanel());
        tabs.add("Kategoriler", new CategoryPanel());
        tabs.add("Stok Geçmişi", new TransactionPanel());

        add(tabs);
        setVisible(true);
    }
}
