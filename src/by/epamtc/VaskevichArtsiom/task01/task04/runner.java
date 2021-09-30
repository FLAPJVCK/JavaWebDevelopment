package by.epamtc.VaskevichArtsiom.task01.task04;

public class runner {
    public static void main(String[] args) {
        int number1, number2, number3, number4;
        try {
            System.out.println("Input the first number ");
            number1 = service.scanNumber();
            System.out.println("Input the second number ");
            number2 = service.scanNumber();
            System.out.println("Input the third number ");
            number3 = service.scanNumber();
            System.out.println("Input the fourth number ");
            number4 = service.scanNumber();
            System.out.println(service.comparisonNumbers(number1, number2, number3, number4));
        } catch (ArithmeticException e){
            System.out.println("Your input is incorrect!");
        }
    }
}
