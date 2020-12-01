package com.company;

import java.util.Arrays;

//Առաջադրանք 3: իմպլանտացնել reverse(int a[], int n) մեթոդը։(n-ը զանգվածի երկարությունն է)
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {2, 3, 5, 6, 7};
        reverse(arr, arr.length);


    }

    static void reverse(int a[], int n) {
        int tmp;
        for (int i=0; i<=n/2; i++) {
            tmp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = tmp;
        }
        System.out.println(Arrays.toString(a));

    }
}
