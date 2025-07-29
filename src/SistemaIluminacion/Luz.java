
package SistemaIluminacion;

import Interfaces.MetodoEncendido;
import java.awt.Color;

public class Luz extends MetodoEncendido{
    
    private boolean encendido;
    private Color Amarillo;
    private int duracion;

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void apagado() {
        super.apagado();
    }

    @Override
    public void encender() {
        super.encender();
    }

    @Override
    public boolean isEncendido() {
        return super.isEncendido();     }

    

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
    
    
    
}
