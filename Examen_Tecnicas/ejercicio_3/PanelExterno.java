package ejercicio_3;

public class PanelExterno {
    private Ascensor ascensor;
    private int piso;

    public PanelExterno(Ascensor ascensor, int piso) {
        this.ascensor = ascensor;
        this.piso = piso;
    }

    public void llamarAscensor() {
        if (ascensor.isParado()) {
            ascensor.moverA(piso);
        } else {
            System.out.println("Ascensor en movimiento. Espere por favor.");
        }
    }

    public void mostrarEstadoAscensor() {
        if (ascensor.isParado()) {
            System.out.println("Ascensor parado en el piso " + ascensor.getPisoActual());
        } else {
            System.out.println("Ascensor en movimiento hacia el piso " + ascensor.getPisoActual());
        }
    }
}

