package com.example.app;

class ShapeCollection {

    ShapeWithArea shape;
    ShapeCollection restOfShapes;

    public void add(ShapeWithArea shape) {
        if (this.shape == null) {
            this.shape = shape;
            restOfShapes = new ShapeCollection();
            return;
        }
        ShapeCollection currentRestOfShapes = restOfShapes;
        while (currentRestOfShapes.shape != null) {
            currentRestOfShapes = currentRestOfShapes.restOfShapes;
        }
        currentRestOfShapes.restOfShapes = new ShapeCollection();
        currentRestOfShapes.shape = shape;
    }

    public IShapeIterator iterator() {
        return new ShapeIterator(this);
    }

}