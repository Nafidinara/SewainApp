/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.controllers;

import java.sql.SQLException;
import sewainapp.models.domains.User;
import sewainapp.services.DatabaseService;
import at.favre.lib.crypto.bcrypt.BCrypt;
import java.sql.ResultSet;

/**
 *
 * @author nafidinara
 */
public class UserController {
    public void register(User user) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "INSERT INTO user (nama, umur, nohp, email, username, password, role) VALUES ('"
                + "" + user.getNama() + "',"
                + "'" + user.getUmur() + "',"
                + "'" + user.getNohp() + "',"
                + "'" + user.getEmail() + "',"
                + "'" + user.getUsername() + "',"
                + "'" + BCrypt.withDefaults().hashToString(12, user.getPassword().toCharArray()) + "',"
                + "'" + user.getRole() + "')";
        
        db.executeUpdate(sqlUpdate);
    }
    
    public User login(String username, String password) throws SQLException{
        DatabaseService db = new DatabaseService();
        
        String sql = "SELECT * FROM users WHERE username = '"+username+"'";

        ResultSet rs = db.executeQuery(sql);
        
         if (rs.next()) {
                // Retrieve the hashed password from the database
                String hashedPassword = rs.getString("password");
                
                BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), hashedPassword);

                // Check if the provided password matches the hashed password
                if (result.verified) {
                    User user = new User(
                        rs.getString("nama"),
                        rs.getString("umur"),
                        rs.getString("nohp"),
                        rs.getString("email"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("role")
                    );
                    
                    return user;
                } else {
                    return null; // Invalid password
                }
            } else {
                return null; // User not found
            }
    }
    
    //kurang logout
}
