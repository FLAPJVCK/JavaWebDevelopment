package by.epamtc.VaskevichArtsiom.task01.task10;

public class runner {
    public static void main(String[] args) {
        double a, b, h;
        try {
            System.out.println("Input a ");
            a = service.scanNumber();
            System.out.println("Input b ");
            b = service.scanNumber();
            System.out.println("Input h ");
            h = service.scanNumber();
            service.printTable(service.getValues(a, b, h));
        } catch (ArithmeticException e){
            System.out.println("Your input is incorrect!");
        }
    }
}
