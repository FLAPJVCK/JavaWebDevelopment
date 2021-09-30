package by.epamtc.VaskevichArtsiom.task01.task3;

public class runner {
    public static void main(String[] args) {
        double squareArea1, squareArea2;
        try{
            System.out.print("Input square area ");
            squareArea1 = service.scanNumber();
            squareArea2 = service.squareInCircleArea(service.circleInSquareDiameter(squareArea1));
            System.out.println("Area of a given square: " + squareArea1);
            System.out.println("Area of the inscribed square: " + squareArea2);
            System.out.println("the area of the inscribed square is " + service.compareTwoSquaresArea(squareArea1, squareArea2) +" times less than the area of the given square");
        } catch (ArithmeticException e){
            System.out.println("Your input is incorrect!");
        }
    }
}
