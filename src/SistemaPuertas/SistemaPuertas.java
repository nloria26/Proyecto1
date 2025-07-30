/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaPuertas;
import SistemaIluminacion.Luzpuertas;
import Interfaces.MetodoEncendido;
/**
 *
 * @author Dylan
 */

public class SistemaPuertas extends MetodoEncendido{

    private boolean estadoPuerta;
    private Luzpuertas luzPuerta;

    //metodo GET//
    public boolean isEstadoPuerta() {
        return estadoPuerta;
    }

    public boolean isLuzPuerta() {
        return luzPuerta.isEncendido();
    }
    

    //Constructor//
    public SistemaPuertas() {
        this.estadoPuerta = false; /** La puerta inicia cerrada y luz apagada**/
        this.luzPuerta = new Luzpuertas();
        this.luzPuerta.apagado();
    }
    
        //METODOS validación//
    public void abrir (){
     if (this.estadoPuerta==false) {
         this.estadoPuerta=true;
         this.luzPuerta.encender();
        }
    }
    
    public void cerrar (){
     if (this.estadoPuerta==true) {
    this.estadoPuerta=false;
    this.luzPuerta.apagado();
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
