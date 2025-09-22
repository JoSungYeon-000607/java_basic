package oop.modi.member.pac1;

public class A {
    //필드 선언
    public int f1;
    int f2;//default
    private int f3;

    public A(int a) {}
    A(double d) {}
    private A(boolean b) {}

    public void method1(){}
    void method2(){}
    private void method3(){}

    void test(){
        this.f1 = 10;
        this.f2 = 20;
        this.f3 = 30;
        A a = new A(10);
        A b = new A(10.0);
        A c = new A(true);
        this.method1();
        this.method2();
        this.method3();
    }
}
