package vehicles;

public class Car implements vehicle{
    int speed = 0;
    int increment = 20;


     @Override
    public int speedUp(int val) {
       this.speed  = this.speed+increment;
       return speed;
    }

    @Override
    public int speedDown(int val) {
      this.speed = this.speed-increment;
      return speed;
    }
    
}
