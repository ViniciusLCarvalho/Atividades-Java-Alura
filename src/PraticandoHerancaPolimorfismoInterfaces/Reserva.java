package PraticandoHerancaPolimorfismoInterfaces;

public class Reserva {
        
    void reservar(){
        System.out.println("Reserva realizada");
    }

    void reservar(String data){
        System.out.printf("Reserva feita para o dia \n", data);
    }

    void reservar(String data, int pessoas){
        System.out.printf("Reserva feita para o dia %s para %d pessoas\n", data, pessoas);
    }

}
