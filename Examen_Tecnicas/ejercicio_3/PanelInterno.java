package ejercicio_3;

public class PanelInterno {
    private Ascensor ascensor;

    public PanelInterno(Ascensor ascensor) {
        this.ascensor = ascensor;
    }

    public void mostrarPisoActual() {
        System.out.println("Piso Actual: " + ascensor.getPisoActual());
    }

    public void moverA(int piso) {
        ascensor.moverA(piso);
    }
}
