package by.epamtc.VaskevichArtsiom.task01.task1;

public class runner {
    public static void main(String[] args) {
        long number;
        try {
            System.out.print("Input number ");
            number = service.scanNumber();
            number = service.lastSquareNumber(number);
            System.out.println("Last number of square number is " + number);
        } catch (ArithmeticException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
