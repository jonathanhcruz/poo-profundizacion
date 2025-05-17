package Salvajes;

import Base.Animal;
import Base.Comportamiento;

public class Salvaje extends Animal implements Comportamiento {

  public Salvaje(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  public void alimentarse() {
    System.out.println(nombre + " caza para alimentarse.");
  }

  @Override
  public void dormir() {
    System.out.println(nombre + " duerme en la naturaleza.");
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " hace un sonido salvaje.");
  }
}
