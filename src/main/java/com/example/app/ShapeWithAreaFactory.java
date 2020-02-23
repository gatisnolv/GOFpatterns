package com.example.app;

class ShapeWithAreaFactory {
    public static ShapeWithArea getShape(String type, int... dimensions) {
        if (type.equals("Circle") && dimensions.length == 1) {
            return new CircleWithArea(dimensions[0]);
        } else if (type.equals("Rectangle") && dimensions.length == 2) {
            return new RectangleWithArea(dimensions[0], dimensions[1]);
        } else {
            throw new RuntimeException("Unexpected shape, dimensions combination");
        }
    }
}