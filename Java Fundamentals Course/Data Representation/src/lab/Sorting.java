package lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] inputArr = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int number = Integer.parseInt(reader.readLine());

        System.out.println(findByLinearSearch(inputArr, number));
        reader.close();
    }

    private static int findByBinarySearch(int[] inputArr, int i) {
        // TODO Auto-generated method stub
        return -1;
    }

    /**
     * Return the position of given value
     * Sort the input array if not sorted
     * @param inputArr
     * @param value
     * @return -1 if given value does not exist within the array
     */
    private static int findByLinearSearch(int[] inputArr, int value) {

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == value) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Sort array using simple bubble sort algorithm
     * @param inputArr
     * @return
     */
    private static int[] bubbleSorted(int[] inputArr) {

        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = i+1; j < inputArr.length; j++) {
                if (inputArr[i] > inputArr[j]) {
                    int tmp = inputArr[i];
                    inputArr[i] = inputArr[j];
                    inputArr[j] = tmp;
                }
            }
        }

        return inputArr;
    }

    private static int[] selectionSorted(int[] inputArr) {
        boolean flag = false;

        while (!flag) {
            flag = true;

            for (int i = 0; i < inputArr.length - 1; i++) {
                if (inputArr[i] > inputArr[i + 1]) {
                    int tmp = inputArr[i];
                    inputArr[i] = inputArr[i + 1];
                    inputArr[i+1] = tmp;
                    flag = false;
                }
            }
        }
        return inputArr;
    }
}
