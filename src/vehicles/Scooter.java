package vehicles;

public class Scooter extends AbstractVechicle{
    public int speedUp(int val){
        this.speed = this.speed  + this.increment;
        return this.speed;
    }
    
}
