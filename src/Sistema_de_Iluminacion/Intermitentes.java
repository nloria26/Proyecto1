
package Sistema_de_Iluminacion;

import Metodo_de_Encendido.Metodo_de_Encendido;
import java.awt.Color;

public class Intermitentes extends Metodo_de_Encendido{
    
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
    
    public Intermitentes(Color Amarrillo, int duracion) {
        this.encendido = false;
        this.Amarillo = Color.YELLOW;
        this.duracion = duracion;
    }
    
    
    
}
