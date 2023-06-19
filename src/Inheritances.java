import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;

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
            MountainBike mountainBike = new MountainBike(6200,"yellow",5);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
          System.out.println(e.getMessage());
        }
    }
    
}
