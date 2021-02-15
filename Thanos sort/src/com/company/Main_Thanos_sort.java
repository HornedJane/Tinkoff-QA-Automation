package com.company;

import java.util.Arrays;

public class Main_Thanos_sort {

    public static double countMean(int lArrayIndex, int rArrayIndex, int[] array) {

        int sum = 0;
        double mean;

        for (int i = lArrayIndex; i <= rArrayIndex; i++) {
            sum += array[i];
        }
        mean = (double) sum / (rArrayIndex - lArrayIndex + 1);
        return mean;
    }

    public static void sortThanos(int lArrayIndex, int rArrayIndex, int[] array) {

        if (lArrayIndex < rArrayIndex) {

            double mean = countMean(lArrayIndex, rArrayIndex, array);
            int[] bucket = new int[rArrayIndex - lArrayIndex + 1];
            int lBucketIndex = 0;
            int rBucketIndex = rArrayIndex - lArrayIndex;

            for (int i = lArrayIndex; i <= rArrayIndex; i++) {
                if (array[i] > mean) {
                    bucket[rBucketIndex] = array[i];
                    rBucketIndex--;
                }
                else {
                    bucket[lBucketIndex] = array[i];
                    lBucketIndex++;
                }
            }

            for (int i = lArrayIndex; i <= rArrayIndex; i++) {
                array[i] = bucket[i - lArrayIndex];
            }

            int lBucketIndexInArray = lBucketIndex + lArrayIndex - 1;
            int rBucketIndexInArray = rBucketIndex + lArrayIndex + 1;

            if (lBucketIndexInArray < rArrayIndex) {
                sortThanos(lArrayIndex, lBucketIndexInArray, array);
                sortThanos(rBucketIndexInArray, rArrayIndex, array);
            }
        }
    }

    public static int[] snapMyFingers(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        sortThanos(0, sortedArray.length - 1, sortedArray);

        return sortedArray;
    }

    public static void main(String[] args) {

        int[] input = {2, 4, 5, -3, 23, 8, 25, -28, -3, 7}; //input hardcoded here!

        int[] sortedInput = snapMyFingers(input);

        for (int elem : input) {
            System.out.print(elem + " ");
        }
        System.out.println("\n*snap*");
        for (int elem : sortedInput) {
            System.out.print(elem + " ");
        }
        System.out.println("\nPerfectly sorted, as all arrays should be");
    }
}
