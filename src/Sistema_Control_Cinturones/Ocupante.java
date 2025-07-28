/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema_Control_Cinturones;

/**
 *
 * @author bycha
 */
public class Ocupante {
  private boolean ocupado = true;
    private boolean abrochado = true;
    
    public String getEspacio() {
        return ocupado ? "Ocupado" : "Desocupado";
    }
    public String getCinturon() {
        return abrochado ? "Abrochado" : "Desabrochado";
    }
    public String getLuz(){
        return (ocupado && abrochado) ? "Luz apagada" : "Luz encendida";
    }
    public void mostrarEspacio() {
        System.out.println("Asiento: " + getEspacio());
        System.out.println("Cinturon: "+ getCinturon());
        System.out.println("Estado de la luz: " + getLuz());
    }
  
}
