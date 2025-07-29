
package Interfaces;

public abstract class MetodoEncendido{
    
     protected boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }
    
     public void encender() {
        this.encendido = true;
    }

    public void apagado() {
        this.encendido = false;
    }
    
}