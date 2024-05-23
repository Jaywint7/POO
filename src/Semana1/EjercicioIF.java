package Semana1;

import java.util.Scanner;

public class EjercicioIF {
    public static void main(String[] args) {
// Realizar un programa en Java que solicite la edad de una persona e imprima si es mayor o menor de edad
        //Jair Vega
        Scanner usodeIF = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = usodeIF.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = usodeIF.nextInt();
        if(edad >= 18){
            System.out.println("Usted "+nombre+" es mayor de edad con "+edad+" años");
        }else{
            System.out.println("Usted "+nombre+" es menor de edad con "+edad+" años");
        }
    }
}
