package com.sistemadelicencias.service;

import java.time.LocalDate;
import java.time.Period;

public class LicenciaService {

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

}
