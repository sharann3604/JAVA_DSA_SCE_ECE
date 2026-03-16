package com.advanced.dsa.algos.sorting;
public class QuickSortPivot {

    static int partition(int a[], int low, int high) {
        int pivot = a[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && a[i] <= pivot) i++;
            while (a[j] > pivot) j--;

            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        int t = a[low];
        a[low] = a[j];
        a[j] = t;

        return j;
    }

    static void quickSort(int a[], int low, int high) {
        if (low < high) {
            int p = partition(a, low, high);
            quickSort(a, low, p - 1);
            quickSort(a, p + 1, high);
        }
    }

    public static void main(String[] args) {
        int a[] = {8, 3, 7, 4, 9, 2};
        quickSort(a, 0, a.length - 1);

        for (int i : a)
            System.out.print(i + " ");
    }
}