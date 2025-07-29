
package SistemaEncendido;

import Interfaces.MetodoEncendido;
import java.awt.Color;


public class Motor extends MetodoEncendido {

    private Color Tablero_Encendido;
    private Color Tablero_Apagado;

    public Color getTablero_Encendido() {
        return Tablero_Encendido;
    }

    public Color getTablero_Apagado() {
        return Tablero_Apagado;
    }

    @Override
    public void apagado() {
        super.apagado();
        this.Tablero_Apagado = Color.BLACK;
    }

    @Override
    public void encender() {
        super.encender(); 
        this.Tablero_Encendido = Color.YELLOW;
        
    }

    @Override
    public boolean isEncendido() {
        return super.isEncendido();
    }
    
    public Motor(Color Tablero_Encendido, Color Tablero_Apagado) {
        this.Tablero_Encendido = Tablero_Encendido;
        this.Tablero_Apagado = Tablero_Apagado;
    }
    public Color getEstadoLuzTablero(){
       return isEncendido() ? Tablero_Encendido : Tablero_Apagado; 
    }
    
    
}