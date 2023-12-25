/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.models.entities.darat;

import sewainapp.models.entities.Kendaraan;
import sewainapp.repositories.KendaraanInterface;

/**
 *
 * @author nafidinara
 */
public class Motor extends Kendaraan implements KendaraanInterface {
    private String status;
    private boolean sopir;

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSopir() {
        return sopir;
    }

    public void setSopir(boolean sopir) {
        this.sopir = sopir;
    }
    
    
}
