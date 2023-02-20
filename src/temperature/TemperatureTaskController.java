package temperature;

import data_source.TemperatureData;

import java.time.DayOfWeek;
import java.util.Map;

import static temperature.TemperatureView.printTemperature;
import static utils.GetDataScanner.getDataScanner;
import static utils.ValidateMinMaxTemperature.validateMinMaxTemperature;

public class TemperatureTaskController {
    public void startTask() {

        Map<DayOfWeek, Integer> temperatureMap = new TemperatureData().getData();
        printTemperature(temperatureMap, "Значение температуры в течении недели");

        int[] min_max = validateMinMaxTemperature(getDataScanner("Введите минимальную температуру: "),
                getDataScanner("Введите максимальную температуру: "));

        TemperatureByCondition temperatureByCondition =
                new TemperatureByCondition(temperatureMap, min_max[0], min_max[1]);
        printTemperature(temperatureByCondition.getResultTemperatureMap(),
                "Дни с указанным интервалом значений температуры");

    }
}
