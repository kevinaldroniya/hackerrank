package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;


public class SimpleArraySum {



    public static int arraySum(List<Integer> ar) {
        var arResult=0;
        for (int i = 0; i <= ar.size()-1 ; i++) {
            arResult+=ar.get(i);
        }
        return arResult;
    }

    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();

        System.out.print("Array Size :");
        Integer size = MainApp.in.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("Number-"+(i+1)+" :");
            Integer arFill = MainApp.in.nextInt();
            ar.add(arFill);
        }

        var result = arraySum(ar);

        System.out.println("Result :"+result);

    }
}
