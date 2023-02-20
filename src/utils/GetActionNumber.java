package utils;

import static utils.ValidationInputString.isStringMatches;

public class GetActionNumber {
    public static int getActionNumber() {
        String actionChoice;
        String CHOOSE_TASK_VIEW = Constants.CHOOSE_TASK_VIEW;
        System.out.println("\n" + CHOOSE_TASK_VIEW);
        do {
            actionChoice = GetDataScanner.getDataScanner("Введите номер задания" + "\n");
        }
        while (!isStringMatches(actionChoice, Constants.VALID_MAP_ORDER_TASK_CHOICE_REGEX));

        return Integer.parseInt(actionChoice);
    }

}
