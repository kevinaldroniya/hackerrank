package hackerrank.algorithms;

import java.util.Collections;
import java.util.List;

public class BirthdayCake {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        var point =0;
        var biggest=0;
//        Collections.sort(candles, Collections.reverseOrder());
        for (int i = 0; i <= candles.size()-1; i++) {
            if(i<candles.size()-1){
                if(biggest<candles.get(i)){
                    biggest=candles.get(i);
                }
            }
        }

        for (int i = 0; i <= candles.size()-1; i++) {
            if (biggest==candles.get(i)){
                point++;
            }
        }

        return point;
    }

    public static void main(String[] args) {
        int i = birthdayCakeCandles(List.of(4, 4, 1, 3));
        System.out.println(i);
    }
}
