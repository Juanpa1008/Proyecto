package Controller;

import AccessData.AccessData;
import view.AgregarProyectoController;
import view.CreateProjectController;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Proyectos {
    /**
     * función para añadir un proyecto en la base de datos
     * @param direccion Ubicacion del proyecto
     * @param nombre Titulo del proyecto
     * @param categoria Categoria del proyecto
     * @param fechaCreacion Fecha de la creacion del proyecto
     * @param repositorio Ubicacion del repositorio del proyecto
     */

    public static void registrarProyecto(String direccion,String nombre, String categoria, String fechaCreacion, String repositorio){
            proyecto nuevoProyecto = (new proyecto(direccion,nombre,categoria,fechaCreacion,repositorio));
            AccessData.insertarProyecto(nuevoProyecto.getDireccion(),nuevoProyecto.getName(),nuevoProyecto.getCategory(),nuevoProyecto.getDate().toString(),nuevoProyecto.getDescription());
            CreateProjectController.alertSuccessfullyAddProject();
    }
}/
