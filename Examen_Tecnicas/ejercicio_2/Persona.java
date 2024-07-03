package ejercicio_2;

public class Persona {
    private String nombre;
    private String NIF;
    private String direccionPostal;

    public Persona(String nombre, String NIF, String direccionPostal) {
        this.nombre = nombre;
        this.NIF = NIF;
        this.direccionPostal = direccionPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNIF() {
        return NIF;
    }

    public String getDireccionPostal() {
        return direccionPostal;
    }
}

