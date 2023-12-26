/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import sewainapp.services.DatabaseService;

/**
 *
 * @author nafidinara
 */
public class KendaraanController {
    protected final String tableName = "kendaraan";
    
    public void createAir(
            String nama,
            String jenis,
            String tahunPembuatan,
            int harga,
            int quantity,
            String spesifikasi,
            String persyaratan,
            String status,
            int crew
    ) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "INSERT INTO "+tableName+" (nama, jenis, tahunPembuatan, harga, quantity, spesifikasi, persyaratan, status, crew, sopir, jmlMuatan) VALUES ('"
                + "" + nama + "',"
                + "'" + jenis + "',"
                + "'" + tahunPembuatan + "',"
                + "'" + harga + "',"
                + "'" + quantity + "',"
                + "'" + spesifikasi + "',"
                + "'" + persyaratan + "',"
                + "'" + status + "',"
                + "'" + crew + "',"
                + "'" + null + "',"
                + "'" + null + "')";
        
        db.executeUpdate(sqlUpdate);
    }
    
    public void createDarat(
            String nama,
            String jenis,
            String tahunPembuatan,
            int harga,
            int quantity,
            String spesifikasi,
            String persyaratan,
            String status,
            boolean sopir,
            int jmlMuatan
    ) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "INSERT INTO "+tableName+" (nama, jenis, tahunPembuatan, harga, quantity, spesifikasi, persyaratan, status, crew, sopir, jmlMuatan) VALUES ('"
                + "" + nama + "',"
                + "'" + jenis + "',"
                + "'" + tahunPembuatan + "',"
                + "'" + harga + "',"
                + "'" + quantity + "',"
                + "'" + spesifikasi + "',"
                + "'" + persyaratan + "',"
                + "'" + status + "',"
                + "'" + null + "',"
                + "'" + sopir + "',"
                + "'" + jmlMuatan + "')";
        
        db.executeUpdate(sqlUpdate);
    }
    
    public void createUdara(
            String nama,
            String jenis,
            String tahunPembuatan,
            int harga,
            int quantity,
            String spesifikasi,
            String persyaratan,
            String status,
            int crew
    ) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "INSERT INTO "+tableName+" (nama, jenis, tahunPembuatan, harga, quantity, spesifikasi, persyaratan, status, crew, sopir, jmlMuatan) VALUES ('"
                + "" + nama + "',"
                + "'" + jenis + "',"
                + "'" + tahunPembuatan + "',"
                + "'" + harga + "',"
                + "'" + quantity + "',"
                + "'" + spesifikasi + "',"
                + "'" + persyaratan + "',"
                + "'" + status + "',"
                + "'" + crew + "',"
                + "'" + null + "',"
                + "'" + null + "')";
        
        db.executeUpdate(sqlUpdate);
    }
    
//    public void update(Kendaraan kendaraan) throws SQLException{
//        DatabaseService db = new DatabaseService();
//        String sqlUpdate = "UPDATE "+tableName+" SET "
//                + "tglSewa='" + penyewaan.getTglSewa() + "',"
//                + "tglKembali='" + penyewaan.getTglKembali() + "',"
//                + "lamaSewa='" + penyewaan.getLamaSewa() + "'"
//                + "status='" + penyewaan.isStatus() + "'"
//                + "kendaraan_id='" + penyewaan.getKendaraan().getId() + "'"
//                + "pembayaran_id='" + penyewaan.getPembayaran().getId() + "'"
//                + "user_id='" + penyewaan.getPenyewa().getId() + "'"
//                + "WHERE id='" + penyewaan.getId() + "'";
//        
//        db.executeUpdate(sqlUpdate);
//    }
    
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
