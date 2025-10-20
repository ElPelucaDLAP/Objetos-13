import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     Documento a1 = new Documento("Charly SUS","La programación permite crear soluciones automatizadas, mejorar procesos " +
             "cotidianos y desarrollar herramientas que transforman la manera en que trabajamos seguro.");
        a1.anadirAutor("Ricardo");
        a1.anadirPalabraClave("Auto");
        a1.anadirPalabraClave("Escoba");
     Documento a2 = new Documento("Sebastian SUS ","El aprendizaje constante es esencial para adaptarse a los cambios " +
             "tecnológicos y aprovechar nuevas oportunidades.");
        a2.anadirAutor("Manuel");
        a2.anadirPalabraClave("Cruz");
        a2.anadirPalabraClave("Taza");
        ArrayList<Documento>documentosParaRevisar =new ArrayList<>();
        documentosParaRevisar.add(a1);
        documentosParaRevisar.add(a2);
        //busqueda por nombre
        System.out.println("Tiene nombre x:");
        BusquedaPorNombre tipo1 = new BusquedaPorNombre("Charly SUS");
        ArrayList<Documento> resultado = tipo1.filtrar(documentosParaRevisar);
        revisarArraylist(resultado);
        //busqueda por autor
        System.out.println("Contiene autor:");
        BusquedaPorAutor tipo2 = new BusquedaPorAutor("Manuel");
        ArrayList<Documento> resultado2 = tipo2.Filtrar(documentosParaRevisar);
        revisarArraylist(resultado2);
        //busqueda por frase en nombre
        System.out.println("Contiene frase en el nombre:");
        BusquedaPorFraseEnNombre tipo3 = new BusquedaPorFraseEnNombre("SUS");
        ArrayList<Documento> resultado3 = tipo3.filtrar(documentosParaRevisar);
        revisarArraylist(resultado3);
        //Busqueda por contenido palabra clave
        System.out.println("Contiene palabra clave:");
        BusquedaConEnContenidoPalabraClave tipo4 = new BusquedaConEnContenidoPalabraClave("Auto");
        ArrayList<Documento> resultado4 = tipo4.filtrar(documentosParaRevisar);
        revisarArraylist(resultado4);
        //Busqueda por no contener palabra clave
        System.out.println("No contiene palabra clave");
        BusquedaSinPalabraClave tipo5 = new BusquedaSinPalabraClave("Auto");
        ArrayList<Documento> resultado5 = tipo5.filtrar(documentosParaRevisar);
        revisarArraylist(resultado5);
        //Busqueda por palabra encontrada en el contenido
        System.out.println("Contiene frase/palabra en contenido: ");
        BusquedaPorFraseOpalabraEnContenido tipo6 = new BusquedaPorFraseOpalabraEnContenido("crear");
        ArrayList<Documento> resultado6 = tipo6.filtrar(documentosParaRevisar);
        revisarArraylist(resultado6);
        //Busqueda por contenido con 20 o mas palabras
        System.out.println("Contiene 20 palabras o mas en su contenido: ");
        BusquedaPorContenidoMayora20Palabras tipo7 = new BusquedaPorContenidoMayora20Palabras();
        ArrayList<Documento> resultado7 = tipo7.filtrar(documentosParaRevisar);
        revisarArraylist(resultado7);
        //Busqueda doble
        System.out.println("doble busqueda ejemplos");
        ArrayList<Documento> resultadox = tipo7.filtrar(documentosParaRevisar);
        ArrayList<Documento> resultadoy = tipo4.filtrar(documentosParaRevisar);
        if (resultadox.equals(resultadoy)){
            revisarArraylist(resultadox);

        }else System.out.println("sin coincidencias");
    }
    public  static void revisarArraylist (ArrayList<Documento> arrayList){
        for (int i = 0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i).getTitulo());
        }
    }
}