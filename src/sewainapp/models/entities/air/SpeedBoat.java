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
public class SpeedBoat extends Kendaraan implements KendaraanInterface {
    
    private String status;
    private int crew;

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }
   
    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
    
}
