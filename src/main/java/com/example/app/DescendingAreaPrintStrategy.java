package com.example.app;

import java.util.Collections;
import java.util.List;

class DescendingAreaPrintStrategy extends PrintStrategy {
    DescendingAreaPrintStrategy() {
    }

    public void sort(List<ShapeWithArea> listOfShapes) {
        Collections.sort(listOfShapes);
        Collections.reverse(listOfShapes);
    }

}