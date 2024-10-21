

public final class Moto extends Vehiculo{
    private String estilo;
    private int medidaManillar;

    public Moto() {
        this.estilo = "";
        this.medidaManillar = 0;
    }

    public Moto(String estilo, int medidaManillar, String patente, String marca, String rut, int totalServicioNeto, int totalIVA, int totalPorPagar) {
        super(patente, marca, rut, totalServicioNeto, totalIVA, totalPorPagar);
        this.estilo = estilo;
        this.medidaManillar = medidaManillar;
    }

    public int getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(int medidaManillar) {
        this.medidaManillar = medidaManillar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return  super.toString()
                + "estilo=" + estilo + 
                ", medidaManillar=" + medidaManillar;
    }

    @Override
    public void totalPorPagar() {
        int neto = this.getTotalServicioNeto();
        int desc = this.obtenerDescuento();
        int total= this.totalConIVA();
        System.out.println("=== Detalle ===");
        System.out.println("Información de la moto");
        System.out.println("Total servicio  : " + neto);
        System.out.println("Descuento       : " + desc);
        System.out.println("Total por pagar : " + total);
    }

    @Override
    public int totalConIVA() {
        int totalServicio = this.obtenerDescuento();
        return totalServicio + (int) (totalServicio * IVA);
    }

    @Override
    public int obtenerDescuento() {
        return (int)(this.getTotalServicioNeto() * DESCUENTO_MOTOCICLETA);
    }
    
    
    
}
