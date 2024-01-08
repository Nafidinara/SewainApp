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
public class Mobil extends Kendaraan implements KendaraanInterface {
    private boolean status;
    private boolean sopir;

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isSopir() {
        return sopir;
    }

    public void setSopir(boolean sopir) {
        this.sopir = sopir;
    }
    
    
}
