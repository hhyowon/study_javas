package vehicles;

// <퀘스트>
// - RoadCycle.java
// - 제품명이 초기화되고, toString 출력
// - 상속 Bicycle.java
// - 동작은 Inheritances.java

public class RoadCycle extends Bicycle{
    String productname;

    public RoadCycle(){
    }

      public RoadCycle( int price, String color, String productname){
        this.productname = productname;
        super.price = price;
        super.color = color;
    }
 

      public String toString(){  //출력시킬때 string 으로 데이터 타입 변경
        String str = "productname :" + this.productname + " price : " + super.price + " color : " + super.color ;
        return str; 
    }

}
