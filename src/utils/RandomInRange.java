package utils;

public class RandomInRange {

    public static int randomInRange(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}
