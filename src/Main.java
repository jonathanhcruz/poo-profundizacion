import Base.Animal;
import Base.Comportamiento;
import Domesticas.Perro;
import Salvajes.Leon;

public class Main {
  public static void main(String[] args) {
    Animal perro = new Perro("Fido", 4);
    Animal leon = new Leon("Simba", 7);

    perro.hacerSonido();
    perro.moverse();
    ((Comportamiento) perro).alimentarse();

    leon.hacerSonido();
    leon.moverse();
    ((Comportamiento) leon).alimentarse();
  }
}