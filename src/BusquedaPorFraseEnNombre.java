import java.util.ArrayList;

public class BusquedaPorFraseEnNombre extends Busqueda{
    private String Titulo;
    public BusquedaPorFraseEnNombre (String titulo){
        this.Titulo=titulo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    @Override
    public boolean criterio(Documento documento) {
        if (documento.getTitulo().contains(Titulo)){
            return true;
        }else {
            return false;
        }
    }
    public ArrayList<Documento> filtrar (ArrayList<Documento> documentos){
        ArrayList<Documento> resultado = new ArrayList<>();
        for (Documento d : documentos){
            if (criterio(d)){
                resultado.add(d);
            }
        }
        return resultado;
    }
}
