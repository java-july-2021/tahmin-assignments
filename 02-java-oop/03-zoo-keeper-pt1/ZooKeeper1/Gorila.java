package OOP.ZooKeeper1;

public class Gorila extends Mammal {
    public Gorila(int energyLevel){
        super(energyLevel);
    }
public void throwSometing(){
System.out.println("Please ,throwing stuff here!");
       energyLevel-=5;
}
public void EatBanana(){
System.out.println("Eating Banana ! ");
       energyLevel+=10;

}
public void Climb(){
    System.out.println("the gorilla has climbed a tree!");
       energyLevel-=10;
}

}
