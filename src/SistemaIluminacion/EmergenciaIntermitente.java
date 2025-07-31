
package SistemaIluminacion;

import java.awt.Color;

public class EmergenciaIntermitente    {
    
    private Luz  intermitente;
    private Luz  apagada;

    public Luz getIntermitente() {
        return intermitente;
    }

    public Luz getApagada() {
        return apagada;
    }
   
    public EmergenciaIntermitente() {
        this.intermitente = new Luz (Color.YELLOW, 3);
        this.apagada = new Luz (Color.BLACK, 3);
        
    }
    public void cambiar(){
        if(intermitente.isEncendido()){
            apagada.apagar();
            intermitente.encender();
        }
    }
}
