
package SistemaParabrisas;

import Interfaces.Encendido;


public class LimpiaParabrisas implements Encendido  {
   
    private Velocidades velocidadActual;

    public Velocidades getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(Velocidades velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    @Override
    public void encender() {
      
    }

    @Override
    public void apagar() {
        this.velocidadActual = Velocidades.APAGADO;
    }

    public LimpiaParabrisas() {
         this.velocidadActual = Velocidades.APAGADO;
    }
    
    
    
    
    
}    
