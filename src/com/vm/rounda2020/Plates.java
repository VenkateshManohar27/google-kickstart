package com.vm.rounda2020;

import java.util.Scanner;

public class Plates {
	public int plates(int[][] arr, int plates) {
        int sum = 0;
        int[] stackIndex = new int[arr.length];
        while (plates > 0) {
            int max = 0;
            int stInd = 0;
            for (int i = 0; i < arr.length; i++) {
                //System.out.println("i"+i);
                //System.out.println("stackIndex i"+i);
                if (stackIndex[i] < arr[i].length && arr[i][stackIndex[i]] > max) {
                    max = arr[i][stackIndex[i]];
                    stInd = i;
                }
            }
            sum += max;
            stackIndex[stInd]++;
            plates--;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Plates a = new Plates();
        int t = in.nextInt();

        for (int i = 1; i <= t; i++) {
            int lines = in.nextInt();
            int len = in.nextInt();
            int plates = in.nextInt();
            int[][] arr = new int[lines][len];
            for (int k = 0; k < lines; k++) {
                for (int j = 0; j < len; j++) {
                    arr[k][j] = in.nextInt();
                }
            }
            System.out.println("Case #" + i + ": " + a.plates(arr, plates));
        }
    }
}
