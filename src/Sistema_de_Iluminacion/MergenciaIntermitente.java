
package Sistema_de_Iluminacion;

import java.awt.Color;

public class MergenciaIntermitente  {
    
    private Intermitentes  intermitente;
    private Intermitentes  apagada;
    private boolean modoEmergencia;

    public MergenciaIntermitente () {
        
        this.intermitente = new Intermitentes (Color.YELLOW, 1);
        this.apagada = new Intermitentes (Color.BLACK, 0);     
        this.modoEmergencia = false;
    }
    
    
    public void activarEmergencia() {
        this.modoEmergencia = true;
        intermitente.encender();
        apagada.apagado();
    }

    public void desactivarEmergencia() {
        this.modoEmergencia = false;
        intermitente.apagado();
        apagada.encender();
    }

    public void cambiar() {
        if(modoEmergencia) {
            if(intermitente.isEncendido()) {
                intermitente.apagado();
            } else {
                intermitente.encender();
            }
        }
    }

    
    public Color getColorActual() {
        return modoEmergencia ? intermitente.getAmarillo() : apagada.getAmarillo();
    }
    
    public boolean isModoEmergencia() {
        return modoEmergencia;
    }
}