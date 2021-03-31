package com.company;

public class Rectangle {
    private double x;
    private double y;
    private static int createdRectangles;
    private final static String ENGLISH_CLASS_NAME = "Rectangle";
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";

    public Rectangle(double x, double y){
        this.x = x;
        this.y = y;
        createdRectangles++;
    }
    public Rectangle(double x){
        this(x, x);
        createdRectangles++;
    }
    double calculateArea(){
        double area = this.x * this.y;
        return area;
    }
    public void printArea(){
        System.out.println(this.calculateArea());
    }
    public void printRectangleKind(){
        if (this.x == this.y) {
            System.out.println("Квадрат");
        } else {
            System.out.println("Прямоугольник");
        }
    }
    public boolean isTheSameRectangle(Rectangle rect){
        return this.x == rect.x && this.y == rect.y;
    }
    public static void printRectanglesCount(){
        System.out.println("Have been created " + createdRectangles + " rectangles");
    }
    public static void printClassName(boolean printlnRussian){
        if(printlnRussian){
            System.out.println(RUSSIAN_CLASS_NAME);
        }else {
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }
}
