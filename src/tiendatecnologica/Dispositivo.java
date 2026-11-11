package tiendatecnologica;


class Dispositivo {

    // Atributos del dispositivo
    private String nombre;
    private double precio;

    // Constructor
    public Dispositivo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getter del precio
    public double getPrecio() {
        return precio;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }
}