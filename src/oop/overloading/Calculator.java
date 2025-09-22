package oop.overloading;

public class Calculator {
    int add(int a, int b){;
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d){
        return a+b+c+d;
    }

    void method1(){};
    void method1(int i){}
    void method1(String s){}
    //매서드를 중복 선언할 경우 구분이 가능하면 선언 가능하다 형태가 같을 경우 생성 불가능
}
