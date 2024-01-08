/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import sewainapp.models.entities.darat.Mobil;
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
    
    public Map<String, Object> show(int id) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlQuery = "SELECT * FROM "+tableName+" WHERE id = '" + id + "'";
        
        ResultSet rs = db.executeQuery(sqlQuery);
        
//        Mobil mobil = new Mobil();
//        
//        if(rs.next()){
//            mobil.setId(rs.getInt("id"));
//            mobil.setNama(rs.getString("nama"));
//            mobil.setJenis(rs.getString("jenis"));
//            mobil.setTahunPembuatan(rs.getString("tahunPembuatan"));
//            mobil.setHarga(rs.getInt("harga"));
//            mobil.setQuantity(rs.getInt("quantity"));
//            mobil.setSpesifikasi(rs.getString("spesifikasi"));
//            mobil.setPersyaratan(rs.getString("persyaratan"));
//            mobil.setStatus(rs.getBoolean("status"));
////            mobil.setCrew(rs.getInt("crew"));
//            mobil.setSopir(rs.getBoolean("sopir"));
////            mobil.setJmlMuatan(rs.getInt("jmlMuatan"));
//            mobil.setImg(rs.getString("img"));
//        }
        
        if (rs.next()) {
                Map<String, Object> kendaraan = new HashMap<>();
                kendaraan.put("id", rs.getInt("id"));
                kendaraan.put("nama", rs.getString("nama"));
                kendaraan.put("jenis", rs.getString("jenis"));
                kendaraan.put("tahunPembuatan", rs.getString("tahunPembuatan"));
                kendaraan.put("harga", rs.getInt("harga"));
                kendaraan.put("quantity", rs.getInt("quantity"));
                kendaraan.put("spesifikasi", rs.getString("spesifikasi"));
                kendaraan.put("persyaratan", rs.getString("persyaratan"));
                kendaraan.put("status", rs.getBoolean("status"));
                 kendaraan.put("crew", rs.getInt("crew"));
                kendaraan.put("sopir", rs.getBoolean("sopir"));
                 kendaraan.put("jmlMuatan", rs.getInt("jmlMuatan"));
                kendaraan.put("img", rs.getString("img"));

                return kendaraan;
            }

        return null;
    }
    
    public void delete(String id) throws SQLException{
        DatabaseService db = new DatabaseService();
        String sqlUpdate = "DELETE FROM "+tableName+" WHERE id = '" + id + "'";
        
        db.executeUpdate(sqlUpdate);
    }
}
