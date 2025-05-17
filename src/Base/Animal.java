package Base;

public abstract class Animal {
  protected String nombre;
  protected int edad;

  public Animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  // Polimorfismo al redefinir el método en las subclases
  public abstract void hacerSonido();

  public void moverse() {
    System.out.println(nombre + " se está moviendo.");
  }
}