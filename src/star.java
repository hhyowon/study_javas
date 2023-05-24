public class star {
    public static void main(String[] args){ 
        System.out.println("직각삼각형 별찍기 ");
            for (int first = 0; first < 6; first = first + 1)
                {
                    for(int second=0; second<first; second=second+1)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }      
            
        System.out.println("역직각삼각형 별찍기 ");
            for (int first = 1; first < 6; first = first + 1)
            {
                for(int second=6; first<second; second=second-1)
                {
                    System.out.print("*");
                }
                System.out.println();
            }   
            
            System.out.println("피라미드 별찍기 ");
            for (int first = 0; first < 6; first = first + 1)
            {
                for(int second=0; second<first; second=second+2)
                {
                    System.out.print("*");
                }
                System.out.println();
            }   

        }  

        
}
    

