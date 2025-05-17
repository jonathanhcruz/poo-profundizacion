package Salvajes;

public class Jirafa extends Salvaje {
  public Jirafa(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " hace sonidos suaves de jirafa.");
  }
}