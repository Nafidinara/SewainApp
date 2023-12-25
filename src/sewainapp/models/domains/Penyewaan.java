/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.models.domains;

import java.util.Date;
import sewainapp.models.entities.Kendaraan;

/**
 *
 * @author nafidinara
 */
public class Penyewaan {
    private Date tglSewa;
    private Date tglKembali;
    private String lamaSewa;
    private Kendaraan kendaraan;
    private Pembayaran pembayaran;
    private User penyewa;
    private boolean status;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Penyewaan(Date tglSewa, Date tglKembali, String lamaSewa, Kendaraan kendaraan, Pembayaran pembayaran, User penyewa, boolean status) {
        this.tglSewa = tglSewa;
        this.tglKembali = tglKembali;
        this.lamaSewa = lamaSewa;
        this.kendaraan = kendaraan;
        this.pembayaran = pembayaran;
        this.penyewa = penyewa;
        this.status = status;
    }
    
    

    public Date getTglSewa() {
        return tglSewa;
    }

    public void setTglSewa(Date tglSewa) {
        this.tglSewa = tglSewa;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public String getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(String lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    public User getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(User penyewa) {
        this.penyewa = penyewa;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
