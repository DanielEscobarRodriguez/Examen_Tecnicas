package ejercicio_2;

public class Main {
    public static void main(String[] args) {
        
        Persona presidente = new Persona("Juan Pérez", "12345678X", "Calle del Pino 123, Ciudad Real");

        Empresa greenGarden = new Empresa(presidente);

        Persona gerente1 = new Persona("Ana Martínez", "87654321Y", "Avenida Principal 456, Toledo");
        Persona gerente2 = new Persona("Luis Gómez", "56789012Z", "Ronda de Valencia 789, Madrid");

        UnidadDeNegocio unidad1 = new UnidadDeNegocio(gerente1, 50, 150000.00, 200000.00, 25);
        UnidadDeNegocio unidad2 = new UnidadDeNegocio(gerente2, 30, 120000.00, 150000.00, 20);

        UnidadDeNegocio subunidad1 = new UnidadDeNegocio(new Persona("Sofía Navarro", "65432178M", "Paseo de la Castellana, Madrid"), 20, 50000.00, 75000.00, 15);
        unidad1.agregarSubUnidadDeNegocio(subunidad1);

        greenGarden.agregarUnidadDeNegocio(unidad1);
        greenGarden.agregarUnidadDeNegocio(unidad2);

        System.out.println("Beneficios totales de Green Garden: " + greenGarden.obtenerBeneficiosTotales());
        System.out.println("Inversión total en edificios: " + greenGarden.obtenerInversionTotal());
        System.out.println("Número medio de contratos por semana: " + greenGarden.obtenerNumeroMedioContratos());
    }
}
