package com.company;


public class IdiotSort {

    boolean isSorted(int[] array,int[]permutation) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[permutation[i]] > array[permutation[i + 1]]) return false;
        }
        return true;
    }

    boolean nextPermutation(int[] a) {
        int tmp;
        int n = a.length;
        int j = n - 2;
        while (j != -1 && a[j] > a[j + 1]) j--;
        if (j == -1)
            return false; // a - last permutation
        int k = n - 1;
        while (a[j] > a[k]) k--;

        tmp=a[j];
        a[j]=a[k];
        a[k]=tmp;

        // reverse [j+1, n-1]
        int l = j + 1, r = n - 1;
        while (l < r){
            tmp=a[l];
            a[l]=a[r];
            a[r]=tmp;
            ++l;
            --r;
        }
        for(int perm:a)
            System.out.print(perm+" ");
        System.out.print("\n");
        return true;
    }

    public void sort(int[] array) {
        int[] permutation = new int[array.length];
        for(int i=0;i<array.length;++i)
        {
            permutation[i]=i;
        }
        while (nextPermutation(permutation) && !isSorted(array,permutation))
        {
            ;
        }

        /*for(int i=0;i<array.length-1;++i){
            if(i!=permutation[i]){
                int tmp=array[i];
                array[i]=array[permutation[i]];
                array[permutation[i]]=tmp;
            }

        }
*/
         }


}
