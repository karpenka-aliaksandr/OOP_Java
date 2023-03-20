package HomeWork04;

import HomeWork03.Figures.Circle;
import HomeWork03.Figures.Rectangle;
import HomeWork03.Figures.Square;
import HomeWork03.Figures.Triangle;
import HomeWork03.Figures.Base.Figure;

public class App {
    public static void main(String[] args) {
        // Integer
        // myCollection<Integer> myInt = new myCollection<>();
        // System.out.println(myInt);

        // for (int i = 0; i < 10; i++) {
        // myInt.add(i);
        // System.out.println(myInt);
        // }

        // System.out.println("get(5) = " + myInt.get(0));
        // System.out.println("remove(3) = " + myInt.remove(3));
        // System.out.println(myInt);
        // myInt.del(2);
        // System.out.println("del(2) " + myInt);
        // myInt.del(6);
        // System.out.println("del(6) " + myInt);
        // myInt.del(100);
        // System.out.println("del(100) (nothing will be done) " + myInt);
        // myInt.delItemEqual(6);
        // System.out.println("delItemEqual (6) " + myInt);
        // myInt.delItemEqual(0);
        // System.out.println("delItemEqual (0) " + myInt);

        // System.out.printf("min=%s\n", myInt.getMin());
        // System.out.printf("max=%s\n",myInt.getMax());

        // System.out.printf("sum=%s\n",myInt.getSum());
        // System.out.printf("prod=%s\n",myInt.getProd());

        // System.out.printf("Find (5)=%s\n",myInt.findIndexOfItem(5));
        // System.out.printf("Find (10)=%s\n",myInt.findIndexOfItem(10));

        // System.out.printf("Contains (5)=%s\n",myInt.containsItem(5));
        // System.out.printf("Contains (10)=%s\n",myInt.containsItem(10));

        // myInt.set(2, 9);
        // myInt.set(1, 11);
        // myInt.set(3, 2);
        // System.out.println("Unsorted " + myInt);

        // myInt.bubbleSort();
        // System.out.println("BubbleSorted " + myInt);

        // myInt.set(0, 13);
        // myInt.set(1, 6);
        // myInt.set(2, 8);
        // myInt.set(3, 2);
        // myInt.set(4, 14);
        // System.out.println("Unsorted " + myInt);

        // myInt.insertionSort();
        // System.out.println("InsertionSorted " + myInt);

        // myInt.set(0, 13);
        // myInt.set(1, 6);
        // myInt.set(2, 8);
        // myInt.set(3, 2);
        // myInt.set(4, 14);
        // System.out.println("Unsorted " + myInt);

        // myInt.selectionSort();
        // System.out.println("selectionSorted " + myInt);

        // System.out.println("Length = " + myInt.length());



        // Strings
        // myCollection<String> myStrings = new myCollection<>(
        //         new String[] { "Anna", "Petr", "Ivan", "Fedor", "Tom", "Elena", "Maria", "Vera", "Sasha" });
        // System.out.println(myStrings);

        // System.out.println("get(5) = " + myStrings.get(0));
        // System.out.println("remove(3) = " + myStrings.remove(3));
        // System.out.println(myStrings);
        // myStrings.del(2);
        // System.out.println("del(2) " + myStrings);
        // myStrings.del(6);
        // System.out.println("del(6) " + myStrings);
        // myStrings.del(100);
        // System.out.println("del(100) (nothing will be done) " + myStrings);
        // myStrings.delItemEqual("Maria");
        // System.out.println("delItemEqual (\"Maria\")  " + myStrings);
        // myStrings.delItemEqual("Maria");
        // System.out.println("delItemEqual (\"Maria\")  " + myStrings);

        // System.out.printf("min=%s\n", myStrings.getMin());
        // System.out.printf("max=%s\n", myStrings.getMax());

        // System.out.printf("sum=%s\n", myStrings.getSum());
        // System.out.printf("prod=%s\n", myStrings.getProd());

        // System.out.printf("Find (Maria)=%s\n", myStrings.findIndexOfItem("Maria"));
        // System.out.printf("Find (Tom)=%s\n", myStrings.findIndexOfItem("Tom"));

        // System.out.printf("Contains (Maria)=%s\n", myStrings.containsItem("Maria"));
        // System.out.printf("Contains (Tom)=%s\n", myStrings.containsItem("Tom"));

        // myStrings = new myCollection<>(
        //         new String[] { "Anna", "Petr", "Ivan", "Fedor", "Tom", "Elena", "Maria", "Vera", "Sasha" });
        // System.out.println("Unsorted " + myStrings);

        // myStrings.bubbleSort();
        // System.out.println("BubbleSorted " + myStrings);

        // myStrings = new myCollection<>(
        //         new String[] { "Anna", "Petr", "Ivan", "Fedor", "Tom", "Elena", "Maria", "Vera", "Sasha" });
        // System.out.println("Unsorted " + myStrings);

        // myStrings.insertionSort();
        // System.out.println("InsertionSorted " + myStrings);

        // myStrings = new myCollection<>(
        //         new String[] { "Anna", "Petr", "Ivan", "Fedor", "Tom", "Elena", "Maria", "Vera", "Sasha" });
        // System.out.println("Unsorted " + myStrings);

        // myStrings.selectionSort();
        // System.out.println("selectionSorted " + myStrings);

        // System.out.println("Length = " + myStrings.length());



        // Figures
        myCollection<Figure> myFigures = new myCollection<>(
                new Figure[] {
                        new Triangle(3, 4, 5),
                        new Circle(5), new Circle(2),
                        new Rectangle(3, 4), new Rectangle(4, 6),
                        new Square(3), new Square(5)
                });
        myFigures.add(new Triangle());
        myFigures.add(new Circle());
        myFigures.add(new Rectangle());
        myFigures.add(new Square());
        System.out.println(myFigures);
        // System.out.println("get(5) = " + myFigures.get(0));
        // System.out.println("remove(3) = " + myFigures.remove(3));
        // System.out.println(myFigures);
        // myFigures.del(2);
        // System.out.println("del(2) " + myFigures);
        // myFigures.del(6);
        // System.out.println("del(6) " + myFigures);
        // myFigures.del(100);
        // System.out.println("del(100) (nothing will be done) " + myFigures);

        myFigures.delItemEqual(new Square(3));
        System.out.println("delItemEqual (Square(3))  " + myFigures);
        myFigures.delItemEqual(new Circle());
        System.out.println("delItemEqual (Circle())  " + myFigures);

        System.out.printf("min=%s\n", myFigures.getMin());
        System.out.printf("max=%s\n", myFigures.getMax());

        System.out.printf("sum=%s\n", myFigures.getSum());
        System.out.printf("prod=%s\n", myFigures.getProd());

        System.out.printf("Find (Triangle())=%s\n", myFigures.findIndexOfItem(new Triangle()));
        System.out.printf("Find (Triangle(9,10,11))=%s\n", myFigures.findIndexOfItem(new Triangle(9,10,11)));

        System.out.printf("Contains (Triangle())=%s\n", myFigures.containsItem(new Triangle()));
        System.out.printf("Contains (Triangle(9,10,11))=%s\n", myFigures.containsItem(new Triangle(9,10,11)));

        myFigures = new myCollection<>(
            new Figure[] {
                new Triangle(3, 4, 5), new Triangle(5, 6, 7), new Triangle(),
                new Circle(5), new Circle(2), new Circle(),
                new Rectangle(3, 4), new Rectangle(4, 6), new Rectangle(),
                new Square(3), new Square(5)
        });
        System.out.println("Unsorted " + myFigures);

        myFigures.bubbleSort();
        System.out.println("BubbleSorted " + myFigures);

        myFigures = new myCollection<>(
            new Figure[] {
                new Triangle(3, 4, 5), new Triangle(5, 6, 7), new Triangle(),
                new Circle(5), new Circle(2), new Circle(),
                new Rectangle(3, 4), new Rectangle(4, 6), new Rectangle(),
                new Square(3), new Square(5)
        });
        System.out.println("Unsorted " + myFigures);

        myFigures.insertionSort();
        System.out.println("InsertionSorted " + myFigures);

        myFigures = new myCollection<>(
            new Figure[] {
                new Triangle(3, 4, 5), new Triangle(5, 6, 7), new Triangle(),
                new Circle(5), new Circle(2), new Circle(),
                new Rectangle(3, 4), new Rectangle(4, 6), new Rectangle(),
                new Square(3), new Square(5)
        });
        System.out.println("Unsorted " + myFigures);

        myFigures.selectionSort();
        System.out.println("selectionSorted " + myFigures);

        System.out.println("Length = " + myFigures.length());


    }
}
