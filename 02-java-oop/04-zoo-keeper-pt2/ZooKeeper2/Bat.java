package OOP.ZooKeeper2;

public class Bat extends Mammal {
    public Bat(int energyLevel) {
        super(energyLevel);
    }

    public void Fly(String z) {
        System.out.println("I am a Bat !");
        energyLevel -= 50;
    }

    public void eatHumans(int x) {
        System.out.println("Eating Human ");
        energyLevel += 25;
        
    }

    public void attackTown(int y) {
        System.out.println("Bat Attacked the Town ");
        energyLevel -= 100;
    }
}
