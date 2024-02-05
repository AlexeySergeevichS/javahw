package pack6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class app {
    public static void main(String[] args) {
        Integer[] arr = {};
//        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        arr = new Integer[]{-2,-1, 0,1, 2, 3, 4, 5};
        analyzeNumbers(arr);

    }
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> aList = new ArrayList<>();
        aList.addAll(Arrays.asList(arr));
        Collections.sort(aList);
        System.out.println(aList);
        int minE = aList.get(0);
        int maxE = aList.get(aList.size()-1);
        float avE = ((float)minE+(float)maxE)/2;
        System.out.println("Minimum is " + minE);
        System.out.println("Maximum is " + maxE);
        System.out.println("Average is = " + avE);

    }
}
