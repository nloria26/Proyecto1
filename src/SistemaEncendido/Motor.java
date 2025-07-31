
package SistemaEncendido;

import Interfaces.Encendido;
import java.awt.Color;


public class Motor implements Encendido {

    private Color estadoTablero;
    private boolean motor;

    public boolean isMotor() {
        return motor;
    }

    public Color getEstadoTablero() {
        return estadoTablero;
    }


    @Override
    public void encender() { 
        if (this.motor==false) {
         this.motor=true;
         this.estadoTablero = Color.YELLOW;
        }
    }
    
    
    @Override
    public void apagar() {
        if (this.motor==true) {
         this.motor=false;
         this.estadoTablero = Color.BLACK;        
        }
    }

    public Motor() {
        this.motor = false;
        this.estadoTablero = Color.BLACK;
    }  
    
}