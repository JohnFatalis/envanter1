package com.inventory.ui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import com.inventory.dao.ProductDAO;
import com.inventory.model.Product;

public class ProductListFrame extends JFrame {
    public ProductListFrame() {
        setTitle("Ürün Listesi");
        setSize(400, 300);
        setLocationRelativeTo(null);

        List<Product> products = new ProductDAO().getAllProducts();
        DefaultListModel<String> model = new DefaultListModel<>();

        for (Product p : products) {
            model.addElement(p.getId() + ": " + p.getName() + " (" + p.getQuantity() + ")");
        }

        JList<String> productList = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(productList);

        add(scrollPane);
        setVisible(true);
    }
}
