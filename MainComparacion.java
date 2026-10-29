/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dif_e_Integracion;

/**
 *
 * @author Carde
 */
public class MainComparacion {
public static void main (String[]args){

    double a = 0, b = Math.PI, tol= 1e-6;
    double t = TrapecioCompuesto.integrarConTolerancia(a, b, tol);
    System.out.println(" Resultado trapecio: " + t + "\n");
    
    double s= SimsonCompuesto.integrarConTolerancia(a, b, tol);
    System.out.println(" Resultado simpson " + s);
    System.out.println(" Valor exacto: 2.0");
}    
}
