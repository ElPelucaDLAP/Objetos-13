import java.util.ArrayList;
import java.util.List;

public class BusquedaPorNombre extends Busqueda{
    private String Titulo;
    public BusquedaPorNombre (String titulo){
        this.Titulo=titulo;
    }
    @Override
    public boolean criterio(Documento documento) {
        if (documento.getTitulo().equals(Titulo)){
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
