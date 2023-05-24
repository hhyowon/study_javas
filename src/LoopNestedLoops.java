import java.util.Scanner; 

public class LoopNestedLoops {

    public static void main(String[] args) {
        System.out.println("이중for문 사용하여 _?찍기");
        for (int first = 1; first < 5; first = first + 1)
        {   System.out.println("for " +  first);
            for(int second=0; second<first; second=second+1)
            {
                System.out.print("_?");
            }
            System.out.println();
        }      
            System.out.println("end");      

            System.out.println("\n이중for문안에 if문,break 사용하여 _?찍기");
            for (int first = 1; first < 5; first = first + 1)
            {   System.out.println("for " +  first);
                for(int second=0; second<first; second=second+1)
                {       
                    if(second == first)
                    {
                        System.out.print("_?");
                        break;
                    }
                     System.out.print("_?");     
                }

                System.out.println();
            }      
                System.out.println("end");        
    }     
}

