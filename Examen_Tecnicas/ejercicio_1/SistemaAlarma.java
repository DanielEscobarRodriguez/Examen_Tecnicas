package ejercicio_1;

import java.util.List;

public class SistemaAlarma {
    private SensorCompuesto sensorCompuesto;
    private boolean AlarmaActiva;

    public SistemaAlarma(SensorCompuesto sensorCompuesto) {
        this.sensorCompuesto = sensorCompuesto;
        this.AlarmaActiva = false;
    }

    public void activateAlarm() {
        sensorCompuesto.activate();
        AlarmaActiva = true;
        System.out.println("La alarma está activada.");
    }

    public void deactivateAlarm() {
        sensorCompuesto.deactivate();
        AlarmaActiva = false;
        System.out.println("La alarma está desactivada.");
    }

    public boolean isAlarmActive() {
        return AlarmaActiva;
    }

    public void checkSensors() {
        List<Double> readings = sensorCompuesto.getAllReadings();
        boolean shouldTriggerAlarm = readings.stream().anyMatch(reading -> reading > 50); // Suposición: cualquier lectura mayor a 50 es una condición de alarma
        if (shouldTriggerAlarm) {
            System.out.println("Condición de alarma detectada! Activando alarma...");
            activateAlarm();
        }
    }

    public static void main(String[] args) {
    
        Sensor sensor1 = new Sensor();
        Sensor sensor2 = new Sensor();

        SensorCompuesto sensorCompuesto = new SensorCompuesto();
        sensorCompuesto.addSensor(sensor1);
        sensorCompuesto.addSensor(sensor2);

        SistemaAlarma sistemaAlarma = new SistemaAlarma(sensorCompuesto);

        sistemaAlarma.activateAlarm();
        sistemaAlarma.checkSensors();
        sistemaAlarma.deactivateAlarm();
    }
}

