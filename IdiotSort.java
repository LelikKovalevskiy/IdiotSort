package com.company;

import java.util.Random;

public class IdiotSort {

    public Random random;

    public IdiotSort() {
        random = new Random();
    }

    public void idiotSort(int[] array) {
        while (!isOrdered(array)) FisherYatesShuffle(array);
    }

    public void FisherYatesShuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int swapPosition = random.nextInt(array.length);
            int tmp = array[i];
            array[i] = array[swapPosition];
            array[swapPosition] = tmp;
        }
    }

    public boolean isOrdered(int[] n) {
            for (int i = 0; i < n.length-1; i++) {
            if (n[i] > n[i + 1]) return false;
        }
        return true;
    }
}
