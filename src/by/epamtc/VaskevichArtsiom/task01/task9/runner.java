package by.epamtc.VaskevichArtsiom.task01.task9;

public class runner {
    public static void main(String[] args) {
        double radius;
        try {
            System.out.println("Input radius R ");
            radius = service.scanNumber();
            System.out.println("Circle length = " + service.findCircleLength(radius));
            System.out.println("Circle area = " + service.findCircleArea(radius));
        } catch (ArithmeticException e){
            System.out.println("Your input is incorrect!");
        }
    }
}
