package by.epamtc.VaskevichArtsiom.task01.task06;

public class runner {
    public static void main(String[] args) {
        int nSeconds;
        int[] result;
        try {
            System.out.println("Input number of seconds ");
            nSeconds = service.scanNumber();
            result = service.timeCounter(nSeconds);
            System.out.println(result[0] + " hours " + result[1] + " minutes " + result[2] + " seconds");
        } catch (ArithmeticException e){
            System.out.println("Your input is incorrect!");
        }
    }
}
