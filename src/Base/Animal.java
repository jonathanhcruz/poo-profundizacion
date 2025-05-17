package Base;

public abstract class Animal {
  protected String nombre;
  protected int edad;

  public Animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public abstract void hacerSonido(); // Polimorfismo (método sobrescrito)

  public void moverse() {
    System.out.println(nombre + " se está moviendo.");
  }
}