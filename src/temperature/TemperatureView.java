package temperature;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class TemperatureView {
    public static void printTemperature(Map<DayOfWeek, Integer> temperatureMap, String massage) {

        if (!temperatureMap.isEmpty()) {
            System.out.println("\n" + massage);
            AtomicInteger cnt = new AtomicInteger(0);
            temperatureMap.entrySet()
                    .stream()
                    .sorted(Comparator.comparing(day -> day.getKey().ordinal()))
                    .forEach(days -> System.out.println(cnt.incrementAndGet() + ") " + days.getKey()
                            .getDisplayName(TextStyle.FULL_STANDALONE, Locale.getDefault()) + " " + days.getValue() + "°"));
        } else System.out.println("\nНа этой неделе такой температуры небыло");
    }
}
