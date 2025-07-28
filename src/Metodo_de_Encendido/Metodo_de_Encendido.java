
package Metodo_de_Encendido;

public abstract class Metodo_de_Encendido{
    
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