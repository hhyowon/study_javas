import java.util.Scanner; 

public class Main{
    public static void main(String[] args) {
        //refer : https://www.acmicpc.net/problem/1008
            Scanner myObj = new Scanner(System.in); //첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
            double A = 0;                              //실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
            double  B = 0;
            A  = myObj.nextDouble ();
            B  = myObj.nextDouble(); 
            System.out.println(A/B); 

            
            //return 0;
        }               
}

