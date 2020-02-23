package com.example.app;

class RectangleWithArea implements ShapeWithArea {
    private Rectangle rectangle;

    RectangleWithArea(int height, int width) {
        rectangle = new Rectangle(height, width);
    }

    public double getArea() {
        return rectangle.getHeight() * rectangle.getWidth();
    }

    public void update(int scale) {
        rectangle.setHeight(rectangle.getHeight() * scale);
        rectangle.setWidth(rectangle.getWidth() * scale);
    }

    public int compareTo(ShapeWithArea o) {
        return this.getArea() < o.getArea() ? -1 : (this.getArea() < o.getArea() ? 0 : 1);
    }

    public String toString() {
        return "Rectangle. \tWidth x length: " + rectangle.getWidth() + " x " + rectangle.getHeight() + ", area: "
                + getArea();
    }
}