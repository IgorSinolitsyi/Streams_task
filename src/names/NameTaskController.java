package names;

import data_source.NamesData;

import java.util.ArrayList;
import java.util.List;

import static names.NamesView.printNames;
import static utils.GetDataScanner.getDataScanner;

public class NameTaskController {
    public void startTask() {
        List<String> namesList = new NamesData(new ArrayList<>()).getNamesList();
        printNames(namesList, "Исходный список имен");

        NamesByFirstLetter NamesByFirstLetter =
                new NamesByFirstLetter(namesList,
                        getDataScanner("Введите первую букву имени: ")
                                .trim()
                                .toUpperCase()
                                .charAt(0));
        printNames(NamesByFirstLetter.getResultListNames(), "Результат отбора имен");
    }
}
