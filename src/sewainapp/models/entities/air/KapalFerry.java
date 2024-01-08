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
public class KapalFerry extends Kendaraan implements KendaraanInterface {
    
    private boolean status;
    private int crew;

    @Override
    public boolean getStatus() {
        return status;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }
    

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
