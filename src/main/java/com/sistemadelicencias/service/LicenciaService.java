package com.sistemadelicencias.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class LicenciaService {

    private static final float GASTOS_ADMINISTRATIVOS = 8.0f;

    public int calcularVigenciaLicencia(LocalDate fechaNacimiento, boolean primeraLicencia) {
        int edad = calcularEdad(fechaNacimiento);

        if (edad >= 17 && edad < 21) {
            return primeraLicencia ? 1 : 3;
        } else if (edad >= 21 && edad <= 46) {
            return 5;
        } else if (edad >= 47 && edad <= 60) {
            return 4;
        } else if (edad >= 61 && edad <= 70) {
            return 3;
        } else if (edad > 70) {
            return 1;
        } else {
            throw new IllegalArgumentException("Edad no válida para obtener una licencia.");
        }
    }

    public int calcularEdad(LocalDate fechaDeNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaDeNacimiento, fechaActual).getYears();
    }

    public float calcularCostoLicencia(char claseLicencia, int vigenciaEnAnios) {
        float costoBase = obtenerCostoBaseDesdeDB(claseLicencia, vigenciaEnAnios);
        return costoBase + GASTOS_ADMINISTRATIVOS;
    }

    // Método simulado para obtener el costo base desde la "base de datos"
    private float obtenerCostoBaseDesdeDB(char claseLicencia, int vigenciaEnAnios) {
        // Simulación de datos de la base de datos usando un Map
        Map<String, Float> costosLicencia = new HashMap<>();
        costosLicencia.put("A1", 100.0f);
        costosLicencia.put("A3", 200.0f);
        costosLicencia.put("B5", 300.0f);
        costosLicencia.put("C4", 400.0f);
        costosLicencia.put("D3", 500.0f);
        costosLicencia.put("E1", 600.0f);

        // Generar la clave basada en la clase de licencia y vigencia
        String key = "" + claseLicencia + vigenciaEnAnios;
        return costosLicencia.getOrDefault(key, 0.0f);  // Retornar 0.0 si no se encuentra el costo
    }

}
