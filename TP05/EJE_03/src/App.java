public class App {
    public static void main(String[] args) throws Exception {
        
        //Agregacion es "tiene una parte de"
        //Asociacion unidireccional "conoce a"
        Autor a1 = new Autor("GRRM", "Ingles");
        Editorial e1 = new Editorial("Penguin House", "Av. Siempre viva 123");
        Libro l1 = new Libro("Danza de Dragones", 12345);
        
        System.out.println(l1);
        l1.setAutor(a1);
        l1.setEditorial(e1);
        System.out.println("***********");
        System.out.println("***********");
        System.out.println(l1);
    }
}
