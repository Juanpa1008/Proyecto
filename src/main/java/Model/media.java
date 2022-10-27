package Model;

public class media {

    private String titulo;
    private String descripcion;
    private String direccion;


    public media(String titulo, String descripcion, String direccion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.direccion = direccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "media{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
