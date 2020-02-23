package com.example.app;

import java.util.Collections;
import java.util.List;

class AscendingAreaPrintStrategy extends PrintStrategy {
    AscendingAreaPrintStrategy() {
    }

    public void sort(List<ShapeWithArea> listOfShapes) {
        Collections.sort(listOfShapes);
    }

}