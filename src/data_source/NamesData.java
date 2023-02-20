package data_source;

import java.util.List;

public class NamesData {
    private List<String> namesList;

    public NamesData(List<String> namesList) {
        this.namesList = namesList;
    }

    public List<String> getNamesList() {
        getData();
        return namesList;
    }

    private void getData() {
        namesList.add("Доброжир");
        namesList.add("Тихомир");
        namesList.add("Ратибор");
        namesList.add("Путислав");
        namesList.add("Ярополк");
        namesList.add("Гостомысл");
        namesList.add("Велимудр");
        namesList.add("Святослав");
        namesList.add("Милонег");
        namesList.add("Светозар");
        namesList.add("Всеволод");
        namesList.add("Богдан");
        namesList.add("Доброгнева");
        namesList.add("Любомила");
        namesList.add("Миролюб");
    }

}
