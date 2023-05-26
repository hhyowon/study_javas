package cases;
import java.util.Scanner; 

public class CasherFor {
    public static void main(String[] args) {
        try{  
            Scanner myObj = new Scanner(System.in); 
            int [] bucket_price = new int[5]; //5개까지만 담기
            int i; //for문 돌리기 위한 변수
            int sum =0; //합을 넣기 위한 sum 변수

            System.out.println("장바구니(최대 5개 까지 가능)"); 
    
                    System.out.println("\n--- 계산 시작 --- ");
                    for(i=0;i<bucket_price.length;i=i+1){ //가격입력을 위한 for문
                        System.out.print((i+1)+" 번째 가격 :");
                        bucket_price[i] = myObj.nextInt();  //배열에 가격입력값 넣기 
    
                        if(bucket_price[i] > 100){  //100원 초과일때 
                            System.out.println("100원 초과 0원 적용");  
                            bucket_price[i] = 0;  //0원 적용
                        }else if(bucket_price[i] == 0){ //0일때 나감
                            break;             
                        }                                     
                    }
                    
                    for(i=0;i<bucket_price.length;i=i+1){               //가격합산을 위한 for문
                        sum =  sum + bucket_price[i]; 
                    }
                    
                    System.out.println("--- 담은 총합 --- ");
                    System.out.println(" 합계 : "+sum ); //합계출력
                    System.out.println("\n--- 계산 종료 --- ");
    
            }catch(Exception e){
                System.out.println();
            }finally{
                System.out.println();
            }
    
            System.out.println();
    
            }
        }
        