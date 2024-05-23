package VehiculosV;

public class Main {
    public static void main(String[] args){
        System.out.println("        Ejecutando la aplicacion            ");
        Vhcls veh_1 = new Vhcls();                                              //sin metodo constructor lleno
        Vhcls veh = new Vhcls(20.11, "Foer", "Verde");   //con metodo constructor lleno

        System.out.println(veh_1.getAceleracion());
        veh_1.setAceleracion(50.5);
                           //No es la clase/Metodo Constructor
        veh_1.frenar(); veh_1.acelerar();  //llamdo al los metodos sin metodo constructor lleno
        System.out.println();
        veh.frenar(); veh.acelerar();       //llamdo al los metodos con metodo constructor lleno
    }
}
