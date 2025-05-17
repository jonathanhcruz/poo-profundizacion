package Salvajes;

public class Leon extends Salvaje {
  public Leon(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " ruge fuertemente.");
  }
}