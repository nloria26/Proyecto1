
package SistemaIluminacion;

import Interfaces.Encendido;
import java.awt.Color;

public class Luz implements Encendido{
    
    private boolean encendido;
    private Color Amarillo;
    private int duracion;

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public Color getAmarillo() {
        return Amarillo;
    }

    public int getDuracion() {
        return duracion;
    }
    
    public Luz(Color Amarrillo, int duracion) {
        this.encendido = false;
        this.Amarillo = Color.YELLOW;
        this.duracion = duracion;
    }

    @Override
    public void encender() {
        this.encendido = true;
    }

    @Override
    public void apagar() {
        this.encendido = false;
        
    }
    
    
    
}
