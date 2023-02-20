package data_source;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static utils.RandomInRange.randomInRange;

public class TemperatureData {

    public Map<DayOfWeek, Integer> getData() {
        return randomWeekTemperature();
    }

    private Map<DayOfWeek, Integer> randomWeekTemperature() {

        Map<DayOfWeek, Integer> weekTemperature = new HashMap<>();
        int temperature;
        AtomicInteger i = new AtomicInteger(0);
        while (weekTemperature.size() < 7) {
            temperature = randomInRange(8, 15);
            weekTemperature.put(DayOfWeek.of(i.incrementAndGet()), temperature);
        }
        return weekTemperature;
    }
}
