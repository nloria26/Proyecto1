/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAlarmaBloqueo;

import Interfaces.Encendido;

/**
 *
 * @author Dylan
 */


public class SistemaAlarmaBloqueo implements Encendido{
    
    private boolean bloqueoAlarma;

    public boolean isBloqueoAlarma() {
        return bloqueoAlarma;
    }

    public SistemaAlarmaBloqueo(){
        this.bloqueoAlarma = false;
    }

    @Override
    public void encender() {
        this.bloqueoAlarma=true;
    }

    @Override
    public void apagar(){
            this.bloqueoAlarma=false;
        }     
    
    
}
