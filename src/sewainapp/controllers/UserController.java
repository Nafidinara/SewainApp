/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.controllers;

import java.sql.SQLException;
import sewainapp.models.domains.User;
import sewainapp.services.DatabaseService;
import java.sql.ResultSet;

/**
 *
 * @author nafidinara
 */
public class UserController {
    public int register(User user) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = String.format("INSERT INTO user (nama, umur, nohp, email, username, password) VALUES ('%s', '%s', '%s', '%s', '%s', '%s')", user.getNama(), user.getUmur(), user.getNohp(), user.getEmail(), user.getUsername(),  user.getPassword());
//        String sqlUpdate = String.format("INSERT INTO user (nama, umur, nohp, email, username, password) VALUES ('%s', '%s', '%s', '%s', '%s', '%s')", user.getNama(), user.getUmur(), user.getNohp(), user.getEmail(), user.getUsername(), BCrypt.withDefaults().hashToString(12, user.getPassword().toCharArray()));

        return db.executeUpdate(sqlUpdate);
    }
    
    public User login(String username, String password) throws SQLException{
        DatabaseService db = new DatabaseService();
        
        String sql = "SELECT * FROM user WHERE username = '"+username+"'";

        ResultSet rs = db.executeQuery(sql);
        
         if (rs.next()) {
                // Retrieve the hashed password from the database
                String hashedPassword = rs.getString("password");
                
//                BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hashedPassword);
//
//                System.out.println("sdsd: "+hashedPassword);
//                System.out.println("aaa: "+password);
                // Check if the provided password matches the hashed password
                if (hashedPassword.equals(password)) {
                    User user = new User(
                        rs.getString("nama"),
                        rs.getString("umur"),
                        rs.getString("nohp"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("password")
                    );
                    
                    System.out.println("password benar!");
                    
                    return user;
                } else {
                    System.out.println("invalid password!");
                    return null; // Invalid password
                }
            } else {
             System.out.println("User not found");
                return null; // User not found
            }
    }
    
    //Logout
    public void logout(String username) throws SQLException {
        DatabaseService db = new DatabaseService();
        // Assuming you're using a session table to track logged-in users
        String sql = "DELETE FROM sessions WHERE username = '" + username + "'";
        db.executeUpdate(sql);
    }
    
}
