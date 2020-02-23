package com.example.app;

class CircleWithArea implements ShapeWithArea {

    private Circle circle;

    CircleWithArea(int radius) {
        circle = new Circle(radius);
    }

    public double getArea() {
        return Math.pow(circle.getRadius(), 2) * Math.PI;
    }

    public void update(int scale) {
        circle.setRadius(circle.getRadius() * scale);
    }

    public int compareTo(ShapeWithArea o) {
        return this.getArea() < o.getArea() ? -1 : (this.getArea() < o.getArea() ? 0 : 1);
    }

    public String toString() {
        return "Circle. \tRadius: " + circle.getRadius() + ", area: " + getArea();
    }

}