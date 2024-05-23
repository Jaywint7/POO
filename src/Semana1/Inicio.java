package Semana1;

import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
//Ejercicios realizados la primera clase
        System.out.println("Mi primer mensaje");
        /*int val1=21;
        int rcbe;
        rcbe = val1*2;
        System.out.println("El resultado es: "+rcbe);*/

        //Scanner txt = new Scanner(System.in);

//Año quemado y restar año actual
        /*int ano = 1985;
        int t;
        t=2024-ano;
        System.out.println("Usted tiene "+t+" años");*/

//Ejercicio para ingresar un texto y mostrar un texto
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Porfavor ingrese un texto: ");
        String texto = scanner.nextLine();
        System.out.println("Texto ingresado es: "+texto);
        scanner.close();*/

//Ejercicio para ingresar un entero y mostrar un entero
        /*Scanner scanner1 = new Scanner(System.in);
        System.out.print("Porfavor ingrese un entero: ");
        int nume = scanner1.nextInt();
        System.out.println("El numero ingresado es: "+ nume);
        scanner1.close();*/

//Ejercicio para ingresar un flotante y mostrar un entero
        /*Scanner scanner2 = new Scanner(System.in);
        System.out.print("Ingresa el precio: ");
        double precio = scanner2.nextDouble();
        System.out.println("El precio ingresado es: "+ precio);
        scanner2.close();*/

//Ejercicio todo combinado
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Porfavor ingrese un texto: ");
        String texto = scanner.nextLine();
        System.out.print("Porfavor ingrese un entero: ");
        int nume = scanner.nextInt();
        System.out.print("Ingresa el precio: ");
        double precio = scanner.nextDouble();
        double resul = nume*precio;
        System.out.println("Texto ingresado es: "+texto);
        System.out.println("El numero ingresado es: "+ nume);
        System.out.println("El precio ingresado es: "+ precio);
        System.out.println("El total de los dos valores multiplicados es: "+ resul);
        scanner.close();*/

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
