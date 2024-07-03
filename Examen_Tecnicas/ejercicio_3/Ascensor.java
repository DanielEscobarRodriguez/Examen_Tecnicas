package ejercicio_3;

public class Ascensor {

    private boolean parado;
    private int pisoActual;

    public Ascensor(int pisoInicial) {
        this.parado = true;
        this.pisoActual = pisoInicial;
    }

    public boolean isParado() {
        return parado;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void moverA(int piso) {
        if (piso != pisoActual) {
            parado = false;
            System.out.println("Moviendo el ascensor...");
            try {
                Thread.sleep(Math.abs(piso - pisoActual) * 1000); // Simulación del tiempo de movimiento
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            pisoActual = piso;
            System.out.println("Ascensor llego al piso " + pisoActual);
            parado = true;
        }
    }
}

