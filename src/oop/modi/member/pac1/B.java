package oop.modi.member.pac1;
public class B {
    void test(){
        A a = new A(50);
        A a2 = new A(50.0);
//        A a3 = new A(true); private 때문에 접근할 수 없습니다.

        a.method1();
        a.method2();
//        a.method3(); 위와 동

        a.f1 = 10;
        a.f2 = 10;
//        a.f3 = 10; 위와 동
    }
}
