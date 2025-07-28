/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Control_Puertas;

/**
 *
 * @author Dylan
 */

public class Sistema_Control_Puertas {

    private boolean estadoPuerta;

    //metodo GET//
    public boolean isEstadoPuerta() {
        return estadoPuerta;
    }

    //Constructor//
    public Sistema_Control_Puertas(boolean estadoPuerta) {
        this.estadoPuerta = false; /** La puerta inicia cerrada**/
    }
    
        //METODOS validación//
    public void abrir (){
     if (this.estadoPuerta==false) {
    this.estadoPuerta=true;
        }
    }
    
    public void cerrar (){
     if (this.estadoPuerta==true) {
    this.estadoPuerta=false;
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
