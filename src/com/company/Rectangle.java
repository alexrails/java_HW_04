package com.company;

public class Rectangle {
    double x;
    double y;
    public Rectangle(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Rectangle(double x){
        this(x, x);
    }
    double calculateArea(){
        double area = this.x * this.y;
        return area;
    }
    void printArea(){
        System.out.println(this.calculateArea());
    }
    void printRectangleKind(){
        if (this.x == this.y) {
            System.out.println("Квадрат");
        } else {
            System.out.println("Прямоугольник");
        }
    }
    boolean isTheSameRectangle(Rectangle rect){
        return this.x == rect.x && this.y == rect.y;
    }
}
