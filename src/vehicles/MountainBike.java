package vehicles;

import com.mysql.cj.protocol.x.ReusableOutputStream;

public class MountainBike extends Bicycle { //Bicycle 상속받을랭! 상속하면 여기안에 Bicylce내용이 다 있다. 생각하면 됨!
    int seatHight;
    public MountainBike(){
    }

    public MountainBike(int price, String color, int seatHight){
        this.seatHight = seatHight;
        super.price = price;
        super.color = color;
    }

    public String toString(){  //출력시킬때 string 으로 데이터 타입 변경
        String str = "price : " + super.price + " color : " + super.color + "seatHight" + this.seatHight;
        return str; 
    }

    
}

