package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Tractor extends Vehiculo{
    private double pDia;
    private String fIda;

    private String fVuelta;

    public Tractor() {
        this.pDia=70000; 
        this.fIda="20/11/2022";
        this.fVuelta="25/11/2022";
    }

    public Tractor(double pDia, String fIda, String fVuelta, String placa, boolean estado) {
        super(placa, estado);
        this.pDia = pDia;
        this.fIda = fIda;

        this.fVuelta = fVuelta;

    }

    public double getpDia() {
        return pDia;
    }

    public void setpDia(double pDia) {
        this.pDia = pDia;
    }

    public String getfIDa() {
        return fIda;
    }

    public void setfIDa(String fIda) {
        this.fIda = fIda;
    }
    public String getfVuelta() {
        return fVuelta;
    }

    public void setfVuelta(String fVuelta) {
        this.fVuelta = fVuelta;
    }

    public double cDias() throws ParseException{
        SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
        
        Date fechaida = fecha.parse(this.fIda);
        Date fechavuelta = fecha.parse(this.fVuelta);
        
        long calc = fechavuelta.getTime()-fechaida.getTime();
        TimeUnit unidad = TimeUnit.DAYS;
        double dias = unidad.convert(calc, TimeUnit.MILLISECONDS);
        
        return dias;
    }
    
    public double cPago() throws ParseException{
        double pago = cDias()*this.pDia;
        return pago;
    }
    
}
