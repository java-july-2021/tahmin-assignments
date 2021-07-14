package OOP.ZooKeeper2;
public class Mammal {
  protected int energyLevel;
  public Mammal(int energyLevel) {
    this.energyLevel = energyLevel;
  }
  public int displyEnergy() {
    System.out.println("My Energy Level is :" + energyLevel);
    return energyLevel;
  }
}
