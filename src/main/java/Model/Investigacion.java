package Model;

public class Investigacion {
    private String titulo;
    private String autor;
    private String contenido;


    public Investigacion(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Investigacion{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", contenido='" + contenido + '\'' +
                '}';
    }
}
