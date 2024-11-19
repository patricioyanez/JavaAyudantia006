package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Producto;

public class ControladorProducto {
    // metodos C.R.U.D
    
    public boolean agregar(Producto producto)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO PRODUCTO6 (codigo, descripcion, precio)";
            sql += " VALUES (?,?,?)";      
        
            PreparedStatement st = cx.prepareStatement(sql);
            st.setInt(1, producto.getCodigo());
            st.setString(2, producto.getDescripcion());
            st.setInt(3, producto.getPrecio());
            
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return false;
    }
    public boolean modificar(Producto producto)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE PRODUCTO6 SET descripcion=?, precio=?";
            sql += " WHERE codigo=?";      
        
            PreparedStatement st = cx.prepareStatement(sql);
            st.setString(1, producto.getDescripcion());
            st.setInt(2, producto.getPrecio());
            st.setInt(3, producto.getCodigo());

            
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return false;
    }
}
