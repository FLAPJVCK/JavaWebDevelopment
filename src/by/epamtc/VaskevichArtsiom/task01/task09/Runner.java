package by.epamtc.VaskevichArtsiom.task01.task09;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanPositiveDoubleNumber;

public class Runner {
    public static void main(String[] args) {
        double radius;
        try {
            System.out.println("Input radius R ");
            radius = scanPositiveDoubleNumber();
            System.out.println("Circle length = " + Service.findCircleLength(radius));
            System.out.println("Circle area = " + Service.findCircleArea(radius));
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
