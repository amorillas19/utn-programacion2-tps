public class App {
    public static void main(String[] args) throws Exception {
        
        Animal a1 = new Animal("Panzita", 15);
        Animal a2 = new Animal("Rulo", 9);
        Animal a3 = new Animal("Matufio", 1);
        Perro p = new Perro("Firulais", 10, "Callejero", false);

        Veterinaria vete = new Veterinaria("Patitas", "Av España");

        vete.agregarAnimal(a1);

        System.out.println(p);
 
    }
}
