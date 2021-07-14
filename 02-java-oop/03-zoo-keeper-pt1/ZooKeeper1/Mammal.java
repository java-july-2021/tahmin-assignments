package OOP.ZooKeeper1;
public class Mammal {
protected int energyLevel= 100;

public Mammal(int energyLevel){
this.energyLevel=energyLevel;
}

public int displyEnergy(){
    System.out.println("Energy Level :"+ energyLevel);
    return energyLevel;
}
}

    

