package com.advanced.dsa.algos.sorting;
public class Quicksort {
    static void quick(int a[], int l, int h){
        if(l<h){
            int p=a[h], i=l-1;
            for(int j=l;j<h;j++)
                if(a[j]<p){ i++; int t=a[i]; a[i]=a[j]; a[j]=t; }
            int t=a[i+1]; a[i+1]=a[h]; a[h]=t;
            quick(a,l,i);
            quick(a,i+2,h);
        }
    }

    public static void main(String[] args){
        int a[]={8,3,5,2,9,1};
        quick(a,0,a.length-1);
        for(int x:a) System.out.print(x+" ");
    }
}