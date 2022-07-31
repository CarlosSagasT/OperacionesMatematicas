// Carlos Edgardo Sagastume
// Programación II
// 61721058
package operacionesmatematicas;

import java.util.Scanner;

public class OperacionesMAtematicas {

public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
System.out.println("Ingrese una operación matemática: ");

System.out.println("Presione 1 para Suma");
System.out.println("Presione 2 para Resta");
System.out.println("Presione 3 para Multiplicación");
System.out.println("Presione 4 para División");
int respuesta;
respuesta = leer.nextInt();

switch (respuesta) {
case 1:
    System.out.println("Ha seleccionado Suma");
        int suma;
        int a;
        System.out.println("Ingrese el primer numero");
    a = leer.nextInt();
        int b;
        System.out.println("Ingrese el segundo numero");
    b = leer.nextInt();
        suma = a + b;
    System.out.println("El resultado es: " + suma);
break;

case 2:
    System.out.println("Ha seleccionado Resta");
        int resta;
        int c;
        System.out.println("Ingrese el primer numero");
    c = leer.nextInt();
        int d;
        System.out.println("Ingrese el segundo numero");
    d= leer.nextInt();
        resta = c - d;
    System.out.println("El resultado es: " + resta);
break;

case 3:
    System.out.println("Ha seleccionado Multiplicacion");
        int multiplicacion;
        int e;
        System.out.println("Ingrese el primer numero");
       e = leer.nextInt();
        int f;
        System.out.println("Ingrese el segundo numero");
       f = leer.nextInt();
        multiplicacion = e * f;
    System.out.println("El resultado es: " + multiplicacion);
break;

case 4:
    System.out.println("Ha seleccionado Division");
    int division;
    int g;
    System.out.println("Ingrese el primer numero");
    g = leer.nextInt();
        int h;
        System.out.println("Ingrese el segundo numero");
    h = leer.nextInt();
        division = g / h;
        System.out.println("El resultado es: " + division);
break;
    }  
}
    
}

