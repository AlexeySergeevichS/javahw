package pack5;

import java.util.Arrays;
import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        Integer[] arr = {};
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!((arr[i] % 2) == 0)) {
                aList.add(arr[i]);
            }

        }
        System.out.println(aList);


    }
}
