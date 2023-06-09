public class StringClasses {

    public static void main(String[] args) {
        try {
            String name ="HyoWon Cho";
            name.equalsIgnoreCase("HyoWon Cho");
            name.equalsIgnoreCase("HyoWon");

            String name_second = new String("Friend Jane !"); // 선언
            name_second.equals("Friend Jane !"); // TRUE ,같은지 비교 
            name_second.length(); //13 ,문자길이
            name_second = name_second.replaceAll("e","a"); // 문자 바꾸기 하고 다시 할당해줌
            String[] arrays = name_second.split(" "); //문자열변수.split("구분할 문자") -> " " 마다 문자구분해줌
            String name_substring = name_second.substring(3,11); //문자열 자르기 substring(시작위치, 끝위치) 

            System.out.println();

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        //return 0;
    }
    
}
