import java.util.Scanner; 

public class MethodsIfs {
    public String iftime(int time){
        String str ="";
        try {
            if(time < 12){
                str = "오전입니다";
            }
            else if(time < 18){
                str = "오후입니다";
            }
            else{
                str = "밤입니다";
            }      
        } catch (Exception e) {
            // TODO: handle exception
        }

        return str; 

    }
        
    public static void main(String[] args) {
        
        try {
            boolean loops = true;

            while(loops){ //무한루프 
                Scanner myObj = new Scanner(System.in); 
                System.out.print("몇시입니까? : ");
                int time = myObj.nextInt(); //시간 입력 스캐너
                if (time == 0) {
                    System.out.println("종료합니다.");
                   break; // 무한루프 나가기
                } else {
                MethodsIfs  methodsIfs = new MethodsIfs(); // (클래쓰)데이터타입 변수이름 = new 클래스이름 _ function을 호출하기 위해 인스턴스화함
                String returnresult = methodsIfs.iftime(time); //값을 넣어줄 새로운 string 변수 선언 후 값 넣음
                System.out.println(returnresult);
                }
            }
          
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
    
}
