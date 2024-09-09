
public class Vehiculo {
    private String patente;
    private int anio;
    private int kilometraje;
    private int costoServicio;
    private Cliente cliente;

    public Vehiculo() {
        this.patente = "";
        this.anio = 0;
        this.kilometraje = 0;
        this.costoServicio = 0;
        this.cliente = null; // new Cliente();
    }
    public Vehiculo(String patente, int anio, int kilometraje, int costoServicio, Cliente cliente) {
        this.patente = patente;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.costoServicio = costoServicio;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(int costoServicio) {
        this.costoServicio = costoServicio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", anio=" + anio + ", kilometraje=" + kilometraje + ", costoServicio=" + costoServicio + ", cliente=" + cliente + '}';
    }
    public void descuento()
    {
        if(this.cliente.isEsNuevo() || this.getCostoServicio() >= 100000)
        {// convertir decimal a entero
            this.costoServicio = (int) (this.costoServicio* 0.95);
        }
    }
    public void enviarCorreo()
    {
        String mensaje = "Estimado " + this.cliente.getNombre() +
                "\nEnviamos a su correo " + this.cliente.getCorreo() +
                " aviso de que su vehiculo patente " + this.getPatente() +
                " esta listo para su retiro. Adios!";
        System.out.println(mensaje);
    }
}
