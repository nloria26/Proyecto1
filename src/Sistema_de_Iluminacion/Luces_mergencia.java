
package Sistema_de_Iluminacion;

import Metodo_de_Encendido.Metodo_de_Encendido;
import java.awt.Color;


public class Luces_mergencia extends Metodo_de_Encendido{

    private Color LucesEmergencia;
    private Color LucesDesactivadas;
     
    @Override
    public void apagado() {
        super.apagado();
         this.LucesDesactivadas = Color.BLACK; 
    }

    @Override
    public void encender() {
        super.encender(); 
        this.LucesEmergencia = Color.YELLOW;    
    }

    @Override
    public boolean isEncendido() {
        return super.isEncendido(); 
    }
    
}
