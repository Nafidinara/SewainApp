/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.models.entities.air;

import sewainapp.models.entities.Kendaraan;
import sewainapp.repositories.KendaraanInterface;

/**
 *
 * @author nafidinara
 */
public class JetSki extends Kendaraan implements KendaraanInterface {
    
    private boolean status;
    
    

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }
    

    @Override
    public boolean getStatus() {
        return status;
    }
}
