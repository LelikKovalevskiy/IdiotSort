package com.company;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IdiotSort sorter = new IdiotSort();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String stringArray[] = input.split(" ");
        int array[]=new int[stringArray.length];
        for (int i=0;i<stringArray.length;++i) {
            array[i]=Integer.parseInt(stringArray[i]);
        }
        sorter.idiotSort(array);
        System.out.println("Sorted array:");
        for (int item:array)
        {
            System.out.print(item+" ");
        }

    }
}
