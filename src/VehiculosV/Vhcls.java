package VehiculosV;

public class Vhcls {
    private double aceleracion;
    private String modelo;
    private String color;

    public Vhcls(double aceleracion, String modelo, String color){
        this.aceleracion=aceleracion;
        this.modelo=modelo;
        this.color=color;
    }

    public Vhcls(){
        /*this.aceleracion= 150.5;
        this.modelo= "Disferol";
        this.color= "Amarillo";*/
    }
            public double getAceleracion() {
                return aceleracion;
            }
            public void setAceleracion(double aceleracion) {
                this.aceleracion = aceleracion;
            }
    public void frenar(){
        System.out.println("El auto del color "+color+", acaba de frenar");
    }
    public void acelerar(){
        System.out.println("La aceleracion del vehiculo "+modelo+" es de: "+aceleracion);
    }
    //El void se utiliza dependiendo de la informacion a actualizar o return;
}
 //