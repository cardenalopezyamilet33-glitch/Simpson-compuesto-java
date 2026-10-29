
package dif_e_Integracion;

/**
 *
 * @author Carde
 */
public class SimsonCompuesto {

private static double calcularSimson(double a, double b, int n){
double h = TrapecioCompuesto.calcularH(a, b, n);
double sumaImpares = 0.0;
double sumaPares = 0.0;

for (int k = 1; k<n; k++){
double xk = a + k * h;
if(k % 2 !=0){
    sumaImpares += TrapecioCompuesto.funcion(xk);
    
}else{
sumaPares += TrapecioCompuesto.funcion(xk);
}
}
double sumaTotal = TrapecioCompuesto.funcion(a) + 4 * sumaImpares + 2 * sumaPares + TrapecioCompuesto.funcion(b);
return (h/3)* sumaTotal;
}    

public static double integrarConTolerancia (double a, double b, double tolerancia){
int n = 2;
double integralAnterior = calcularSimson(a, b, n);
double errorAbsoluto = 999.0;

    System.out.println("---- ITERACIONES (SIMPSON 1/3 COMPUESTO)----");
    System.out.println("n= " + n + " | Integral = " + integralAnterior);
    
    while(errorAbsoluto > tolerancia){
    n *= 2;
    double integralNueva = calcularSimson(a, b, n);
    errorAbsoluto = Math.abs(integralNueva - integralAnterior);
        System.out.println("n = " + n + " | integral = " + integralNueva + " | error = " + errorAbsoluto);
        integralAnterior = integralNueva;
        
    }
    return integralAnterior;
}
}
