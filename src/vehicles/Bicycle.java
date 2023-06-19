package vehicles;

import java.util.HashMap;

public class Bicycle {
    int price;
    String color;
    HashMap<String, Object> spec;

    public Bicycle(){
        System.out.println("Bicycle = param empty");
        
    }
    public Bicycle(int price, String color){
        this.price = price; //this.price는 내부class 변수 불러온것(int price) , 오른쪽price는 넘어온 값 
        this.color = color;       
    }

    public String toString(){  //출력시킬때 string 으로 데이터 타입 변경
        String str = "price : " + this.price + " color : " + this.color;
        return str; 
    }

}
