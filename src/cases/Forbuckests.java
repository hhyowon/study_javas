package cases;
import java.util.Scanner; 

public class Forbuckests {

    public static void main(String[] args) {
        try {
            //장바구니 3개만 담게 선언
            Scanner myObj = new Scanner(System.in); 
            String bucket_1 ="";
            String bucket_2 ="";
            String bucket_3 ="";
            String  [] bucket ={"","",""} ;
            int i;

            System.out.println("--- 장보기 시작 ---");
            System.out.println("장바구니(최대 3개 까지 가능)");


            for(i=0; i<3 ; i=i+1){  //장바구니에 담기 위한 for문
                System.out.print((i+1)+" 번째 담기 :");
                bucket[i] = myObj.nextLine();     
            }

            System.out.println("--- 담은 내용물 --- ");

            for(i=0;i<3;i=i+1){ //담은 내용물을 보기 위한 for문
                System.out.print(bucket[i]+",");
            }
           
            
        } catch (Exception e) {

            // TODO: handle exception
        }finally{

        }

        System.out.println(
            //return 0;
        );
    }
}
