/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlKilometraje;

import SistemaFrenos.Sistemafrenos;
import Interfaces.TiempoEncendido;
import SistemaCombustible.TanqueCombustible;

/**
 *
 * @author Dylan
 */
public class ControlKilometraje implements TiempoEncendido{
    private int km;
    private int rpm;
    private int velocimetro;
    private int segundo;
    private int minuto;
    private TanqueCombustible tanque;
    private boolean Enmovimiento;
    private Sistemafrenos frenoMano;

    public int getKm() {
        return km;
    }

    public int getRpm() {
        return rpm;
    }    

    public int getVelocimetro() {
        return velocimetro;
    }
    
    public int getSegundo() {
        return segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public TanqueCombustible getTanque() {
        return tanque;
    }

    public boolean isEnmovimiento() {
        return Enmovimiento;
    }


    
    public ControlKilometraje(int km,int capacidadTanque,int consumoPorKm, Sistemafrenos frenoMano) {
        this.km = km;
        this.rpm = 800;
        this.velocimetro = 0;
        this.segundo = 0;
        this.minuto = 0;
        this.Enmovimiento=false;
        this.frenoMano=frenoMano;
        this.tanque = new TanqueCombustible(capacidadTanque, consumoPorKm);
    }
    

    @Override
    public void tiempoEncendido() {
        /**Aqui deberia dejar el metodo hasta minutos, ya que avanza 1km por minuto, verdad?
         Podria eliminar las horas de toda la clase?**/
        segundo++;
        if(segundo==60){
            segundo=0;
            minuto++;
        }
    }
    

    @Override
    public void contador() {
        /**cada minuto aumenta 1 a la variable kilometro**/
        if(segundo == 0 && minuto > 0 && !tanque.estaVacio() && !Enmovimiento){
            km++;
            tanque.consumirUnKm();
        }
    }
    
    public void velocimetro() {
    if (minuto > 0 && Enmovimiento==true) {
        velocimetro = (km * 60) / minuto;
    } else {
        velocimetro = 0; // se evita división por cero
            }
    }
    
    public void contandoRPM() {
    /**cada minuto aumenta 1 a la variable kilometro**/
    if(segundo == 0 && minuto > 0 && Enmovimiento==true){
        rpm+=800;
        }
    }
        public void iniciarMovimiento() {
        if (!tanque.estaVacio()) {
            Enmovimiento = true;
        }
    }
        
         public void detenerMovimiento() {
        Enmovimiento = false;
    }
}   
    /** Metodos en gui o main:
     *control.tiempoEncendido();  // actualiza tiempo
     *control.contador();         // actualiza km (u otras variables)
     * control.velocimetro();  // actualiza velocidad **/
    
    
    
    
    

