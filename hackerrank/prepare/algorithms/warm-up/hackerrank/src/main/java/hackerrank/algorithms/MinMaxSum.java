package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Long> arr1 =new ArrayList<>();
        Long point=0L;
        Long fPoint=0L;
        for (int i = 0; i <= arr.size()-1; i++) {
            point+=arr.get(i);

        }

        for (int i = 0; i < arr.size(); i++) {
            fPoint=point-arr.get(i);
            arr1.add(fPoint);
        }

        Collections.sort(arr1);

        var minSum = arr1.get(0);
        var maxSum = arr1.get(arr.size()-1);


        System.out.println(minSum+" "+maxSum);
    }


    public static void main(String[] args) {
//        7 69 2 221 8974
//        396285104 573261094 759641832 819230764 364801279
//        256741038 623958417 467905213 714532089 938071625
        miniMaxSum(List.of(256741038,623958417,467905213,714532089,938071625));
    }
}
