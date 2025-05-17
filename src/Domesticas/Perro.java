package Domesticas;


public class Perro extends Domestico {
  public Perro(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " dice: ¡Guau!");
  }
}
