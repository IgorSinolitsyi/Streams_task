package data_source;

import java.util.HashMap;
import java.util.Map;

import static utils.RandomInRange.randomInRange;

public class ProductsData {

    public Map<String, Float> getData() {
        return randomProductMapGenerator();
    }

    private Map<String, Float> randomProductMapGenerator() {
        Map<String, Float> products = new HashMap<>();
        float price;
        String[] productNamesArray = {"Полоний", "Ботулотоксин", "Рицин", "Стрихнин", "Цианид", "Батрахотоксин"};
        while (products.size() < 6) {
            price = randomInRange(105, 315);
            price = price / 100;
            products.put(productNamesArray[randomInRange(0, 5)], price);
        }
        return products;
    }
}
