package by.epamtc.VaskevichArtsiom.task01.task06;

import by.epamtc.VaskevichArtsiom.task01.inputException.InputException;

import static by.epamtc.VaskevichArtsiom.task01.scanner.ScanNumber.scanSecondsInDayNumber;

public class Runner {
    public static void main(String[] args) {
        int nSeconds;
        int[] result;
        try {
            System.out.println("Input number of seconds ");
            nSeconds = scanSecondsInDayNumber();
            result = Service.timeCounter(nSeconds);
            System.out.println(result[0] + " hours " + result[1] + " minutes " + result[2] + " seconds");
        } catch (InputException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
