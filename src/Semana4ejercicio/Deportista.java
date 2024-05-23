package Semana4ejercicio;
//23 mayo clase
public class Deportista {
    String nombre;
    int edad;
    String estado;

    public Deportista(String nombre, int edad, String estado){
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }
    public void imprinfo(){
        System.out.println("-------------------------");
        System.out.println("Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"Estado: "+estado);
    }
}

class Futbolista extends Deportista{
    String pais;
    String posicion;
    String club;
    int dorsal;
    public Futbolista(String nombre, int edad, String estado, String pais, String posicion, String club, int dorsal){
        super(nombre, edad, estado);
        this.pais = pais;
        this.posicion = posicion;
        this.club = club;
        this.dorsal = dorsal;
    }
    public void imprfut(){
        System.out.println("-------------------------");
        System.out.println("Nombre: "+nombre+"\n"+"Edad: "+edad+"\n"+"Estado: "+estado+"\n"+"Pais: "+pais+"\n"+"Posicion: "+posicion+"\n"+"Club: "+club+"\n"+"Dorsal: "+dorsal);
    }

}
