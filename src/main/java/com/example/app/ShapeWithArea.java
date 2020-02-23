package com.example.app;

interface ShapeWithArea extends Comparable<ShapeWithArea>, Observer {
    public double getArea();
}