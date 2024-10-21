import java.util.ArrayList;

// C.R.U.D. 
public class Taller {
    ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
    
    public boolean guardar(Vehiculo vehiculo)
    {
        // se puede agregar una rutina que permita
        // evitar que se repitan los vehiculos
        if(this.buscarPorPatente(vehiculo.getPatente()))
            return false;
        return listado.add(vehiculo);
    }
    
    public boolean buscarPorPatente(String patente)
    {
        for (Vehiculo vehiculo : listado) {
            if(vehiculo.getPatente().equals(patente))
            {
                return true;
            }
        }
        return false;
    }
}
