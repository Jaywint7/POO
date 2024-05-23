import Semana2.Person;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //declaramos el scanner
        System.out.print("Introduce nombre: "); // pedimos al usuario que introduzca los datos
        String nombre = sc.nextLine();
        System.out.print("Introduce apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Introduce edad: ");
        int edad = sc.nextInt();

        Person persona1 = new Person(nombre, apellido, edad);
        persona1.persona();
    }
}
//Crear instancia de Semana2.Persona
        /*Semana2.Persona persona1 = new Semana2.Persona("Juan",18,1758926342,1.20);
        Semana2.Persona persona2 = new Semana2.Persona("Pedro",20,1789451322,1.50);
        //Llamado
        persona1.saludar();
        persona2.despedir();
        persona2.deciralt();*/

        /*Semana2.JuegoPelea jugador1 = new Semana2.JuegoPelea("Steve","Supersalto", 1500);
        Semana2.JuegoPelea jugador2 = new Semana2.JuegoPelea("Darno","Megapuño",2000);
        jugador1.describir();
        jugador2.describir();*/

