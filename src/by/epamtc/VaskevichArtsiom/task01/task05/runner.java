package by.epamtc.VaskevichArtsiom.task01.task05;

public class runner {
    public static void main(String[] args) {
        int number;
        try {
            System.out.println("Input number ");
            number = service.scanNumber();
            System.out.println(service.isIntegerPerfect(number));
        } catch (ArithmeticException e){
            System.out.println("Your input is incorrect!");
        }
    }
}
