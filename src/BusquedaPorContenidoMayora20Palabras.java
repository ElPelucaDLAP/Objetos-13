import java.util.ArrayList;
public class BusquedaPorContenidoMayora20Palabras extends Busqueda{
    public BusquedaPorContenidoMayora20Palabras (){
    }

    @Override
    protected boolean criterio(Documento documento) {
        String texto=documento.getContenidoTextual();
        String[] palabras = texto.trim().split("\\s+"); // separa por uno o más espacios
        int cantidad = palabras.length;
        if (cantidad>=20){
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
