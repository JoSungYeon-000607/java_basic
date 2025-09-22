package oop.fieldlocal;

import lombok.ToString;

import java.util.Objects;
public class Person {
    String name;
    int age;

    //매개 변수(Parrameter) -> 매서드를 호출할 때 전달해야 하는 값.
    String hello(String country){
        int i = 30;
        System.out.println("i의 값: "+i);
        System.out.println(name+"이(가) 인사를 합니다.");
        if(country.equals("한국"))return "안녕하세요!";
        else if(country.equals("미국")) return "Hello!";
        else if(country.equals("일본")) return "곤니찌와!";
        else return "그 나라 인사는 모르겠는데요...";
        //리턴 타입을 지정한 경우 어떠한 경우(매서드 연산 종료 시점)에도 지정된 타입이 리턴 되어야 합니다.
    }
}
