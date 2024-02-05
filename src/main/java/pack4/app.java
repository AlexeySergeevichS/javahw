package pack4;


import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{5, 1, 6, 2, 3, 4};
//        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(mergeSort(a));
        System.out.println(itresume_res);

    }

    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        if (a == null) {
            return null;
        }
        if (a.length < 2) {
            return a;
        }
        int[] a1 = new int[a.length / 2];
        System.arraycopy(a, 0, a1, 0, a.length / 2);
        int[] a2 = new int[a.length - a1.length];
        System.arraycopy(a, a1.length, a2, 0, a.length - a1.length);
        a1 = mergeSort(a1);
        a2 = mergeSort(a2);
        return merge(a1, a2);

    }

    private static int[] merge(int[] a1, int[] a2) {
        int[] merA = new int[a1.length + a2.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < merA.length; i++) {

            if (i - j == a1.length) {
                merA[i] = a2[i - k];
                j++;

            } else if (i - k == a2.length) {
                merA[i] = a1[i - j];
                k++;
            } else if (a1[i - j] < a2[i - k]) {
                merA[i] = a1[i - j];
                k++;
            } else {
                merA[i] = a2[i - k];
                j++;
            }
        }
        return merA;
    }
}
