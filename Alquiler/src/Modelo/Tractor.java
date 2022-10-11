package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Tractor extends Vehiculo{
    private double pDia;
    private String fIDa;
    //private SimpleDateFormat fFIda;
    //private Date fechaIda;
    
    private String fVuelta;
//    private SimpleDateFormat fFVuelta;
//    private Date fechaVuelta;

    public Tractor() {
        this.pDia=70000; 
        this.fIDa="2022-10-20";
        this.fIDa="2022-10-25";
    }

    public Tractor(double pDia, String fIDa, String fVuelta, String placa, boolean estado) {
        super(placa, estado);
        this.pDia = pDia;
        this.fIDa = fIDa;
//        this.fFIda = fFIda;
//        this.fechaIda = fechaIda;
        this.fVuelta = fVuelta;
//        this.fFVuelta = fFVuelta;
//        this.fechaVuelta = fechaVuelta;
    }

    public double getpDia() {
        return pDia;
    }

    public void setpDia(double pDia) {
        this.pDia = pDia;
    }

    public String getfIDa() {
        return fIDa;
    }

    public void setfIDa(String fIDa) {
        this.fIDa = fIDa;
    }
    public String getfVuelta() {
        return fVuelta;
    }

    public void setfVuelta(String fVuelta) {
        this.fVuelta = fVuelta;
    }

    public double cDias() throws ParseException{
        SimpleDateFormat fechai = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaida = fechai.parse(this.fIDa);
        
        SimpleDateFormat fechav = new SimpleDateFormat("yyyy-MM-dd");
        Date fechavuelta = fechav.parse(this.fIDa);
        int milisegundosPorDia = 86400000;

        double dias = (fechaida.getTime()-fechavuelta.getTime())/milisegundosPorDia;
        return dias;
    }
    
    public double cPago() throws ParseException{
        double pago = cDias()*this.pDia;
        return pago;
    }
    
}
