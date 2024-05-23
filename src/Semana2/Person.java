package Semana2;

public class Person {
    public String nombre; //Declaramos las variable que vamos a usar
    public String apellido;
    public int edad;
    public Person(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public void persona() {
        System.out.println("El nombre es: "+nombre+" "+apellido+", la edad es "+edad);
    }
}
