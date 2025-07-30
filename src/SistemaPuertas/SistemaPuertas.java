/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPuertas;

/**
 *
 * @author Dylan
 */

public class SistemaPuertas {

    private boolean estadoPuerta;
    private boolean luzPuerta;

    //metodo GET//
    public boolean isEstadoPuerta() {
        return estadoPuerta;
    }

    public boolean isLuzPuerta() {
        return luzPuerta;
    }
    

    //Constructor//
    public SistemaPuertas(boolean estadoPuerta) {
        this.estadoPuerta = false; /** La puerta inicia cerrada y luz apagada**/
        this.luzPuerta = false;
    }
    
        //METODOS validación//
    public void abrir (){
     if (this.estadoPuerta==false) {
    this.estadoPuerta=true;
    this.luzPuerta=true;
        }
    }
    
    public void cerrar (){
     if (this.estadoPuerta==true) {
    this.estadoPuerta=false;
    this.luzPuerta=false;
        }
    }    
}

/** COPIAR A CLASE MAIN
 * 
 * 
 private Sistema_Control_Puertas puertaPiloto;
 private Sistema_Control_Puertas puertaCopiloto;
 * 
 * 
 public [CLASE MAIN O VEHICULO]() {
   this.puertaPiloto = NEW Sistema_Control_Puertas();
   this.puertaCopiloto = NEW Sistema_Control_Puertas();
    }
 **/
