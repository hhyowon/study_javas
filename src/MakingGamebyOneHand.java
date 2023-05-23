public class MakingGamebyOneHand {
    //- 변수 3개 선언(데이터 타입 상관 없음)
    //변수 두 개에 각각 1과 2를 넣음    
    //변수에 넣은 값은 변수로 교차 입력(직접 1,2 넣기 안됨)
    public static void main(String[] args) {
       int first=1;  
       int second=0;
       int third=2;  //변수 3개 선언

       int Empty; //변수값 임시 저장할 빈공간

       System.out.println("변경 전 : " +first+","+second+","+third);
        Empty = second; //빈공간에 2번 변수값 임시 저장 
        second = first; // 첫번째 숫자1 오른쪽 이동(second카드로 이동)
        first = third; //세번째 카드 숫자(2) 첫번째 카드로 이동
        third = second; //3번째 카드에 second카드로 이동시킨 숫자1 오른쪽 이동
        second = Empty; //임시저장값 두번째카드에 넣어줌

       System.out.println("변경 후: " +first+","+second+","+third);
        //return 0;
    }

    
}
