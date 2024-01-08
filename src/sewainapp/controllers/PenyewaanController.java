/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import sewainapp.models.domains.PenyewaanDomain;
import sewainapp.services.DatabaseService;

/**
 *
 * @author nafidinara
 */
public class PenyewaanController {
    
    protected final String tableName = "penyewaan";
    
    public void create(PenyewaanDomain penyewaan) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "INSERT INTO "+tableName+" (tglSewa, tglKembali, lamaSewa, status, kendaraan_id, pembayaran_id, user_id) VALUES ('"
                + "" + penyewaan.getTglSewa() + "',"
                + "'" + penyewaan.getTglKembali() + "',"
                + "'" + penyewaan.getLamaSewa() + "',"
                + "'" + penyewaan.isStatus() + "',"
                + "'" + penyewaan.getKendaraan().getId() + "',"
                + "'" + penyewaan.getPembayaran().getId() + "',"
                + "'" + penyewaan.getPenyewa().getId() + "')";
        
        db.executeUpdate(sqlUpdate);
    }
    
    public void update(PenyewaanDomain penyewaan) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "UPDATE "+tableName+" SET "
                + "tglSewa='" + penyewaan.getTglSewa() + "',"
                + "tglKembali='" + penyewaan.getTglKembali() + "',"
                + "lamaSewa='" + penyewaan.getLamaSewa() + "'"
                + "status='" + penyewaan.isStatus() + "'"
                + "kendaraan_id='" + penyewaan.getKendaraan().getId() + "'"
                + "pembayaran_id='" + penyewaan.getPembayaran().getId() + "'"
                + "user_id='" + penyewaan.getPenyewa().getId() + "'"
                + "WHERE id='" + penyewaan.getId() + "'";
        
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
