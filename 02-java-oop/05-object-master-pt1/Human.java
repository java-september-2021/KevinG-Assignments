public class Human {
    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;
    
    public Human(){
    this.strength = 3;
    this.stealth = 3;
    this.intelligence = 3;
    this.health = 100;
    }

    public void attackHuman(Human otherHuman) {
        otherHuman.health -= this.strength;
        System.out.println("This human attacked another human by "+  this.strength + ". The other human has a health of " + otherHuman.health);
    }

}