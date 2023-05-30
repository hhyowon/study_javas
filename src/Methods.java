public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public int minus(int first, int second){
        int result = 0;
        try {
           result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }
    public int add(int first, int second){
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result ;
    }
    
    public static void main(String[] args) {
        // - 인스턴스는 1회
        // - 초기 값은 2를 넘지 않음.
        // - main 결과값은 17
        try {
             int a = 2; //초기값 2 넘지 않게 선언
             int b = 1;

            Methods methods = new Methods(); //인스턴트 1회 
            for (int i = 0; i < 16; i=i+1) {
                a = methods.add(a, b);
            }

             a = methods.minus(a,b);

            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);
            //    a  = methods.add(a,b);

              

            System.out.println(a); //출력


            
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}