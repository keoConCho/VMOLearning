package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericExample2 {
    // tao phuong thuc chi chap nhan tham so la lop con cua Shape
    public static void drawShapes(List<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();// goi phuong thuc cua lop Shape boi lop con
        }
    }

    public static void main(String args[]) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);
    }
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("ve hinh chu nhat.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("ve hinh tron.");
    }
}