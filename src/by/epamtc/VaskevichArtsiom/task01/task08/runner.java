package by.epamtc.VaskevichArtsiom.task01.task08;

public class runner {
    public static void main(String[] args) {
        double x;
        try {
            System.out.println("Input x ");
            x = service.scanNumber();
            System.out.println("Function value = " + service.getFunctionValue(x));
        } catch (ArithmeticException e){
            System.out.println("Your input is incorrect!");
        }
    }
}
