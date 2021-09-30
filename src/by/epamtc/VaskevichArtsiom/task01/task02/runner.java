package by.epamtc.VaskevichArtsiom.task01.task02;

public class runner {
    public static void main(String[] args) {
        int year, month, daysInMonth;
        try {
            System.out.print("Input year ");
            year = service.scanNumber();
            System.out.print("Input the month number ");
            month = service.scanNumber();
            daysInMonth = service.daysInMonth(year, month);
            System.out.println("In the " + month + " month of " + year + " the number of days: " + daysInMonth);
        } catch (ArithmeticException e) {
            System.out.println("Your input is incorrect!");
        }
    }
}
