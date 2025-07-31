/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaRadio;

/**
 *
 * @author bycha
 */
public class Frecuencia {
    private int emisora;
    private boolean am = true;

    public Frecuencia(int emisora) {
        this.emisora = emisora;  
    }
    public String getEstación(){
        return am ? "AM" : "FM";
    }
    public void mostrarEmisoraAM(){
    if (emisora >= 86){
    System.out.println ("Emisora Migajas de Amor");
}else if (emisora >= 90){
    System.out.println ("Emisora La Resentida");  
}else if (emisora >= 94){
    System.out.println ("Emisora La Norteña");
}else {
    System.out.println ("Estatica");
}
    }
        public void mostrarEmisoraFM(){
    if (emisora >= 26){
    System.out.println ("Emisora Las Clasicas");
}else if (emisora >= 36){
    System.out.println ("Emisora EL Romanticidio");  
}else if (emisora >= 56){
    System.out.println ("Emisora EL Regio");
}else {
    System.out.println ("Estatica");
}
    }
}
