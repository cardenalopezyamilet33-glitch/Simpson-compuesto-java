/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dif_e_Integracion;

/**
 *
 * @author Carde
 */
public class mainTrap {
    public static void main(String []args){
    double a = 0.0;
    double b = 2.0;
    double tolerancia = 0.0001;
    
    //mandamos a llamar el metodo encapsulado
    
    double resultado = TrapecioCompuesto.integrarConTolerancia(a, b, tolerancia);
    
        System.out.println("\n Resultado final obtenido: " + resultado);
        
    }
}
