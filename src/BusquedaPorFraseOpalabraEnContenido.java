import java.util.ArrayList;

public class BusquedaPorFraseOpalabraEnContenido extends Busqueda{
    String fraseOpalabra;
    public BusquedaPorFraseOpalabraEnContenido (String fraseOpalabra){
        this.fraseOpalabra=fraseOpalabra;
    }

    public String getFraseOpalabra() {
        return fraseOpalabra;
    }

    public void setFraseOpalabra(String fraseOpalabra) {
        this.fraseOpalabra = fraseOpalabra;
    }

    @Override
    protected boolean criterio(Documento documento) {
        if (documento.getContenidoTextual().contains(this.fraseOpalabra)){
            return true;
        }else  return false;
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
