package names;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class NamesView {
    public static void printNames(List<String> namesList, String massage) {
        if (!namesList.isEmpty()) {
            System.out.println("\n" + massage);
            AtomicInteger cnt = new AtomicInteger(0);
            namesList.forEach(name ->
                    System.out.println(cnt.incrementAndGet() + ") " + name));
        } else System.out.println("\nИмен не найдено");
    }
}
