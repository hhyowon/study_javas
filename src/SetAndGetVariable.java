public class SetAndGetVariable {
    public static void main(String[] args) throws Exception {
        int A =1;
        int B =3;
        int C =5;
        int D =7; 

        int first = 200;
        int second = 30;
        int third = 50;
        int fourth = 10;
 
        System.out.println("변경 전:"+A+","+B+","+C+","+D);
        if(B == 3){   //B가 3일때 
              A=fourth;
        }

        if(D!=9){//D가 9가 아닐때 
            B = C;
        }else{
            B = first;
        }
    
        if(A==10){ //A가 10일때
            C=third;
        }else{
            D=second;
        }

        System.out.println("변경 후:"+A+","+B+","+C+","+D);
        
    }
}