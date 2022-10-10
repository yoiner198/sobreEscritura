package Modelo;

public class EBasico {
    
    private double horasT;
    private double pagoH;

    public EBasico() {
        this.horasT=160;
        this.pagoH=30000;

    }

    public EBasico(double horasT, double pagoH) {
        this.horasT = horasT;
        this.pagoH = pagoH;
    }
    
    public double calcSal(){
        double salario = this.horasT*this.pagoH;
        return salario;
    }
    
    
    
}
