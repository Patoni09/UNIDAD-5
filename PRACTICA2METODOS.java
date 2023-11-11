/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica2metodos;

/**
 *
 * @author ce182
 */
public class PRACTICA2METODOS {
    public static double[] promedioCalificacionesPorEstudiante(double[][] calificaciones) {
    double[] promedios = new double[calificaciones.length];

    for (int i = 0; i < calificaciones.length; i++) {
        double suma = 0;
        for (int j = 0; j < calificaciones[i].length; j++) {
            suma += calificaciones[i][j];
        }
        promedios[i] = suma / calificaciones[i].length;
    }

    return promedios;
}
    public static double[] promedioCalificacionesPorMateria(double[][] calificaciones) {
    double[] promedios = new double[calificaciones[0].length];

    for (int j = 0; j < calificaciones[0].length; j++) {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i][j];
        }
        promedios[j] = suma / calificaciones.length;
    }

    return promedios;
}
public static void main(String[] args) {
    double[][] calificaciones = {{90.5, 85.0, 78.5, 920},
                                 {88.0, 76.5, 89.0, 945},
                                 {70.0, 82.5, 91.0, 875}};

    double[] promediosEstudiantes = promedioCalificacionesPorEstudiante(calificaciones);
    double[] promediosMaterias = promedioCalificacionesPorMateria(calificaciones);

    // Imprimir promedios por estudiante
    System.out.println("Promedio de calificaciones por estudiante:");
    for (int i = 0; i < promediosEstudiantes.length; i++) {
        System.out.println("Estudiante " + (i + 1) + ": " + promediosEstudiantes[i]);
    }

    // Imprimir promedios por materia
    System.out.println("Promedio de calificaciones por materia:");
    for (int j = 0; j < promediosMaterias.length; j++) {
        System.out.println("Materia " + (j + 1) + ": " + promediosMaterias[j]);
    }
}



    
}

