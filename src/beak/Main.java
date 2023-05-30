package beak;
import java.util.Scanner; 

public class Main {

    public static void main(String[] args) {
        // 18108 :  https://www.acmicpc.net/problem/18108
        // 불기연도에서 서기연도 출력하는 프로그램 
        // 서기연도 = 불기연도-543년
        // Scanner myObj = new Scanner(System.in); 
        // int year =  myObj.nextInt();
        // System.out.println(year-543); 

        // 10430 : https://www.acmicpc.net/problem/10430 
        // 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램
        // Scanner myObj = new Scanner(System.in); 
        // int A = myObj.nextInt();
        // int B = myObj.nextInt();
        // int C = myObj.nextInt();
    
        // System.out.println((A+B)%C);
        // System.out.println(((A%C) + (B%C))%C);
        // System.out.println( (A*B)%C);
        // System.out.println (((A%C)*(B%C))%C);

        // 2588 : https://www.acmicpc.net/problem/2588
        // (세 자리 수) × (세 자리 수) 과정 보이는 프로그램 작성하기

        Scanner myObj = new Scanner(System.in); 
         int A = myObj.nextInt();
         int B = myObj.nextInt();

         System.out.println(A*(B%38));
        




        }
    }

