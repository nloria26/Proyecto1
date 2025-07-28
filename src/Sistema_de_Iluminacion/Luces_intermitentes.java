
package Sistema_de_Iluminacion;

import Metodo_de_Encendido.Metodo_de_Encendido;
import java.awt.Color;

public class Luces_intermitentes extends Metodo_de_Encendido{
    
    private Color LucesIntermitentesActivas ;
    private Color LucesIntermitentesDasactivas;
    private int Temporizador;

    public void setTemporizador(int Temporizador) {
        this.Temporizador = Temporizador;
    }

    @Override
    public void apagado() {
        super.apagado(); 
    }

    @Override
    public void encender() {
        super.encender();
    }

    @Override
    public boolean isEncendido() {
        return super.isEncendido();
    }
    

    public Color getLucesIntermitentesActivas() {
        return LucesIntermitentesActivas;
    }

    public Color getLucesIntermitentesDasactivas() {
        return LucesIntermitentesDasactivas;
    }

    public int getTemporizador() {
        return Temporizador;
    }
    
    public Luces_intermitentes(Color LucesIntermitentesActivas, Color LucesIntermitentesDasactivas, int Temporizador) {
        this.encendido = true;
        this.LucesIntermitentesActivas = LucesIntermitentesActivas;
        this.LucesIntermitentesDasactivas = LucesIntermitentesDasactivas;
        this.Temporizador = Temporizador;
    }
    
    
}
