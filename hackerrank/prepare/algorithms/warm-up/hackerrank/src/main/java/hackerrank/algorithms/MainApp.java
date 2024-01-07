package hackerrank.algorithms;

import java.util.Scanner;

public class MainApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double result = (double) 2/5;
        System.out.println(result);
        String format = String.format("%.4f", result);
        System.out.println(format);
    }
}
