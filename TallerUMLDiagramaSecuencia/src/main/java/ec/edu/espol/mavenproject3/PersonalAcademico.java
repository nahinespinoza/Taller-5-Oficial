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
public class PersonalAcademico extends Usuario{
    
    protected List<Incidente> indicentes = new ArrayList();
    
    public void reportarError(String email, String contenido){
        
    }
    
    public void solicitarAsesoramientoDelSistema(String email, String contenido){
        
    }
    
    public void comentarEnForo(Foro foro, String comentario){
        
    }

    public PersonalAcademico(String usuario, String contraseña, String nombre, String apellido) {
        super(usuario, contraseña, nombre, apellido);
    }

    public PersonalAcademico() {
    }
    
}
