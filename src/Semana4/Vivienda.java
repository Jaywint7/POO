package Semana4;

public class Vivienda {
    int numero;
    String propietario;

    public Vivienda (int numero, String propietario){
        this.numero = numero;
        this.propietario = propietario;
    }

    public void imprimir(){
        System.out.println("--------------------------");
        System.out.println("Numero de casa: "+numero+"\n"+"Propietario: "+propietario);
    }
}

class Departamento extends Vivienda{
    int numpiso;
    public Departamento(int numpiso, String propietario, int numero){
        super(numero, propietario);
        this.numpiso = numpiso;
    }
    public void anuncio(){
        System.out.println("  Aviso: Departamento arrendado!");
    }
    public void imprimirD(){
        System.out.println("--------------------------");
        System.out.println("Numero de casa: "+numero+"\n"+"Propietario: "+propietario+"\n"+"Numero Piso: "+numpiso);
    }
}

class Casa extends Vivienda{
    int numhabitaciones;
    String ubicacion;
    public Casa(int numero, String propietario, int numhabitaciones, String ubicacion){
        super(numero, propietario);
        this.numhabitaciones = numhabitaciones;
        this.ubicacion = ubicacion;
    }
    public void mensajeC(){
        System.out.println("  Aviso: Casa comprada!");
    }
    public void imprimirC(){
        System.out.println("--------------------------");
        System.out.println("Numero de casa: "+numero+"\n"+"Propietario: "+propietario+"\n"+"Num Habitaciones: "+numhabitaciones+"\n"+"Ubicacion: "+ubicacion);
    }
}





