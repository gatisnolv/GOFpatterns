package com.example.app;

public final class App {

    public static void main(String[] args) {
        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.add(ShapeWithAreaFactory.getShape("Circle", 1));
        shapeCollection.add(ShapeWithAreaFactory.getShape("Rectangle", 1, 2));
        shapeCollection.add(ShapeWithAreaFactory.getShape("Circle", 3));
        shapeCollection.add(ShapeWithAreaFactory.getShape("Rectangle", 4, 2));
        shapeCollection.add(ShapeWithAreaFactory.getShape("Rectangle", 4, 5));

        // Iterator demo
        IShapeIterator iterator = shapeCollection.iterator();
        System.out.println("Iterator demo:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // Observer demo
        Scale scale = new Scale();
        iterator = shapeCollection.iterator();
        while (iterator.hasNext()) {
            scale.addObserver(iterator.next());
        }
        scale.setScale(2);

        System.out.println("Observer demo:");
        iterator = shapeCollection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // Strategy demo
        System.out.println("Strategy demo:");
        System.out.println("Ascending area print strategy:");
        PrintStrategy printStrategy = new AscendingAreaPrintStrategy();
        printStrategy.print(shapeCollection);
        System.out.println();

        System.out.println("Descending area print strategy:");
        printStrategy = new DescendingAreaPrintStrategy();
        printStrategy.print(shapeCollection);

    }
}
