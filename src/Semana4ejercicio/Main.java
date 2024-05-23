package Semana4ejercicio;

public class Main {
    public static void main (String[]args){
        Deportista  deportista1 = new Deportista("Nicolas James", 45, "Activo");
        deportista1.imprinfo();

        Futbolista fut1 = new Futbolista("Pedro", 25, "Activo","Alemania", "Delantero","Chelsea",10);
        fut1.imprfut();
    }
}
