package controlador;

import java.util.ArrayList;
import modelo.Producto;

// clase gestora
public class Empresa {
    ArrayList<Producto> productos;
    
    public Empresa()
    {
        productos = new ArrayList<Producto>();
    }

    public boolean agregar(Producto producto)
    {
        return productos.add(producto);
    }
    public boolean buscarProducto(int codigo)
    {
        for(Producto producto: productos)
        {
            if(producto.getCodigo() == codigo)
                return true;
        }
        return false;
    }
    public void listarProductos()
    {
        for(Producto producto: productos)
        {
            System.out.println(producto);
        }
    }
    public boolean eliminarProducto(int codigo)
    {
        for(Producto producto: productos)
        {
            if(producto.getCodigo() == codigo)
            {
                productos.remove(producto);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Producto> buscarProductoMasculino()
    {
        
        ArrayList<Producto> listado = new ArrayList<Producto>();
        for(Producto producto: productos)
        {
            if(producto.getDescripcion().equals("Bebida"))
                listado.add(producto);
        }
        return listado;
    }
}
