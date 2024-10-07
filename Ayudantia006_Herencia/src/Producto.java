
public class Producto {
    private int codigo;
    private String nombre;
    private String marca;
    private String modelo;
    private int precio;
    
    public Producto() {
        this.codigo = 0;
        this.nombre = "";
        this.marca = "";
        this.modelo = "";
        this.precio = 0;
    }
    
    public Producto(int codigo, String nombre, String marca, String modelo, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  "\nCodigo   = " + codigo + 
                "\nNombre   = " + nombre + 
                "\nMarca    = " + marca + 
                "\nModelo   = " + modelo + 
                "\nPrecio   = " + precio;
    }
    
    
}
