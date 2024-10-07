
public class Mouse extends Producto{
    private boolean esOptico;
    private int cantidadBotones;

    public Mouse() {
        this.esOptico = false;
        this.cantidadBotones = 2;
    }

    public Mouse(boolean esOptico, int cantidadBotones, int codigo, String nombre, String marca, String modelo, int precio) {
        super(codigo, nombre, marca, modelo, precio);
        this.esOptico = esOptico;
        this.cantidadBotones = cantidadBotones;
    }

    public int getCantidadBotones() {
        return cantidadBotones;
    }

    public void setCantidadBotones(int cantidadBotones) {
        this.cantidadBotones = cantidadBotones;
    }

    public boolean isEsOptico() {
        return esOptico;
    }

    public void setEsOptico(boolean esOptico) {
        this.esOptico = esOptico;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nes Optico          = " + (esOptico?"Si":"No") + 
                "\ncantidad de Botones= " + cantidadBotones;
    }
    
    
}
