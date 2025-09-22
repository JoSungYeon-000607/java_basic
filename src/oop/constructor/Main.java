package oop.constructor;

public class Main {
    public static void main(String[] args) {
        Phone basic  = new Phone("폴더폰","회색",200000);
        basic.showSpec();

        Phone basic2 = new Phone(basic);
        basic2.showSpec();

        System.out.println("===============================================================");

        Phone galaxy = new Phone("스마트폰", "검정색", 1500000);
    }
}
