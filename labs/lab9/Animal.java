// class
public abstract class Animal {
  // instance var
  private String name, eats, color;
  private boolean vegetarian;
  private double speed;

  // constructor 1
  public Animal(String name, boolean veg, String food, String color) {
    this.name = name;
    vegetarian = veg;
    eats = food;
    this.color = color;
  }

  // constructor 2
  public Animal(String name, boolean veg, String food, String color, double speed) {
    this.name = name;
    vegetarian = veg;
    eats = food;
    this.color = color;
    this.speed = speed;
  }

  // stuff below are all get/set I'm not commenting them
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public void setVegetarian(boolean vegetarian) {
    this.vegetarian = vegetarian;
  }

  public String getEats() {
    return eats;
  }

  public void setEats(String eats) {
    this.eats = eats;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(double speed) {
    this.speed = speed;
  }
}
