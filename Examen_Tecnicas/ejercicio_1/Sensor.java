package ejercicio_1;

public class Sensor{
    private boolean Activado;
    private double UltimaLectura;

    public Sensor() {
        this.Activado = false;
        this.UltimaLectura = 0.0;
    }

    public void activado() {
        this.Activado = true;
        System.out.println("Sensor activado.");
    }

    public void desactivado() {
        this.Activado = false;
        System.out.println("Sensor desactivado.");
    }

    public double getLectura() {
        if (!Activado) {
            System.out.println("El sensor está desactivado. Actívelo para obtener lecturas.");
            return 0.0;
        }

        this.UltimaLectura = Math.random() * 100;
        return UltimaLectura;
    }

    public boolean isActive() {
        return Activado;
    }

    public static void main(String[] args) {
        Sensor mySensor = new Sensor();
        mySensor.activado();
        double reading = mySensor.getLectura();
        System.out.println("Lectura actual: " + reading);
        mySensor.desactivado();
    }
}