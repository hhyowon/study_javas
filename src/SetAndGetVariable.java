6+9*/88888--public class SetAndGetVariable {
    public static void main(String[] args) throws Exception {
        int A =1;
        int B =3;
        int C =5;
        int D =7; 

        int first = 200;
        int second = 30;
        int third = 50;
        int forth = 10;
 
        System.out.println("변경 전:"+A+","+B+","+C+","+D);
        if(B == 3){   //B가 3일때 
              A=forth;
        }else{
                C=third;
        }

        if(D!=9){//D가 9가 아닐때 
            B = second;
        }else{
            B = first;
        }
            
        if(D!=9){//D가 9가 아닐때 
            B = third;
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
47