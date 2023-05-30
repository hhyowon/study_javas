public class MethodBasics {
    // <access_modifier> <return_type> <method_name>(list_of_parameters)
    // {
    // // body
    // }
    // x에 +1
    public int F(int x)
    {
        int result = x + 1;
        return result;
    }

    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1;  
            // y = F(x);
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x); // 변수 y = x + 1;  
            System.out.println("y = " + y);

            y = methodBasics.F(y);// 변수 y = y + 1;  
            System.out.println("y = " + y);
         

        } catch (Exception e){
            // TODO: handle exception
        }     
        System.out.println(); 
        // return 0;
    }
}