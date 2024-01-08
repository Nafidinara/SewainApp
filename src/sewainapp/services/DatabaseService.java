/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nafidinara
 */
public class DatabaseService {
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_tubes";
    static final String DB_USER = "root";
    static final String DB_PASS = "afara123";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public DatabaseService() throws SQLException {
        try{
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }       
    }
    
    public ResultSet executeQuery(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public int executeUpdate(String SQLString){
        try {
            int res = stmt.executeUpdate(SQLString);
            JOptionPane.showMessageDialog(null, "Success update data to DB!", "Success", JOptionPane.INFORMATION_MESSAGE);
            return res;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error : " + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
            return 0;
        }
    }
}
