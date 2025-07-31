
package SistemaIluminacion;

import Interfaces.Encendido;
import java.awt.Color;

public class Luzdelanteras implements Encendido {

    private Color  LucesAltas;
    private Color  LucesBajas;
    private Color ColorActual;
    private boolean LucesAltasActivadas;
    
    
    
    public Luzdelanteras() {
        this.LucesBajas = Color.white;
        this.LucesAltas = Color.YELLOW;
    }
    
    
    @Override
    public void apagar() {
        this.ColorActual = Color.BLACK; 
        this.LucesAltasActivadas = false;  
    }
    

    @Override
    public void encender() {
        this.ColorActual = LucesBajas;
        this.LucesAltasActivadas = false;
    }
   
    public void CambioDelanteras() {
    this.LucesAltasActivadas = !this.LucesAltasActivadas; 
    this.ColorActual = this.LucesAltasActivadas ? LucesAltas : LucesBajas;
        
    }
    public boolean isLucesAltasActivadas() {
        return this.LucesAltasActivadas;
    }
    
    public Color getColorActual() {
        return this.ColorActual;
    }

    
}   
    


   