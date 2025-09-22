package oop.basic;

public class Main {
    public static void main(String[] args) {
        Pen redPen = new Pen();


        Pen bluePen = new Pen();


        System.out.println("redPen = " + redPen);
        System.out.println("bluePen = " + bluePen);


        //.은 참조 연사자
        redPen.color = "빨강";
        redPen.price = 10000;
        redPen.penNo = "a001";

        bluePen.color = "파랑";
        bluePen.price = 15000;
        bluePen.penNo = "a002";
    }
}
