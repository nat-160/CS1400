// class
public class Cat extends Animal {
  // vars
  private int numWhiskers;

  // constructors
  public Cat(String name, boolean veg, String food, String color, int numWhiskers) {
    super(name, veg, food, color);
    this.numWhiskers = numWhiskers;
  }

  public Cat(String name, boolean veg, String food, String color, int numWhiskers, double speed) {
    super(name, veg, food, color, speed);
    this.numWhiskers = numWhiskers;
    setSpeed(speed);
  }

  // get/set things
  public int getNumWhiskers() {
    return numWhiskers;
  }

  public void setNumWhiskers(int numWhiskers) {
    this.numWhiskers = numWhiskers;
  }

  public void setSpeed(double speed) {
    super.setSpeed(speed * 1.1);
  }
}
