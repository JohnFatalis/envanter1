package com.inventory.ui;

import javax.swing.*;
import com.inventory.dao.StockTransactionDAO;
import com.inventory.model.StockTransaction;
import java.util.List;

public class TransactionPanel extends JPanel {
    public TransactionPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JTextArea area = new JTextArea(20, 60);
        JScrollPane scrollPane = new JScrollPane(area);
        add(scrollPane);
        loadData(area);
    }

    private void loadData(JTextArea area) {
        List<StockTransaction> history = new StockTransactionDAO().getTransactionHistory();
        for (StockTransaction t : history) {
            area.append(t.getDate() + " | " + t.getUsername() + " | " + t.getProductName() +
                        " | " + t.getType() + " | " + t.getQuantity() + "\n");
        }
    }
}
