/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaCombustible;


        /**
 *
 * @author UTN
 */
public class TanqueCombustible {
    private int capacidad;
    private int nivel;
    private int consumo;

    public TanqueCombustible(int capacidad, int consumo) {
        this.capacidad = capacidad;
        this.nivel = capacidad;
        this.consumo = consumo;
    }

    public int getNivel() {
        return nivel;
    }
    
    public void recargar(int litros) {
    nivel += litros;
    if (nivel > capacidad) {
        nivel = capacidad;
    }
}
    
    public void consumir(int km){
    int gasto=km*consumo;
    if(gasto>=nivel){
    nivel=0;
} else{
    nivel-=gasto;
}
}
    
     public void consumirUnKm() {
        consumir(1);
    } 
    
     
       public boolean estaVacio() {
        return nivel <= 0;
    }
       
  
}
