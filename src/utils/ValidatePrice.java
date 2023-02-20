package utils;

public class ValidatePrice {
    public static float validatePrice(String priceStr) {

        try {
            return Float.parseFloat(priceStr);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода, необходимо вводить только цифры");
            System.exit(0);
        }
        return 0;
    }
}
