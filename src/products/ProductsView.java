package products;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ProductsView {
    public static void printProducts(Map<String, Float> productsMap, String massage) {
        if (!productsMap.isEmpty()) {
            System.out.println("\n" + massage);
            AtomicInteger cnt = new AtomicInteger(0);
            productsMap.forEach((key, value) -> System.out.println(cnt.incrementAndGet() + ") " + key + " " + value));
        } else System.out.println("\nТовар не найден");
    }
}
