import java.util.HashMap;

public class ClassHashMaps {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first",1);//null
            hashMap.put("second",2);//null
            hashMap.put("third",3);//null
            hashMap.get("third");//Integer@24 "3"
            hashMap.size(); //3
            hashMap.put("second",5); //Integer@34 "2"
            hashMap.remove("second"); //Integer@33 "5"
            hashMap.keySet();//HashMap$KeySet@38 size=2 , 리스트와 같은역
            hashMap.values();//HashMap$Values@53 size=2
            hashMap.clear();
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}
