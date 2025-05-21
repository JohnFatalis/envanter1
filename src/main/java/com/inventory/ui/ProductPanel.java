package com.inventory.ui;

import javax.swing.*;
import com.inventory.dao.ProductDAO;
import com.inventory.model.Product;
import java.util.List;

public class ProductPanel extends JPanel {
    public ProductPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JTable table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        loadData(table);
    }

    private void loadData(JTable table) {
        List<Product> products = new ProductDAO().getAllProducts();
        String[] columnNames = {"ID", "Ad", "Kategori", "Adet", "Fiyat"};
        Object[][] data = new Object[products.size()][5];
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            data[i][0] = p.getId();
            data[i][1] = p.getName();
            data[i][2] = p.getCategory().getName();
            data[i][3] = p.getQuantity();
            data[i][4] = p.getPrice();
        }
        table.setModel(new javax.swing.table.DefaultTableModel(data, columnNames));
    }
}
