
package SistemaIluminacion;

import java.awt.Color;

public class MergenciaIntermitente  extends Luz  {
    
    private Luz  intermitente;
    private Luz  apagada;
    private boolean modoEmergencia;
    
    public void activarEmergencia() {
        this.modoEmergencia = true;
        intermitente.encender();
        apagada.apagar();
    }

    public void desactivarEmergencia() {
        this.modoEmergencia = false;
        intermitente.apagar();
        apagada.encender();
    }
    
    
    public Color getColorActual() {
        return modoEmergencia ? intermitente.getAmarillo() : apagada.getAmarillo();
    }
    
    public boolean isModoEmergencia() {
        return modoEmergencia;
    }
     
    public MergenciaIntermitente(Color Amarrillo, int duracion) {
        super(Amarrillo, duracion);
        this.intermitente = new Luz (Color.YELLOW, 1);
        this.apagada = new Luz (Color.BLACK, 0);
        this.modoEmergencia = false;
    }
    
}
