import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<String>();
        String nombre1 = new String("Andrea");
        String nombre2 = "Pedro";
        nombres.add("Juan");
        nombres.add(nombre1);
        nombres.add(nombre2);
        
        // error
//        nombres.add(100);
//        Integer numero1 = 100;        
//        nombres.add(numero1);
        
        for(String nom : nombres)
        {
            System.out.println("Nombre: " + nom.toUpperCase());
        }
    }
    
}
