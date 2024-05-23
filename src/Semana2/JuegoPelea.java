package Semana2;

public class JuegoPelea {
    String nombre_player;
    String habilidad_especial;
    int puntos_salud;
    public JuegoPelea(String nombre, String habilidad, int puntos){
        this.nombre_player = nombre;
        this.habilidad_especial = habilidad;
        this.puntos_salud = puntos;
    }
    public void describir(){
        System.out.println("El personaje se llama "+nombre_player);
        System.out.println("La habilidad del personaje es: "+habilidad_especial);
        System.out.println("Los puntos de salud de "+nombre_player+" es: "+puntos_salud);
    }

}
