package Semana4;

public class Main {
    public static void main(String []args){
        Vivienda vivienda1 = new Vivienda(45,"Juan Diaz");
        vivienda1.imprimir();

        Departamento departamento1 = new Departamento(4,"Alan Perez",20);
        departamento1.imprimirD();
        departamento1.anuncio();

        Casa casa1 = new Casa(7,"Alan Olsen",4,"La Cordobesa");
        casa1.imprimirC();
        casa1.mensajeC();
    }
}
