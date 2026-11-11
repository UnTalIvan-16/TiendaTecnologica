package tiendatecnologica;
import java.util.Scanner; // Permite leer datos desde consola

public class Main {

    public static void main(String[] args) {

        // Scanner permite leer información escrita por el usuario
        Scanner sc = new Scanner(System.in);

        
        Tienda tienda = new Tienda();

        // Variable para controlar el ciclo
        String continuar;

        do {

            System.out.print("Ingrese el nombre del dispositivo: ");
            String nombre = sc.nextLine();

           
            System.out.print("Ingrese el precio del dispositivo: ");
            double precio = sc.nextDouble();

            // Limpiamos el buffer del scanner
            sc.nextLine();

           
            Dispositivo dispositivo = new Dispositivo(nombre, precio);

            
            tienda.agregarDispositivo(dispositivo);

          
            System.out.print("¿Desea agregar otro dispositivo? (si/no): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("si"));

        
        tienda.mostrarDispositivos();

       
        System.out.println("\nTOTAL A PAGAR: $" + tienda.calcularTotal());

        // Cerramos el scanner
        sc.close();
    }
}
