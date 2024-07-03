package ejercicio_1;

import java.util.ArrayList;
import java.util.List;

public class SensorCompuesto {
    private List<Sensor> sensores;
    private boolean Activado;

    public SensorCompuesto() {
        this.sensores = new ArrayList<>();
        this.Activado = false;
    }

    public void addSensor(Sensor sensor) {
        this.sensores.add(sensor);
    }

    public void activate() {
        if (!sensores.isEmpty()) {
            for (Sensor sensor : sensores) {
                sensor.activado();
            }
            this.Activado = true;
            System.out.println("Todos los sensores han sido activados.");
        }
    }

    public void deactivate() {
        for (Sensor sensor : sensores) {
            sensor.desactivado();
        }
        this.Activado = false;
        System.out.println("Todos los sensores han sido desactivados.");
    }

    public List<Double> getAllReadings() {
        List<Double> lecturas = new ArrayList<>();
        if (!Activado) {
            System.out.println("El SensorCompuesto está desactivado. Actívelo para obtener lecturas.");
            return lecturas;
        }
        for (Sensor sensor : sensores) {
            lecturas.add(sensor.getLectura());
        }
        return lecturas;
    }

    public boolean isActive() {
        return Activado;
    }
}
