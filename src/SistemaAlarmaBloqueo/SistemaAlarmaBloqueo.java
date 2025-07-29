/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAlarmaBloqueo;
/**
 *
 * @author Dylan
 */
import MetodoEncendido.MetodoEncendido;


public class SistemaAlarmaBloqueo extends MetodoEncendido{
    
    private boolean bloqueoAlarma;

    public boolean isBloqueoAlarma() {
        return bloqueoAlarma;
    }
    //constructor de MetodoEncendido. Si empieza true=puertas bloqueada y alarma encendida inicialmente.
    public SistemaAlarmaBloqueo() {
        super();
        this.bloqueoAlarma = false; //false es alarma apagada y puerta desbloqueada al inicio
    }
    
    @Override
    public void encender(){
        super.encender();
            this.bloqueoAlarma=true;
    }
    
    public void apagar(){
        super.apagado();
            this.bloqueoAlarma=false;
        }     
}
