package by.epamtc.VaskevichArtsiom.task01.task10;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanDoubleNumber;

public class Runner {
    public static void main(String[] args) {
        double a, b, h;
        try {
            System.out.println("Input a ");
            a = scanDoubleNumber();
            System.out.println("Input b ");
            b = scanDoubleNumber();
            System.out.println("Input h ");
            h = scanDoubleNumber();
            printTable(Service.calculateValues(a, b, h));
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }

    public static void printTable(double[][] results) {
        System.out.println("-------------------------------------");
        System.out.println("|        x        |        y        |");
        System.out.println("-------------------------------------");
        for (int i = 0; i < results[0].length; i++) {
            String str = String.format("|     %.5f     |     %.5f     |", results[0][i], results[1][i]);
            System.out.println(str);
        }
        System.out.println("-------------------------------------");
    }
}
