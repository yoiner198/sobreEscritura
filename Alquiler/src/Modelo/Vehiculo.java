package Modelo;

public class Vehiculo {
    private String placa;
    private boolean estado;

    public Vehiculo() {
        this.placa = "ABC12";
        this.estado = false;
    }

    public Vehiculo(String placa, boolean estado) {
        this.placa = placa;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     
}
