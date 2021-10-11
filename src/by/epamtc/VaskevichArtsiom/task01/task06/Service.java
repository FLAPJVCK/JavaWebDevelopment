package by.epamtc.VaskevichArtsiom.task01.task06;

public class Service {
    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_MINUTE = 60;

    public static int[] timeCounter(int nSeconds) {
        int hour, minute, second;
        hour = nSeconds / SECONDS_IN_HOUR;
        minute = (nSeconds - (hour * SECONDS_IN_HOUR)) / SECONDS_IN_MINUTE;
        second = nSeconds - (hour * SECONDS_IN_HOUR) - (minute * SECONDS_IN_MINUTE);
        return new int[]{hour, minute, second};
    }
}
