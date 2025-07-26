
package Sistema_de_Encendido;

import Metodo_de_Encendido.Metodo_de_Encendido;
import java.awt.Color;


public class Motor extends Metodo_de_Encendido {

    private static final Color LUZ_TABLERO= Color.YELLOW;
    private static final Color LUZ_TAPAGADA= Color.GRAY;

    public static Color getLuzTablero() {
        return LUZ_TABLERO;
    }

    @Override
    public boolean isEncendido() {
       return encendido;      
    } 
    public Color getEstadoLuzTablero(){
       return isEncendido() ? LUZ_TABLERO : LUZ_TAPAGADA; 
    }
}

    
    
    
    
    

