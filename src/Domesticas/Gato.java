package Domesticas;

public class Gato extends Domestico {
  public Gato(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " dice: ¡Miau!");
  }
}