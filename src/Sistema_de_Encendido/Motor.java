
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
    public void apagado() {
        super.apagado(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void encender() {
        super.encender(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isEncendido() {
        return super.isEncendido(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    public Color getEstadoLuzTablero(){
       return isEncendido() ? LUZ_TABLERO : LUZ_TAPAGADA; 
    }
}

    
    
    
    
    

