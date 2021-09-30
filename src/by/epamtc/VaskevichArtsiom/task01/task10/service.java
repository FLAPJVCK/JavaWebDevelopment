package by.epamtc.VaskevichArtsiom.task01.task10;

import java.util.Scanner;

public class service {
    public static double scanNumber(){
        double number;
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()){
            number = scanner.nextDouble();
            return number;
        } else {
            throw new ArithmeticException();
        }
    }

    public static double[][] getValues(double a, double b, double h){
        double[][] results = new double[2][];
        double y, i;
        int j, arraySize = 0;
        for (i = a; i <= b; i += h){
            arraySize += 1;
        }
        results[0] = new double[arraySize];
        results[1] = new double[arraySize];
        for (i = a, j = 0; i <= b; i += h, j++){
            y = Math.tan(i);
            results[0][j] = i;
            results[1][j] = y;
        }
        return results;
    }

    public static void printTable(double[][] results){
        System.out.println("-------------------------------------");
        System.out.println("|        x        |        y        |");
        System.out.println("-------------------------------------");
        for (int i = 0; i < results[0].length; i++){
            String str = String.format("|     %.5f     |     %.5f     |", results[0][i], results[1][i]);
            System.out.println(str);
        }
        System.out.println("-------------------------------------");
    }
}
