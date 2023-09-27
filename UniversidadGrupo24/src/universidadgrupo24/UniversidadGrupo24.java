/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo24;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import javax.swing.JOptionPane;
import accesoADatos.AlumnoData;
import accesoADatos.Conexion;
import accesoADatos.MateriaData;
import entidades.Alumno;
import entidades.Materia;
import vistas.MenuPrincipal;

/**
 *
 * @author usuario
 */
public class UniversidadGrupo24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuPrincipal vistas=new MenuPrincipal();
        vistas.show();

    }
    
}
