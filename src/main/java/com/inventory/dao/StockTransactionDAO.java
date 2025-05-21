package com.inventory.dao;

import com.inventory.model.StockTransaction;
import com.inventory.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockTransactionDAO {
    public List<StockTransaction> getTransactionHistory() {
        List<StockTransaction> list = new ArrayList<>();
        String sql = "SELECT t.date, u.username, p.name AS product_name, t.type, t.quantity " +
                "FROM transactions t " +
                "JOIN users u ON t.user_id = u.id " +
                "JOIN products p ON t.product_id = p.id " +
                "ORDER BY t.date DESC";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                StockTransaction tx = new StockTransaction();
                tx.setDate(rs.getTimestamp("date"));
                tx.setUsername(rs.getString("username"));
                tx.setProductName(rs.getString("product_name"));
                tx.setType(rs.getString("type"));
                tx.setQuantity(rs.getInt("quantity"));
                list.add(tx);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

