package products;

import java.util.Map;
import java.util.stream.Collectors;

public class ProductsByPriceCondition {
    private Map<String, Float> resultProductMap;
    private Map<String, Float> initialProductMap;

    private float maxPriceCondition;

    public ProductsByPriceCondition(Map<String, Float> initialProductMap, float maxPriceCondition) {

        this.initialProductMap = initialProductMap;
        this.maxPriceCondition = maxPriceCondition;
    }

    public Map<String, Float> getResultProductMap() {

        findProducts();
        return resultProductMap;
    }

    private void findProducts() {

        resultProductMap = initialProductMap.entrySet()
                .stream()
                .filter(map -> map.getValue() <= maxPriceCondition)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

}
