package cases;
import java.util.Scanner; 

public class PollsWhile {
    public static void main(String[] args) {
            try{  
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                String answer = "";
                System.out.println("선택에 따라 안내글을 보여드립니다.");
                boolean loops = true;
                while(loops){
                    System.out.println("-----작동key----");
                    System.out.println("(E)xit : 종료,(P)oll : 설문 시작,(S)tatistic : 설문 통계");                   
                    System.out.print("선택입력: ");
                    answer= myObj.nextLine();
                    if(answer.equals("P") || answer.equals("p")  || answer.equals("Poll")  || answer.equals("poll") ){
                    System.out.println("----- 설문 시작 ------");
                    }else if(answer.equals("S") || answer.equals("s")  || answer.equals("Statistic")  || answer.equals("statistic") ){
                    System.out.println("----- 설문 통계 ------");
                    }else if(answer.equals("E") || answer.equals("e")  || answer.equals("Exit")  || answer.equals("exit") ){
                    System.out.println("----- 설문 종료 ------");
                        break;             
                    }else{
                        System.out.println("잘못된 입력입니다.");
                    }
                }
            
        }catch(Exception e){
            System.out.println();
        }finally{
            System.out.println();
        }

        System.out.println();

        }
    }
    

