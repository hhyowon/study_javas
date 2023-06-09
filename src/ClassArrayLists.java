import java.util.ArrayList;

public class ClassArrayLists {
    
    public static void main(String[] args) {
        try {
            int [] numbers = {1,2,3};
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);  //true          
            arrayList.add(2);  //true         
            arrayList.add(3); //true 
            arrayList.size(); // 3 ,배열사이즈
            //int val = arrayList.get(2) 
            arrayList.set(1,5); // 2
            arrayList.remove(0); // 1, 0번재 숫자 삭제하기
            arrayList.clear(); // (void) , 초기화 
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
