/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import sewainapp.models.domains.PembayaranDomain;
import sewainapp.services.DatabaseService;

/**
 *
 * @author nafidinara
 */
public class PembayaranController {
    protected final String tableName = "pembayaran";
    
    public int create(PembayaranDomain pembayaran) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "INSERT INTO "+tableName+" (metode, jumlah, status, denda) VALUES ('"
                + "" + pembayaran.getMetodePembayaran() + "',"
                + "'" + pembayaran.getJumlahPembayaran() + "',"
                + "'" + 1 + "',"
                + "'" + pembayaran.getDenda() + "')";
        
        return db.executeUpdate(sqlUpdate);
    }
    
    public void update(PembayaranDomain pembayaran) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "UPDATE "+tableName+" SET "
                + "tglSewa='" + pembayaran.getMetodePembayaran() + "',"
                + "tglKembali='" + pembayaran.getJumlahPembayaran() + "',"
                + "lamaSewa='" + pembayaran.isStatusPembayaran() + "'"
                + "status='" + pembayaran.getDenda() + "'"
                + "WHERE id='" + pembayaran.getId() + "'";
        
        db.executeUpdate(sqlUpdate);
    }
    
    public ResultSet index() throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlQuery = "SELECT * FROM "+tableName+"";

        ResultSet rs = db.executeQuery(sqlQuery);

        return rs;
    }
    
    public ResultSet show(String id) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlQuery = "SELECT * FROM "+tableName+" WHERE id = '" + id + "'";
        
        ResultSet rs = db.executeQuery(sqlQuery);

        return rs;
    }
    
    public void delete(String id) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "DELETE FROM "+tableName+" WHERE id = '" + id + "'";
        
        db.executeUpdate(sqlUpdate);
    }
}
