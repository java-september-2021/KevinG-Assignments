public class Mammal {
    protected int energyLevel;

    // Constrctor
    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }
    public int displayEnergyLevel(){
        System.out.println("The mammal's energy level is "+ this.energyLevel);
        return this.energyLevel;
    }

}