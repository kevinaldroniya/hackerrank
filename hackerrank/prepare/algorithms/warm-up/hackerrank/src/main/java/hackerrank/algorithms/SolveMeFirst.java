package hackerrank.algorithms;

import java.util.Scanner;

public class SolveMeFirst {


    static Integer sum(Integer a, Integer b){
        return a+b;
    }

    public static void solveMeFirst() {
        System.out.println("---Solve Me First---");
        System.out.print("Integer a :");
        Integer a = MainApp.in.nextInt();
        System.out.print("Integer a :");
        Integer b = MainApp.in.nextInt();
        var result = sum(a, b);
        System.out.println("--------------");
        System.out.println("Result :"+result);
    }
}
