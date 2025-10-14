import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String>listaDeAutores;
    private String contenidoTextual;
    private ArrayList<String>palabrasClave;
    public Documento (String titulo,String contenidoTextual){
        this.titulo=titulo;
        this.contenidoTextual=contenidoTextual;
        listaDeAutores=new ArrayList<>();
        palabrasClave=new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getListaDeAutores() {
        return listaDeAutores;
    }

    public void setListaDeAutores(ArrayList<String> listaDeAutores) {
        this.listaDeAutores = listaDeAutores;
    }

    public String getContenidoTextual() {
        return contenidoTextual;
    }

    public void setContenidoTextual(String contenidoTextual) {
        this.contenidoTextual = contenidoTextual;
    }

    public ArrayList<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(ArrayList<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
}
