
public class Teclado extends Producto{
    private int cantidadTeclas;

    public Teclado() {
        this.cantidadTeclas = 0;
    }

    public Teclado(int cantidadTeclas, int codigo, String nombre, String marca, String modelo, int precio) {
        super(codigo, nombre, marca, modelo, precio);
        this.cantidadTeclas = cantidadTeclas;
    }

    public int getCantidadTeclas() {
        return cantidadTeclas;
    }

    public void setCantidadTeclas(int cantidadTeclas) {
        this.cantidadTeclas = cantidadTeclas;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\ncantidad de Teclas = " + cantidadTeclas;
    }
    
    
    
}
