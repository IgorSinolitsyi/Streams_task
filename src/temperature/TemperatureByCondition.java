package temperature;

import java.time.DayOfWeek;
import java.util.Map;
import java.util.stream.Collectors;

public class TemperatureByCondition {
    private Map<DayOfWeek, Integer> resultTemperatureMap;
    private Map<DayOfWeek, Integer> initialTemperatureMap;

    private float maxTemperatureCondition;
    private float minTemperatureCondition;

    public TemperatureByCondition(Map<DayOfWeek, Integer> initialTemperatureMap, int maxTemperatureCondition,
                                  int minTemperatureCondition) {
        this.initialTemperatureMap = initialTemperatureMap;
        this.maxTemperatureCondition = maxTemperatureCondition;
        this.minTemperatureCondition = minTemperatureCondition;
    }

    public Map<DayOfWeek, Integer> getResultTemperatureMap() {

        findDays();
        return resultTemperatureMap;
    }

    private void findDays() {

        resultTemperatureMap = initialTemperatureMap.entrySet()
                .stream()
                .filter(map -> (map.getValue() >= maxTemperatureCondition) && (map.getValue() <= minTemperatureCondition))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
