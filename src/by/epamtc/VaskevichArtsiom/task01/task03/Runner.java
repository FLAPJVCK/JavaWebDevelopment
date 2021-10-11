package by.epamtc.VaskevichArtsiom.task01.task03;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanPositiveDoubleNumber;

public class Runner {
    public static void main(String[] args) {
        double squareArea1, squareArea2;
        try {
            System.out.print("Input square area ");
            squareArea1 = scanPositiveDoubleNumber();
            squareArea2 = Service.squareInCircleArea(Service.circleInSquareDiameter(squareArea1));
            System.out.println("Area of a given square: " + squareArea1);
            System.out.println("Area of the inscribed square: " + squareArea2);
            System.out.println("the area of the inscribed square is " + Service.compareTwoSquaresArea(squareArea1, squareArea2) + " times less than the area of the given square");
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
