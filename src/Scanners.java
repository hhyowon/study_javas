import java.util.Scanner;  // Import the Scanner class

public class Scanners {
  
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
    
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
  
        int first = 0;
        int second = 0;
        first  = myObj.nextInt();
        second  = myObj.nextInt(); 
        System.out.println(first +","+ second);  
        //return 0;
    }
          
       
}
