import java.util.ArrayList;

public class BusquedaPorAutor extends Busqueda{
    String autor;
    public  BusquedaPorAutor (String nombreAutor) {
        this.autor=nombreAutor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    protected boolean criterio(Documento documento) {
        ArrayList<String> copia=documento.getListaDeAutores();
        int i = 0;
        boolean autorEncontrado = false;
        while (i<copia.size() && !autorEncontrado){
            if (copia.get(i).equals(this.autor)){
                autorEncontrado=true;
            }else i++;
        }
        if (autorEncontrado){
            return true;
        }else return false;
    }
    public ArrayList<Documento> Filtrar (ArrayList<Documento> documentos){
      ArrayList<Documento> resultado = new ArrayList<>();
      for (Documento d : documentos){
          if (criterio(d)){
              resultado.add(d);
          }
      }
      return resultado;
    }
}
