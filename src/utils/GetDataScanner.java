package utils;

import java.util.Scanner;

public class GetDataScanner {
    public static String getDataScanner(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n" + msg);
        return scanner.nextLine();
    }
}
