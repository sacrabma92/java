package ClaseLibro_1;
public class main {
    
    public static void main(String[] args) {
        Libro libro1 = new Libro(11111, "Harry Popoter", "Autor Buscando alo", 500);
        Libro libro2 = new Libro(2222, "Las flores", "Autor Margarito", 312);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        if(libro1.getNumPaginas() > libro2.getNumPaginas())
        {
            System.out.println(libro1.getTitulo() + " tiene mas paginas");
        }else{
            System.out.println(libro2.getNumPaginas() + " tiene mas paginas");
        }
    }
}
