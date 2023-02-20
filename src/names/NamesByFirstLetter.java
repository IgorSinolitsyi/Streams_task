package names;

import java.util.List;

public class NamesByFirstLetter {
    private List<String> resultListNames;
    private List<String> initialListNames;

    private char firstLetterOfName;

    public NamesByFirstLetter(List<String> initialListNames, char firstLetterOfName) {

        this.initialListNames = initialListNames;
        this.firstLetterOfName = firstLetterOfName;
    }

    public List<String> getResultListNames() {

        findNames();
        return resultListNames;
    }

    private void findNames() {

        resultListNames = initialListNames.stream()
                .filter(str -> str.trim().charAt(0) == firstLetterOfName)
                .toList();
    }

}
