# Simpson 1/3 Compuesto vs Trapecio Compuesto

Práctica de Métodos Numéricos (SCC-1017), Unidad 4. ITS Xalapa.

Compara la regla del Trapecio Compuesto y la de Simpson 1/3 Compuesta
para aproximar ∫₀^π sin(x) dx (valor exacto = 2) con tolerancia 1e-6.

## Estructura
- TrapecioCompuesto.java: función f(x), cálculo de h, trapecio e integración con tolerancia.
- SimpsonCompuesto.java: Simpson 1/3 compuesto e integración con tolerancia.
- MainComparacion.java: ejecuta ambos métodos y los compara.

## Cómo compilar y ejecutar

### Desde NetBeans / IDE
1. Abrir el proyecto en NetBeans.
2. Clic derecho en MainComparacion.java → *Run File* (Shift+F6).

### Desde la terminal
Desde la carpeta src del proyecto:

bash
javac dif_e_Integracion/*.java
java dif_e_Integracion.MainComparacion


## Ejemplo de salida


---- ITERACIONES (TRAPECIO COMPUESTO)----
n = 2 | integral = 1.5707963267948966
...
n= 4096 | Integral = 1.9999999019542845 Error = 2.94137146639172E-7
Resultado trapecio: 1.9999999019542845

---- ITERACIONES (SIMPSON 1/3 COMPUESTO)----
n= 2 | Integral = 2.0943951023931953
n = 4 | integral = 2.0045597549844207 | error = 0.08983534740877452
n = 8 | integral = 2.0002691699483877 | error = 0.004290585036033079
n = 16 | integral = 2.0000165910479355 | error = 2.52578900452160E-4
n = 32 | integral = 2.000001033369412 | error = 1.55576785227928E-5
n = 64 | integral = 2.000000645300013 | error = 9.68839411363831E-7
Resultado simpson 2.000000645300013
Valor exacto: 2.0


## Comparación

| Método | n final | Resultado |
|---|---|---|
| Trapecio Compuesto | 4096 | 1.99999990195 |
| Simpson 1/3 Compuesto | 64 | 2.00000064530 |
