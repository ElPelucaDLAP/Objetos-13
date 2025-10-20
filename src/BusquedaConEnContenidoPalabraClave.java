import java.util.ArrayList;

public class BusquedaConEnContenidoPalabraClave extends Busqueda{
    String PalabraClave;
    public BusquedaConEnContenidoPalabraClave (String palabraClave) {
    this.PalabraClave=palabraClave;
    }

    public String getPalabraClave() {
        return PalabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        PalabraClave = palabraClave;
    }

    @Override
    protected boolean criterio(Documento documento) {
        ArrayList<String> copia=documento.getPalabrasClave();
        int i = 0;
        boolean palabraClaveEncontrada = false;
        while (i<copia.size() && !palabraClaveEncontrada){
            if (copia.get(i).equals(this.PalabraClave)){
                palabraClaveEncontrada=true;
            }
            i++;
        }
        if (palabraClaveEncontrada){
            return true;
        }else return false;
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
