
package dif_e_Integracion;

/**
 *
 * @author Carde
 */
public class TrapecioCompuesto {
  
    /**
     * definir la funcion matematica f(x) que se desea intregrar 
     * @param x valor de la variable independioente 
     * @return el valor evaluado de la funcion f(x).
     */
    
    public static double funcion(double x){
    return Math.sin(x); //ejemplo: f(x)= x^2
    
    }
    
    /**
     * calcula el tamaño del paso h.
     * se declara public static para que la clase SimsonCompuesto pueda reutilizarlo directamente
     *@param a limite inferior 
     *@param b limite superior
     *@param n numero de subintervalos
     *@return el ancho de cada rebanada h.
     */
    public static double calcularH(double a, double b, int n){
    return (b-a)/n;
    }
    
    /**
     * metodo base que calcula la aproximacion de la integral mediante la
     * regla del trapecio compuesta para un numero fijp del subintervalo (n).
     * 
     * formula: I=(h/2)* [f(a) + 2*sum(f(x_k))+ f(b)]
     */
    
    private static double calcularTrapecio(double a, double b, int n){
    //reutilizamos el metodo calcularH que definimos arriba
    double h= calcularH(a, b, n);
    double suma= funcion(a) + funcion (b);//suma inicial con los extremos 
    
//siclo para sumar los puntos interiores multiplicados por dos
 for(int k=1; k<n; k++){
 double xk = a + k * h;
 suma += 2 * funcion (xk);
 
 }
 return (h/2) * suma;   
    }
    
    /**
     * metodo interativo que aplica el criterio de paro por error absoluto 
     * duplica el numero de subintervalos (n -> 2n) en cada interaccion del ciclo while
     * hasta que la diferencia entre dos aproximaciones sucesivas sea menor a la tolerancia  
     */
    
    public static double integrarConTolerancia (double a, double b, double tolerancia){
    int n=2; //numero inicial de subintervalos 
    double integralAnterior = calcularTrapecio(a, b, n);
     double errorAbsoluto = 999.0; //inicializamos con un valor grande
     
        System.out.println("---- ITERACIONES (TRAPECIO COMPUESTO)----");
        System.out.println("n = " + n + " | integral = " + integralAnterior);
        
        // ciclo while para evaluar la convergencia iterativa 
        while (errorAbsoluto > tolerancia){
        n *= 2; //duplicamos los subintervalos (el paso h se reduce a la mitad)
        double integralNueva = calcularTrapecio(a, b, n);
        
        //calculo del error absoluto entre la interaccion nueva y la anterior  
        errorAbsoluto = Math.abs(integralNueva - integralAnterior);
            
        System.out.println("n= " + n + " | Integral = " + integralNueva + " "
                + "Error = " + errorAbsoluto);
        
        //actualizamos el valor anterior para la siguiente comparacion 
        integralAnterior = integralNueva;
        }
        return integralAnterior;
            
    }
}
