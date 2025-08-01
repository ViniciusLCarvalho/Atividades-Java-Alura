package Animal;
public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro dog = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um cachorro");
        }
    }
}
