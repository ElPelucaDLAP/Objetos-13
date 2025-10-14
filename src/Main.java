import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     Documento a1 = new Documento("Charly","pipipi");
     Documento a2 = new Documento("Sebastian","adadada");

        ArrayList<Documento>documentosParaRevisar =new ArrayList<>();
        documentosParaRevisar.add(a1);
        documentosParaRevisar.add(a2);
        BusquedaPorNombre apa = new BusquedaPorNombre("Charly");
        ArrayList<Documento> resultado = apa.filtrar(documentosParaRevisar);
        for (int i = 0; i<resultado.size();i++){
            System.out.println(resultado.get(i).getTitulo());
        }
    }
}