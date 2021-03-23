package com.qw;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round(Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]==arr[i]) count--;
        }
        System.out.println(count);
    }
}
