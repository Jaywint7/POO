package Herencia;
//EL padre hererda a la hija y la hija hereda a la hija
public class Persona {
    String nombre;
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public void Info() {
        System.out.println("Nombre: "+nombre);
    }
    public static void main (String[] args){
        Persona persona = new Persona("Juan");
        persona.Info();
    }
}
