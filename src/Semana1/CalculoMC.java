package Semana1;

import java.util.Scanner;

 class CalculoMC {
//Escribe un programa en Java que calcule el Índice de Masa Corporal (IMC) de una persona utilizando
// su peso en kilogramos y su altura en metros. El IMC se calcula como el peso dividido por el
// cuadrado de la altura.
     //Jair Vega
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese su peso en kilogramos: ");
         double pesokg = scanner.nextDouble();
         System.out.print("Ingrese su altura en metros: ");
         double altura = scanner.nextDouble();
         double imc = pesokg/(altura*altura);
         System.out.println(pesokg +"/("+altura+"*"+altura+") = "+ imc);
         if (imc<18.5){
             System.out.println("Bajo de Peso");
         } else if (imc>=18.5 && imc<25) {
             System.out.println("Peso normal");
         } else if (25>=imc && imc<30) {
             System.out.println("Sobrepeso");
         } else if (imc >= 30) {
             System.out.println("Obesidad");
         }
     }
}
