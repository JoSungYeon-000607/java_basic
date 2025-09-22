package oop.fieldlocal;

public class Main {
    public static void main(String[] args) {
        Person jo = new Person();
        Person kim = new Person();

        jo.name = "조성연";
        jo.age = 26;

        String hello = jo.hello("한국");
        System.out.println(hello);

//        System.out.println("i의 값: "+i); 지역 변수는 해당 객체의 매서드 내부에서만 사용 가능합니다.

        System.out.println(hello == "안녕하세요!"); //  true 반환 하지만 안전을 위해 .equals를 사용하는게 안전하다

        String test = new String("안녕하세요!");

        System.out.println(hello==test);
    }

    /*
    중요한 내용
    "안녕하세요!" String constant pool 문자열 상수 풀에 문자열 객체가 저장된다(고유한 주소값 보유)**

    hello == test

    자바에서 문자열이 같은지 비교하는 행위는 문자열 상수 풀에 저장된 문자열의 주소값으로 판단한다 (==사용 경우)

    .equals를 사용할 경우 문자열의 길이를 비교 후 문자열(String)을 문자(Char)로 나누어 반복문으로 테스트를 진행합니다.
    안전한 비교가능
      */
}
