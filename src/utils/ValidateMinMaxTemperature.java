package utils;

public class ValidateMinMaxTemperature {
    public static int[] validateMinMaxTemperature(String min, String max) {
        int[] min_max = new int[2];
        try {
            min_max[0] = Integer.parseInt(min);
            min_max[1] = Integer.parseInt(max);
            if (min_max[1] < min_max[0]) {
                throw new ArithmeticException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода, необходимо вводить только цифры");
            System.exit(0);
        } catch (ArithmeticException е) {
            System.out.println("Ошибка ввода, максимум меньше минимума!");
            System.exit(0);
        }
        return min_max;
    }
}
