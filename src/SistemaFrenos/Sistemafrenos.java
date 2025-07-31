/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaFrenos;

/**
 *
 * @author UTN-GIU
 */
public class Sistemafrenos {
 private boolean frenoMano;     
    private boolean obstaculoAtras; 
    private boolean alarmaActiva;
    private String Razon;


    public Sistemafrenos() {
        this.frenoMano = true; 
        this.obstaculoAtras = false;
        this.alarmaActiva = false;
    }

    public void activarFrenoMano() {
        this.frenoMano = true;
    }

    public void quitarFrenoMano() {
        this.frenoMano = false;
    }


    public void verificarMovimiento(boolean enReversa) {
        this.alarmaActiva = false;

        if (frenoMano) {
            this.alarmaActiva = true;
            this.Razon="Hey, cuidado, romperas el motor, primero quita el freno de mano para avanzar";
            return;
        }

        if (enReversa && obstaculoAtras) {
            this.alarmaActiva = true;
            this.Razon="ATENCION, OBSTACULO DETRAS DETECTADO";
            return;
        }
    }

    public boolean isAlarmaActiva() {
        return alarmaActiva;
    }

    public boolean isFrenoMano() {
        return frenoMano;
    }

    public boolean isObstaculoAtras() {
        return obstaculoAtras;
    }

    public String getRazon() {
        return Razon;
    }

}

