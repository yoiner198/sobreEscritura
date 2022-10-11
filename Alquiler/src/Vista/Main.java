package Vista;

import Modelo.Autobus;
import Modelo.Tractor;
import java.text.ParseException;


public class Main {


    public static void main(String[] args) throws ParseException {
        Autobus bus1 = new Autobus();
        
        System.out.println("Precio por los kilometros recorridos: "+bus1.calcP());
        
        Tractor tractor1 = new Tractor();
        System.out.println("Precio por los dias "+tractor1.cDias()+" transcurridos: ");

    }
    
}
