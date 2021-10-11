package by.epamtc.VaskevichArtsiom.task01.scanner;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import java.util.Scanner;

public class ScanNumber {
    public static long scanLongNumber() throws InputException {
        long number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLong()) {
            number = scanner.nextLong();
            return number;
        } else {
            throw new InputException();
        }
    }

    public static double scanDoubleNumber() throws InputException {
        double number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
            return number;
        } else {
            throw new InputException();
        }
    }

    public static double scanPositiveDoubleNumber() throws InputException {
        double number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
            if (number <= 0) {
                throw new InputException();
            }
        } else {
            throw new InputException();
        }
        return number;
    }

    public static int scanIntNumber() throws InputException {
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            return number;
        } else {
            throw new InputException();
        }
    }

    public static int scanPositiveIntegerNumber() throws InputException {
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number < 0) {
                throw new InputException();
            }
        } else {
            throw new InputException();
        }
        return number;
    }

    public static int scanNaturalNumber() throws InputException {
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number <= 0) {
                throw new InputException();
            }
        } else {
            throw new InputException();
        }
        return number;
    }

    public static int scanSecondsInDayNumber() throws InputException {
        int number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number <= 0 || number > 86400) {
                throw new InputException();
            }
        } else {
            throw new InputException();
        }
        return number;
    }
}
