package hackerrank.algorithms;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr){
        Integer d1 = 0;
        Integer d2 = 0;
        for (int i = 0; i <= arr.size()-1; i++) {
            for (int j = 0; j <= i; j++) {
                if (i==j){
                    d1+= arr.get(i).get(j);
                    d2+= arr.get(i).get(arr.size()-j-1);
                }
            }
        }
        return Math.abs(d1-d2);
    }

    public static void main(String[] args) {
        int result = diagonalDifference(List.of(List.of(11, 2, 4), List.of(4, 5, 6), List.of(10, 8, -12)));
        System.out.println(result);

    }
}
