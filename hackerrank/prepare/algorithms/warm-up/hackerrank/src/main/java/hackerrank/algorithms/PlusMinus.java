package hackerrank.algorithms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        var plusPoint = 0;
        var minusPoint = 0;
        var netralPoint = 0;
        for (int i = 0; i <= arr.size()-1; i++) {
            if (arr.get(i)>0){
                plusPoint+=1;
            } else if (arr.get(i)<0) {
                minusPoint+=1;
            }else {
                netralPoint+=1;
            }
        }

        Double finalPlusPoint = (double)plusPoint/arr.size();
        Double finalMinusPoint = (double)minusPoint/arr.size();
        Double finalNetralPoint = (double)netralPoint/arr.size();
        String formatPlus = String.format("%.6f", finalPlusPoint);
        String formatMinus = String.format("%.6f", finalMinusPoint);
        String formatNetral = String.format("%.6f", finalNetralPoint);

        System.out.println(formatPlus);
        System.out.println(formatMinus);
        System.out.println(formatNetral);

//        List<Integer> arr1 = List.of(plusPoint,minusPoint,netralPoint);


//        System.out.println(finalPlustPoint);
    }

    public static void main(String[] args) {
        plusMinus(List.of(1,1,0,-1,-1));
    }
}
