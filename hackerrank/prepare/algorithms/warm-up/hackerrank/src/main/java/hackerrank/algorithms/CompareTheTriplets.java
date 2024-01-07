package hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CompareTheTriplets {

    public static List<Integer> compare(List<Integer> a, List<Integer> b){
        Integer aPoint=0;
        Integer bPoint=0;
        for (int i = 0; i <= a.size()-1; i++) {
            if (a.get(i)>b.get(i)){
                aPoint+=1;
            } else if (a.get(i)<b.get(i)) {
                bPoint+=1;
            }
        }
        List<Integer> result = List.of(aPoint,bPoint);
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Size :");
        Integer size = MainApp.in.nextInt();

        List<Integer> aArr = new ArrayList<>();
        System.out.println("A Value :");
        for (int i = 0; i < size; i++) {
            System.out.print("A-"+(i+1)+" :");
            Integer aValue = MainApp.in.nextInt();
            aArr.add(aValue);
        }

        List<Integer> bArr = new ArrayList<>();
        System.out.println("B Value :");
        for (int i = 0; i < size; i++) {
            System.out.print("B-"+(i+1)+" :");
            Integer bValue = MainApp.in.nextInt();
            bArr.add(bValue);
        }

        List<Integer> result = compare(aArr, bArr);
        System.out.println("Result :"+result);
    }
}
