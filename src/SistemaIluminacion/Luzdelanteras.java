
package SistemaIluminacion;

import Interfaces.MetodoEncendido;
import java.awt.Color;

public class Luzdelanteras extends MetodoEncendido {

    private Color  LucesAltas;
    private Color  LucesBajas;
    private Color ColorActual;
    private boolean LucesAltasActivadas;
    
    
    
    public Luzdelanteras() {
        this.LucesBajas = Color.white;
        this.LucesAltas = Color.YELLOW;
    }
    
    @Override
    public void apagado() {
        super.apagado(); 
        this.ColorActual = Color.BLACK; 
        this.LucesAltasActivadas = false;
    }

    @Override
    public void encender() {
        super.encender(); 
        this.ColorActual = LucesBajas;
        this.LucesAltasActivadas = false;
    }

    @Override
    public boolean isEncendido() {
        return super.isEncendido(); 
    }
    
    public void CambioDelanteras (){
         if (super.isEncendido()) {
        this.LucesAltasActivadas = !this.LucesAltasActivadas;
        this.ColorActual = this.LucesAltasActivadas ? LucesAltas : LucesBajas;
        }
    }
    
    public boolean isLucesAltasActivadas() {
        return this.LucesAltasActivadas;
    }
    
    public Color getColorActual() {
        return this.ColorActual;
    }
    
}   
    


   