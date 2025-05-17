package Salvajes;

public class Cocodrilo extends Salvaje {
  public Cocodrilo(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " hace un rugido profundo.");
  }
}
