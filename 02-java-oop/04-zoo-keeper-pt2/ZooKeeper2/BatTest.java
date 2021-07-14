package OOP.ZooKeeper2;

public class BatTest {
    public static void main(String[] args) {
    Mammal m=new Mammal(300);
    Bat b=new Bat(300);

    
    System.out.println("Mamals Defult Energy Level :" + m.energyLevel);
    b.Fly("Twice");
    System.out.println("i am fly twic "+ b.displyEnergy());
    b.attackTown(3);
    System.out.println("i attack the town 3 times" + b.displyEnergy());
    b.eatHumans(2);
    System.out.println("i eat 2 human " + b.displyEnergy());
    }
}
