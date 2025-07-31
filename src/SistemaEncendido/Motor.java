
package SistemaEncendido;

import Interfaces.Encendido;
import java.awt.Color;


public class Motor implements Encendido {

    private Color Tablero_Encendido;
    private Color Tablero_Apagado;

    public Color getTablero_Encendido() {
        return Tablero_Encendido;
    }

    public Color getTablero_Apagado() {
        return Tablero_Apagado;
    }


    @Override
    public void encender() { 
        this.Tablero_Encendido = Color.YELLOW;   
    }
    
    
    @Override
    public void apagar() {
        this.Tablero_Apagado = Color.BLACK;
    }
    
    public Motor(Color Tablero_Encendido, Color Tablero_Apagado) {
        this.Tablero_Encendido = Tablero_Encendido;
        this.Tablero_Apagado = Tablero_Apagado;
    }

    
}