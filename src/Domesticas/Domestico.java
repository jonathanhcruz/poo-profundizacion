package Domesticas;

import Base.Animal;
import Base.Comportamiento;

public class Domestico extends Animal implements Comportamiento {

  public Domestico(String nombre, int edad) {
    super(nombre, edad);
  }

  @Override
  public void alimentarse() {
    System.out.println(nombre + " se alimenta con comida proporcionada por humanos.");
  }

  @Override
  public void dormir() {
    System.out.println(nombre + " duerme en casa.");
  }

  @Override
  public void hacerSonido() {
    System.out.println(nombre + " hace un sonido doméstico.");
  }
}
