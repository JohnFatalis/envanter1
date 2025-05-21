package com.inventory.ui;

import javax.swing.*;
import com.inventory.dao.CategoryDAO;
import com.inventory.model.Category;
import java.util.List;

public class CategoryPanel extends JPanel {
    public CategoryPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JTextArea textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        loadData(textArea);
    }

    private void loadData(JTextArea area) {
        List<Category> categories = new CategoryDAO().getAllCategories();
        for (Category c : categories) {
            area.append("ID: " + c.getId() + " - " + c.getName() + "\n");
        }
    }
}
