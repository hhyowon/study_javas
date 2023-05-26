package beak;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); 
    String  [] bucket ={"","","",""," "} ;
    int [] bucket_price  ={};

    int i;
    System.out.println("장바구니(최대 5개 까지 가능)");

            for(i=0; i<5 ; i=i+1){
                System.out.print((i+1)+" 번째 담기 :");
                bucket[i] = myObj.nextLine();     
            }

            System.out.println("--- 담은 내용물 --- ");

            for(i=0;i<5;i=i+1){ //담은 내용물을 보기 위한 for문
                System.out.print(bucket[i]+",");
            }

            System.out.println("--- 계산 시작 --- ");
            for(i=0;i<bucket.length;i=i+1){ //가격입력을 위한 for문
                System.out.print((i+1)+" 번째 가격 :");
                bucket_price[i] = myObj.nextInt();  

                if(bucket_price[i] > 100){
                    System.out.println("100원 초과 0원 적용");
                    bucket_price[i] = 0;
                }else if(bucket_price[i] == 0){
                    break;                     
                }  
                
                
            }

            System.out.println("--- 담은 총합 --- ");
            System.out.println(" 합계 : ");
            System.out.println("--- 계산 종료 --- ");


    }
    
}
