
package Sistema_de_Iluminacion;

import Metodo_de_Encendido.Metodo_de_Encendido;
import java.awt.Color;

public class Luces_delanteras extends Metodo_de_Encendido {

    private Color  LucesAltas;
    private Color  LucesBajas;
    private Color ColorActual;
    private boolean LucesAltasActivadas;
    
    
    
    public Luces_delanteras() {
        
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
    


   