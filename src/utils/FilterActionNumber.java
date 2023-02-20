package utils;

import names.NameTaskController;
import products.ProductsTaskController;
import temperature.TemperatureTaskController;

public class FilterActionNumber {
    public static void filterActionNumber(int option) {

        switch (option) {
            case 1 -> {
                new NameTaskController().startTask();
            }
            case 2 -> {
                new ProductsTaskController().startTask();
            }
            case 3 -> {
                new TemperatureTaskController().startTask();
            }
            case 0 -> {
                System.exit(0);
            }
            default -> throw new IllegalStateException("Ошибка ввода: " + option);
        }
    }

}