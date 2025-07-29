/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaClimatizacion;

/**
 *
 * @author Dylan
 */
public class SistemaClimatizacion {
    private boolean encenderAC;
    private boolean encenderCalefaccion;
    //getters
    public boolean isEncenderAC() {
        return encenderAC;
    }

    public boolean isEncenderCalefaccion() {
        return encenderCalefaccion;
    }
    /**CONSTRUCTOR:
     * ambos climas apagados, usuario decide cual encender y
    se aplica temp normal y ventilador apagado por defecto**/
    public SistemaClimatizacion() {
        this.encenderAC = false;
        this.encenderCalefaccion = false;
        this.ajusteTemperatura="Normal";
        this.velocidadesVentilador="Ventilador Apagado";
    }
    //metodos climatizacion
    //verificamos si la calefaccion esta encendida, si lo esta la apagamos y encendemos el AC
        public void encenderAC(){
        if (this.encenderCalefaccion==true) {
            this.encenderCalefaccion=false;
        }
            this.encenderAC=true;
            this.ajusteTemperatura="Baja";
            this.velocidadesVentilador="Velocidad 1";
    }
        
    public void encenderCalefaccion(){
        if (this.encenderAC==true) {
            this.encenderAC=false;
        }
        this.encenderCalefaccion=true;
        this.ajusteTemperatura="Alta";
        this.velocidadesVentilador="Velocidad 1";
    }
    //metodos para apagar los climas
    public void apagarAC(){
        this.encenderAC=false;
    }
    
        public void apagarCalefaccion(){
        this.encenderCalefaccion=false;
    }
//---------Aqui comienza el codigo de temperatura-------------------------------------
    
    private String ajusteTemperatura;
    //getter
    public String getAjusteTemperatura() {
        return ajusteTemperatura;
    }
    //metodods temp
    public void tempAlta(){
        this.ajusteTemperatura="Alta"; 
    }
    
     public void tempNormal(){
         this.ajusteTemperatura="Normal";
    }
     
    public void tempBaja(){
        this.ajusteTemperatura="Baja";
    }
    
//---------Aqui comienza el codigo de temperatura-------------------------------------
    
    private String velocidadesVentilador;
    //getter
    public String getVelocidadesVentilador() {
        return velocidadesVentilador;
    }
    //metodos
    public void ventiladorApagado(){
        this.velocidadesVentilador="Ventilador Apagado";
    }
    
    public void velFase1(){
        this.velocidadesVentilador="Velocidad 1";
    }
    
    public void velFase2(){
        this.velocidadesVentilador="Velocidad 2";
    }
    
    public void velFase3(){
        this.velocidadesVentilador="Velocidad 3";
    }

    
}
