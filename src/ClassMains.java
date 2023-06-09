import cases.ClassSeonds;

public class ClassMains {
    
    public static void main(String[] args) {
        
        try {
            ClassFirsts classFirsts= new ClassFirsts(); 
            ClassFirsts classFirstsWithVar= new ClassFirsts(5);
             
            int second = classFirstsWithVar.getSecond();
            ClassSeonds classsSeconds = new ClassSeonds(6);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
    }
}

public static int getAnswer() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an answer: ");
    int answer = scanner.nextInt();
    scanner.close();
    return answer;
}

