import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        Vehiculo vehiculo = null;
        Cliente cliente = null;
        while(true)
        {
            System.out.println("==== Menú ====");
            System.out.println("1.- Crear Datos");
            System.out.println("2.- Mostrar información");
            System.out.println("3.- Agregar monto de servicio y descuento");
            System.out.println("4.- Enviar correo");
            System.out.println("5.- Salir");
            System.out.print("Ingrese opcion: ");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 1)
            {
                cliente = new Cliente("1-9", "Juan", 32, 654987, "juan@mail.com", false);
                vehiculo= new Vehiculo("FCDS54", 2022, 20000, 150000, cliente);
            }
            else if(opcion == 2)
            {
                System.out.println("=== Datos del vehiculo ===");
                System.out.println(vehiculo.toString());
            }
            else if(opcion == 3)
            {
                vehiculo.setCostoServicio(50000);
                vehiculo.descuento();
                System.out.println("Valor a pagar: " + vehiculo.getCostoServicio());
            }
            else if(opcion == 4)
            {
                vehiculo.enviarCorreo();
            }
            else
            {
                break;
            }
        }
    }
    
}
