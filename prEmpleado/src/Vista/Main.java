package Vista;

import Modelo.EBasico;
import Modelo.EmpleadoC;

public class Main {

    public static void main(String[] args) {
       
        EBasico a = new EBasico();
        System.out.println("Salario mes empleado:  "+a.calcSal()+"$ pesos");
        
        EmpleadoC b = new EmpleadoC();
        System.out.println("Salario mes empleado por comision:  "+b.calcSal()+"$ pesos");
    }
    
}
