
package Metodo_de_Encendido;

public abstract class Metodo_de_Encendido{
     protected boolean encendido;

    public boolean isEncendido() {
        return encendido;
    }

    public Metodo_de_Encendido() {
        this.encendido = false;
       
    }
    public void encender(){
          this.encendido = true;
    }
    
    public void apagado(){
          this.encendido = false;
    } 
}