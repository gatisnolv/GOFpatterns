package com.example.app;

import java.util.ArrayList;
import java.util.List;

abstract class PrintStrategy {

    public void print(ShapeCollection shapes) {
        List<ShapeWithArea> listOfShapes = new ArrayList<>();
        IShapeIterator iterator = shapes.iterator();
        while (iterator.hasNext()) {
            listOfShapes.add(iterator.next());
        }
        sort(listOfShapes);
        listOfShapes.stream().forEach(x -> System.out.println(x));
    }

    public abstract void sort(List<ShapeWithArea> listOfShapes);
}