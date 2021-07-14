package OOP.ZooKeeper1;

public class GorilaTest {
    public static void main(String[] args) {
        Mammal mam=new Mammal(100);
        Gorila gor=new Gorila(80);

        mam.displyEnergy();
        System.out.println("It is Mamal and the mamal energyLevel:\n"+mam.energyLevel);
        gor.throwSometing();
        System.out.println(gor.energyLevel);
        gor.EatBanana();
        System.out.println(gor.energyLevel);
        gor.Climb();
        System.out.println(gor.energyLevel); 
        










}
}
