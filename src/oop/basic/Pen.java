package oop.basic;


//객체 설계용 클래스에는 메인 함수를 작성하지 않는다(테스트 필요 경우 선언)
public class Pen {

    //Pen이라는 객체의 속성을 표현(데이터) -> 필드(멤버 변수) 호출 방법 객체 초기화 후 객체명.맴버 변수명
    int price;
    String color;
    String penNo;

    //객체의 기능을 표현한 함수 -> 메서드
    /*
    순차적으로 접근 제어자, 반환 자료형(return), 매서드 명
    매서드는 동작을 실행한 후 결과 값을 돌려 줄 수 있는 기능이 있습니다.
    위 내용은 반환 자료형을 의미합니다.(void는 반환 값이 없을 때 사용합니다.)
     */
    public void write(){
        System.out.println(color + "색 글을 씁니다.");
    }

    public void penInfo(){
        System.out.println("제품 번호: "+penNo);
        System.out.println(color+"색 펜의 가격은 "+price+"원 입니다.");
    }
}
