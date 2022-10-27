package Controller;

import AccessData.AccessData;
import Model.proyecto;
import view.AgregarProyectoController;

import java.sql.ResultSet;

public class AgregarProyecto {
    /**
     * función para añadir un proyecto en la base de datos
     * @param direccion Ubicacion del proyecto
     * @param nombre Titulo del proyecto
     * @param categoria Categoria del proyecto
     * @param fechaCreacion Fecha de la creacion del proyecto
     * @param ultimaModificacion Fecha de la ultima creacion del proyecto
     * @param repositorio
     *
     *
     *
     */



    public static void addVideo(String direccion,String nombre, String categoria, String fechaCreacion, String ultimaModificacion, String repositorio){
        if (URL.equals("Sin video")){
            AddVideoController.alertVideoNotSelected();
        } else {
            if (!checkURL(URL)){
                Video newVideo = new Video(URL,name,category,description);
                AccessData.insertVideo(newVideo.getURL(),newVideo.getName(),newVideo.getCategory(),newVideo.getDate().toString(),newVideo.getDescription());
                AddVideoController.stopVideo();
                AddVideoController.alertSuccessfullyAddVideo();
            } else {
                AddVideoController.alertVideoExists();
            }
        }
    }

    /**
     * función para determinar si el url de un video ya existe en la base de datos
     * @param URL Ubicacion del video
     * @return retorna un valor booleano para saber si cumple con la igualdad
     */
    public static boolean checkURL(String URL)  {
        ResultSet video = AccessData.getAllVideos();
        try {
            while(video.next()){
                if (video.getString("ubicacion").equals(URL)){
                    return true;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
