/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Alarma_Bloqueo;

import Metodo_de_Encendido.Metodo_de_Encendido;


public class Sistema_Alarma_Bloqueo extends Metodo_de_Encendido{
    
    private boolean bloqueo_Alarma;

    public boolean isBloqueo_Alarma() {
        return bloqueo_Alarma;
    }

    public Sistema_Alarma_Bloqueo() {
        super();
        this.bloqueo_Alarma = false;
    }
    
    @Override
    public void encender(){
        super.encender();
        if (this.bloqueo_Alarma==false) {
            this.bloqueo_Alarma=true; // Es el IF redundante al ya estar llamando el codigo padre??
        } 
    }
    
    public void apagar(){
        super.apagado();
        if (this.bloqueo_Alarma==true) {
            this.bloqueo_Alarma=false;
        }
    } 
    
    
    
}
/**
 *
 * @author Dylan
 */