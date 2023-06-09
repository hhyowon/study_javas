public class Arrays {
    
    public String[] initialArrays(){
        String [] carTypes = {"Volvo", "BMW", "Ford", "Mazda","KIA"}; //arrays
        return carTypes;
    } 

    public static void main(String[] args) {
        // String [][] numbers = {{"10","20","30","40"},
        //                          {"50","60","70"}};
        // for(int second=0; second<numbers.length; second=second+1)
        // {
        //     for(int third=0;third<numbers[second].length; third=third+1)
        //    {
        //          System.out.print(numbers[second][third]+",");
        //    }
        //    System.out.println();

        // }
         Arrays  arrays  = new  Arrays ();
         String [] cars = arrays.initialArrays();

         
            System.out.println(cars.length);
            for(int num=0;num<cars.length;num=num+1){  //for문으로 배열 나열하기
                System.out.print(cars[num]+","); 
    }
    System.out.println();
}



}
