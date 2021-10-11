package by.epamtc.VaskevichArtsiom.task01.task07;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanIntNumber;

public class Runner {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        try {
            System.out.println("Input x1 ");
            x1 = scanIntNumber();
            System.out.println("Input y1 ");
            y1 = scanIntNumber();
            System.out.println("Input x2 ");
            x2 = scanIntNumber();
            System.out.println("Input y2 ");
            y2 = scanIntNumber();
            System.out.println(Service.pointComparison(x1, y1, x2, y2));
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
