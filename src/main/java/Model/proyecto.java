package Model;

import java.util.ArrayList;

public class proyecto {

    private String direccion;
    private String nombre;
    private String categoria;
    private String fechaCreacion;
    private String ultimaModificacion;
    private String repositorio;
    private ArrayList<Model.Investigacion> investigaciones;
    private ArrayList<Model.media> media;


    public proyecto (String nombre, ArrayList categorias, String fechaCreacion, String ultimaModificacion, String repositorio) {

        this.direccion = direccion;
        this.nombre = nombre;
        this.categoria = categoria;
        this.fechaCreacion = fechaCreacion;
        this.ultimaModificacion = ultimaModificacion;
        this.repositorio = repositorio;
        this.investigaciones = new ArrayList<>();
        this.media = new ArrayList<>();

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(String ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }
}
