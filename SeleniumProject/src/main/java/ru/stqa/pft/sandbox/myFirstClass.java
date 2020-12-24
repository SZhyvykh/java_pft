package ru.stqa.pft.sandbox;

public class myFirstClass {

    public static void main(String [] args) {


        Square s = new Square(5);



        System.out.println(s.area());

        Rectangle r = new Rectangle(4, 6);

        System.out.println(r.a + " + " +  r.b + " = " + r.area());

        Point p = new Point(0, 1, 2, 4);
        System.out.println("Point distance is " + p.distance());


    }
}
