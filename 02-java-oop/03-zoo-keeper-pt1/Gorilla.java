public class Gorilla extends Mammal{
    public Gorilla(int energyLevel){
        super(energyLevel);
    }

    public void throwSomething(){
        System.out.println("The gorilla has thrown something.");
        this.energyLevel -= 5;
    }

    public void eatBananas(){
        System.out.println("The gorilla's satisfaction as grown.");
        this.energyLevel += 10;
    }

    public void climb(){
        System.out.println("The gorilla has climbed a tree");
        this.energyLevel -= 10;
    }
}
