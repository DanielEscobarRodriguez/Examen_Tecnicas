package ejercicio_2;

import java.util.ArrayList;
import java.util.List;

public class UnidadDeNegocio {
    private double beneficiosUltimoTrimestre;
    private double inversionEdificios;
    private double numeroMedioContratos;
    private List<UnidadDeNegocio> subUnidadesDeNegocio;

    public UnidadDeNegocio(Persona gerente, int numeroEmpleados, double beneficiosUltimoTrimestre, double inversionEdificios, double numeroMedioContratos) {
        this.beneficiosUltimoTrimestre = beneficiosUltimoTrimestre;
        this.inversionEdificios = inversionEdificios;
        this.numeroMedioContratos = numeroMedioContratos;
        this.subUnidadesDeNegocio = new ArrayList<>();
    }

    public void agregarSubUnidadDeNegocio(UnidadDeNegocio subUnidad) {
        subUnidadesDeNegocio.add(subUnidad);
    }

    public double obtenerBeneficiosTotales() {
        double total = beneficiosUltimoTrimestre;
        for (UnidadDeNegocio subUnidad : subUnidadesDeNegocio) {
            total += subUnidad.obtenerBeneficiosTotales();
        }
        return total;
    }

    public double obtenerInversionTotal() {
        double total = inversionEdificios;
        for (UnidadDeNegocio subUnidad : subUnidadesDeNegocio) {
            total += subUnidad.obtenerInversionTotal();
        }
        return total;
    }

    public double obtenerNumeroMedioContratos() {
        if (subUnidadesDeNegocio.isEmpty()) {
            return numeroMedioContratos;
        }
        double suma = 0;
        for (UnidadDeNegocio subUnidad : subUnidadesDeNegocio) {
            suma += subUnidad.obtenerNumeroMedioContratos();
        }
        return suma / subUnidadesDeNegocio.size();
    }
}

