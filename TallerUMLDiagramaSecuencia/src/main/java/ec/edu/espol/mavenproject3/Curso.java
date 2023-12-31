/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.mavenproject3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abeni
 */
public class Curso {

    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;

    public Curso(String id, String nombre, boolean estadoDisponible, Profesor responsable) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
        this.responsable = responsable;
    }

    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList();
    private List<Estudiante> estudiantesInscritos = new ArrayList();
    private List<Foro> foros = new ArrayList();

    private List<ActividadSumativa> actividadesSumativas = new ArrayList();
}
