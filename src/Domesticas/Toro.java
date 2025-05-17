package Domesticas;

public class Toro extends Domestico {
  public Toro(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " dice: ¡Muu!");
  }
}