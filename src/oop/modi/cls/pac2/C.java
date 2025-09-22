package oop.modi.cls.pac2;

//import oop.modi.cls.pac1.A;
//참조 또한 불가능합니다.
import oop.modi.cls.pac1.B;

public class C {
    B b  = new B();
    //public 형태의 클래스입니다, 다른 패키지에서도 참조가 가능합니다.
//    A a = new A()
    //default 형태 이기에 다른 패키지에서는 접근할 수 없습니다.
}
