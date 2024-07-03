package ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<UnidadDeNegocio> unidadesDeNegocio;

    public Empresa(Persona presidente) {
        this.unidadesDeNegocio = new ArrayList<>();
    }

    public void agregarUnidadDeNegocio(UnidadDeNegocio unidad) {
        unidadesDeNegocio.add(unidad);
    }

    public double obtenerBeneficiosTotales() {
        double total = 0;
        for (UnidadDeNegocio unidad : unidadesDeNegocio) {
            total += unidad.obtenerBeneficiosTotales();
        }
        return total;
    }

    public double obtenerInversionTotal() {
        double total = 0;
        for (UnidadDeNegocio unidad : unidadesDeNegocio) {
            total += unidad.obtenerInversionTotal();
        }
        return total;
    }

    public double obtenerNumeroMedioContratos() {
        if (unidadesDeNegocio.isEmpty()) {
            return 0;
        }
        double suma = 0;
        for (UnidadDeNegocio unidad : unidadesDeNegocio) {
            suma += unidad.obtenerNumeroMedioContratos();
        }
        return suma / unidadesDeNegocio.size();
    }
}

