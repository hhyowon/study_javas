public class MethodBasics {
    // <access_modifier> <return_type> <method_name>(list_of_parameters)
    // {
    // // body
    // }
    // x에 +1
    public int Fx(int x)
    {
        int result = x + 1;
        return result;
    }

    public int F(int y)
    {
        int result = y + 1;
        return result;
    }

    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1;  
            // y = F(x);
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.Fx(x); // 변수에 + 1
            y = methodBasics.F(y); // 변수에 + 1
           // y = y + 1;  

        } catch (Exception e){
            // TODO: handle exception
        }     
        System.out.println(); 
        // return 0;
    }
}