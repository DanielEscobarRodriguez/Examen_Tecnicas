package ejercicio_3;

import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ascensor ascensor = new Ascensor(0);
        PanelInterno panelInterno = new PanelInterno(ascensor);
        PanelExterno[] panelesExternos = new PanelExterno[5];
        for (int i = 0; i < 5; i++) {
            panelesExternos[i] = new PanelExterno(ascensor, i);
        }

        boolean salir = false;
        while (!salir) {
            System.out.println("Ingrese una opcion: \n1. Mover ascensor desde dentro (indicar piso) \n2. Llamar ascensor desde un piso \n3. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el piso donde desea ir:");
                    int piso = scanner.nextInt();
                    panelInterno.moverA(piso);
                    break;
                case 2:
                    System.out.println("Ingrese el piso desde donde llama:");
                    int pisoLlamada = scanner.nextInt();
                    panelesExternos[pisoLlamada].llamarAscensor();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        scanner.close();
    }
}

