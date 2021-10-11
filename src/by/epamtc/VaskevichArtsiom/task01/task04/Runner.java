package by.epamtc.VaskevichArtsiom.task01.task04;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanIntNumber;

public class Runner {
    public static void main(String[] args) {
        int number1, number2, number3, number4;
        try {
            System.out.println("Input the first number ");
            number1 = scanIntNumber();
            System.out.println("Input the second number ");
            number2 = scanIntNumber();
            System.out.println("Input the third number ");
            number3 = scanIntNumber();
            System.out.println("Input the fourth number ");
            number4 = scanIntNumber();
            System.out.println(Service.comparisonNumbers(number1, number2, number3, number4));
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
