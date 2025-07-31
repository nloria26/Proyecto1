
package Vehiculo;
  import SistemaEncendido.Motor;
import SistemaCombustible.TanqueCombustible;
import SistemaAlarmaBloqueo.SistemaAlarmaBloqueo;
import SistemaClimatizacion.SistemaClimatizacion;
import SistemaFrenos.Sistemafrenos;
import SistemaCinturones.Ocupante;
import SistemaPuertas.SistemaPuertas;
import SistemaParabrisas.LimpiaParabrisas;
import SistemaIluminacion.Luzdelanteras;
import SistemaIluminacion.MergenciaIntermitente;
import SistemaIluminacion.Luz;
import SistemaRadio.Frecuencia;


  

public class Vehiculo {
    private Motor motor;
    private TanqueCombustible tanqueCombustible;
    private SistemaAlarmaBloqueo sistemaAlarmaBloqueo;
    private SistemaClimatizacion sistemaClimatizacion;
    private Sistemafrenos sistemaFrenos;
    private Ocupante ocupante;
    private SistemaPuertas puertaPiloto;
    private SistemaPuertas puertaCopiloto;
    private LimpiaParabrisas limpiaParabrisas;
    private Luzdelanteras luzDelanteras;
    private MergenciaIntermitente luzEmergencia;
    private Luz luzInterior;
    private Frecuencia radio;

    public Vehiculo() {
        this.motor = new Motor();
        this.tanqueCombustible = new TanqueCombustible(50, 1); // ejemplo: 50 litros, 1 litro/km
        this.sistemaAlarmaBloqueo = new SistemaAlarmaBloqueo();
        this.sistemaClimatizacion = new SistemaClimatizacion();
        this.sistemaFrenos = new Sistemafrenos();
        this.ocupante = new Ocupante();
        this.puertaPiloto = new SistemaPuertas();
        this.puertaCopiloto = new SistemaPuertas();
        this.limpiaParabrisas = new LimpiaParabrisas();
        this.luzDelanteras = new Luzdelanteras();
        this.luzEmergencia = new MergenciaIntermitente(java.awt.Color.YELLOW, 1);
        this.luzInterior = new Luz(java.awt.Color.YELLOW, 0);
        this.radio = new Frecuencia(86); // ejemplo: emisora 86
    }

    // Aquí puedes agregar getters, setters y métodos para operar el vehículo

    public Motor getMotor() {
        return motor;
    }

    public SistemaAlarmaBloqueo getSistemaAlarmaBloqueo() {
        return sistemaAlarmaBloqueo;
    }

    public SistemaClimatizacion getSistemaClimatizacion() {
        return sistemaClimatizacion;
    }

    public Sistemafrenos getSistemaFrenos() {
        return sistemaFrenos;
    }

    public LimpiaParabrisas getLimpiaParabrisas() {
        return limpiaParabrisas;
    }

    public MergenciaIntermitente getLuzEmergencia() {
        return luzEmergencia;
    }

    public Luz getLuzInterior() {
        return luzInterior;
    }

    
    
    
    public SistemaPuertas getPuertaPiloto() {
        return puertaPiloto;
    }

    public SistemaPuertas getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public Luzdelanteras getLuzDelanteras() {
        return luzDelanteras;
    }

    public Frecuencia getRadio() {
        return radio;
    }

    public Ocupante getOcupante() {
        return ocupante;
    }
     public TanqueCombustible getTanqueCombustible() {
        return tanqueCombustible;
    }
}

