import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Bike;
import vehicles.Car;
import vehicles.MountainBike;
import vehicles.RoadCycle;
import vehicles.Scooter;
import vehicles.vehicle;
import java.util.HashMap;


public class Inheritances {
public static void main(String[] args) {
        try {
            // Object 확인
            // ObjectInheritances objectInheritances = new ObjectInheritances();
           
            // 상속할 class 생성
            // Bicycle bicycle = new Bicycle(5500,"blue");          
            // System.out.println( bicycle.toString());

            //상속해 활용
            //MountainBike mountainBike = new MountainBike();
            // MountainBike mountainBike = new MountainBike(6200,"yellow",5);
            // System.out.println();

            // RoadCycle roadCycle = new RoadCycle(8000,"pink","예빈");
            // System.out.println( roadCycle.toString());
    
        
            //구현하고 호출하기
            // Car car = new Car();
            // int speed = car.speedUp(1);
            // speed = car.speedDown(2);

            // vehicle bike = new Bike(); 
            // vehicle car_second = new Car(); 
            // System.out.println();

            //HashMap<String, String> hashMap = new HashMap<>();
            
            //추상화 확인
            Scooter scooter = new Scooter();
            System.out.println(); 

        } catch (Exception e) {
            // TODO: handle exception
          System.out.println(e.getMessage());
        }
    }
    
}
