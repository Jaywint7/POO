package Semana2;

public class Persona {
    //Atributos
    public String nombres;
    public int edades;
    public int cedula;
    public double altura;

    //Metodo Constructor = sirve para inicializar un objto sus propiedades o valores
    //Para inicializar las variables
    public Persona(String nombre, int edad, int ci, double alt) {
        nombres = nombre;
        edades = edad;
        this.cedula = ci;
        this.altura = alt;
    }
    //This = Hace referencia al objeto actual

    //Metodo
    public void saludar(){
        System.out.println("Soy ´"+nombres+"´ y tengo "+edades+", mi cedula es "+cedula+" y mi altura es "+altura);
    }
    public void despedir() {
        System.out.println("Hola soy ´" + nombres + "´, me despido... adios");
    }
    public void deciralt() {
        System.out.println("´"+nombres+ "´, mi altura es " + altura);
    }
}
