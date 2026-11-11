package tiendatecnologica;
import java.util.ArrayList;
import java.util.List;


class Tienda {

    // Lista donde se guardan los dispositivos
    private List<Dispositivo> dispositivos = new ArrayList<>();

    // Método para agregar dispositivos
    public void agregarDispositivo(Dispositivo d) {
        dispositivos.add(d);
    }

    
    public double calcularTotal() {

        double total = 0;

        
        for (Dispositivo d : dispositivos) {

            // Sumamos el precio de cada dispositivo
            total += d.getPrecio();
        }

        return total;
    }

    // Método para mostrar dispositivos
    public void mostrarDispositivos() {

        System.out.println("\n--- DISPOSITIVOS EN LA TIENDA ---");

        for (Dispositivo d : dispositivos) {
            System.out.println(
                "Dispositivo: " + d.getNombre() +
                " | Precio: $" + d.getPrecio()
            );
        }
    }
}