package com.advanced.dsa.algos.sorting;
public class MergeSort {

    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);

            int[] temp = new int[r - l + 1];
            int i = l, j = m + 1, k = 0;

            while (i <= m && j <= r)
                temp[k++] = (a[i] < a[j]) ? a[i++] : a[j++];

            while (i <= m) temp[k++] = a[i++];
            while (j <= r) temp[k++] = a[j++];

            for (i = 0; i < temp.length; i++)
                a[l + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] a = {8, 3, 5, 2, 9, 1};
        mergeSort(a, 0, a.length - 1);
        for (int x : a) System.out.print(x + " ");
    }
}