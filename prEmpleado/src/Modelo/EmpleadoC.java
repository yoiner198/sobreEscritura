
package Modelo;

public class EmpleadoC extends EBasico {
    
    private double pCom;
    private double vEmp;

    public EmpleadoC () {
        this.pCom = 0.5;
        this.vEmp = 1000000;
    }
    
    public EmpleadoC (double horasT, double pagoH, double pCom, double vEmp) {
        super(horasT, pagoH);
        this.pCom = pCom;
        this.vEmp = vEmp;
    }

    public double getpCom() {
        return pCom;
    }

    public void setpCom(double pCom) {
        this.pCom = pCom;
    }

    public double getvEmp() {
        return vEmp;
    }

    public void setvEmp(double vEmp) {
        this.vEmp = vEmp;
    }
    
    public double calCom(){
        double comision=this.vEmp*this.pCom;
        return comision;
    }
    
    @Override
   public double calcSal(){
        double salarioC = super.calcSal()+this.calCom();
        return salarioC;
    }
    
}
