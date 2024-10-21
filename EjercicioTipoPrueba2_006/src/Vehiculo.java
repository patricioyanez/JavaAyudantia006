
public abstract class Vehiculo implements Operaciones {
    private String patente;
    private String marca;
    private String rut;
    private int totalServicioNeto;
    private int totalIVA;
    private int totalPorPagar;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.rut = "";
        this.totalServicioNeto = 0;
        this.totalIVA = 0;
        this.totalPorPagar = 0;
    }
    
    public Vehiculo(String patente, String marca, String rut, int totalServicioNeto, int totalIVA, int totalPorPagar) {
        this.patente = patente;
        this.marca = marca;
        this.rut = rut;
        this.totalServicioNeto = totalServicioNeto;
        this.totalIVA = totalIVA;
        this.totalPorPagar = totalPorPagar;
    }

    public int getTotalPorPagar() {
        return totalPorPagar;
    }

    public void setTotalPorPagar(int totalPorPagar) {
        this.totalPorPagar = totalPorPagar;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTotalServicioNeto() {
        return totalServicioNeto;
    }

    public void setTotalServicioNeto(int totalServicioNeto) {
        this.totalServicioNeto = totalServicioNeto;
    }

    public int getTotalIVA() {
        return totalIVA;
    }

    public void setTotalIVA(int totalIVA) {
        this.totalIVA = totalIVA;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", rut=" + rut + ", totalServicioNeto=" + totalServicioNeto + ", totalIVA=" + totalIVA + ", totalPorPagar=" + totalPorPagar + '}';
    }

    public abstract void totalPorPagar();
    
}
