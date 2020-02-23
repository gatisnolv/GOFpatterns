package com.example.app;

class ShapeIterator implements IShapeIterator {
    ShapeCollection shapes;

    ShapeIterator(ShapeCollection shapes) {
        this.shapes = shapes;
    }

    public ShapeWithArea next() {
        ShapeWithArea shape = shapes.shape;
        this.shapes = shapes.restOfShapes;
        return shape;
    }

    public boolean hasNext() {
        return shapes.shape != null;
    }

}