package by.epamtc.VaskevichArtsiom.task01.task7;

public class runner {
    public static void main(String[] args) {
        int x1, y1, x2, y2;
        try {
            System.out.println("Input x1 ");
            x1 = service.scanNumber();
            System.out.println("Input y1 ");
            y1 = service.scanNumber();
            System.out.println("Input x2 ");
            x2 = service.scanNumber();
            System.out.println("Input y2 ");
            y2 = service.scanNumber();
            System.out.println(service.pointComparison(x1, y1, x2, y2));
        } catch (ArithmeticException e){
            System.out.println("Your input is incorrect!");
        }
    }
}
