public class Principal {
    /*
    Crear las clases Producto con los atributos: id, nombre, marca y precio. Adicionalmente
    2 Subclases Teclado ( cantidad de teclas y si es mecanico) y Mouse 
    (cantidad de botones y si es optico).
    
    
        Ejercicio 1: Crear un objeto teclado, completar con
    datos y mostrarlos en la consola.
    
        Ejercicio 2: Crear la clase Mouse. Heredar de la clase
    Producto y agregar los atributos: esOptico y botones.
    
        Ejercicio 3: Crear un objeto mouse, completar con 
    datos y mostrarlos en la consola.
    
        Ejercicio 4: Crear un nuevo teclado y solicitar los
    datos por teclado. (usar Scanner)
    Leer ppt 2.1.1 y 2.2.1
    
    */
    public static void main(String[] args) {
        Teclado tecladoNormal = new Teclado(105, 1000, "teclado simple", "genius", "t-800", 10000);
        Mouse mouseNormal = new Mouse(false, 4, 2000, "Mouse generico", "genius", "m-500", 5000);
        
        System.out.println("=== Listado de teclados ======");
        System.out.println(tecladoNormal);
        System.out.println("\n\n=== Listado de Mouse =========");
        System.out.println(mouseNormal);
        
        
        
        
    }
    
}
