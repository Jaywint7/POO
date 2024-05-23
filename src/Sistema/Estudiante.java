package Sistema;

public class Estudiante {
    public String nombre;
    public int edad;
    public String carrera;
    public String notas;
    public String materias;

    public Estudiante(String nombre, String carrera, String notas, int edad, String materias){
        this.nombre = nombre; this.edad = edad; this.notas = notas;
        this.carrera = carrera; this.materias = materias;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
