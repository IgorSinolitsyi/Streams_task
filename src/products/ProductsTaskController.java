package products;

import data_source.ProductsData;

import java.util.Map;

import static products.ProductsView.printProducts;
import static utils.GetDataScanner.getDataScanner;
import static utils.ValidatePrice.validatePrice;

public class ProductsTaskController {
    public void startTask() {

        Map<String, Float> productsMap = new ProductsData().getData();
        printProducts(productsMap, "Исходный список товаров");

        ProductsByPriceCondition findProductsByPriceCondition =
                new ProductsByPriceCondition(productsMap, validatePrice(getDataScanner("Введите максимальную цену : ")));

        printProducts(findProductsByPriceCondition.getResultProductMap(), "Результат отбора товаров");
    }

}
