package Modelo;

public class Autobus extends Vehiculo{
    private double pKm;
    private double cKmIda;
    private double cKmVuelta;

    public Autobus() {
        this.pKm = 5000;
        this.cKmIda = 500;
        this.cKmVuelta = 550;
    }

    public Autobus(double pKm, double cKmIda, double cKmVuelta, String placa, boolean estado) {
        super(placa, estado);
        this.pKm = pKm;
        this.cKmIda = cKmIda;
        this.cKmVuelta = cKmVuelta;
    }

    public double getpKm() {
        return pKm;
    }

    public void setpKm(double pKm) {
        this.pKm = pKm;
    }

    public double getcKmIda() {
        return cKmIda;
    }

    public void setcKmIda(double cKmIda) {
        this.cKmIda = cKmIda;
    }

    public double getcKmVuelta() {
        return cKmVuelta;
    }

    public void setcKmVuelta(double cKmVuelta) {
        this.cKmVuelta = cKmVuelta;
    }
    
    public double calcKm(){
         double kilometros = this.cKmVuelta-this.cKmIda;
         return kilometros;
    }
    
    public double calcP(){
        double precio = calcKm()*this.pKm;
        return precio;
    }
    
    
    
}
