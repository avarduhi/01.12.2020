package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr= {1, 5, 2, 7, 8};
        int arrLen = arr.length;
        for(int i=0; i<arrLen; i++){
            int count = 0;
            int[] arr1 = newArr(arr, i);
            for(int j=0; j<arrLen-1; j++){
                if(count== arrLen-2){
                    System.out.println("Այո, ցուցակը կարող է աճող լինել");
                }
                if (arr1[i]>arr1[i+1]){
                    System.out.println("Այո, ցուցակը չի կարող լինել աճող");
                    break;
                }
                else if(arr1[i]<=arr1[i+1]){
                    count++;
                }
            }
        }
    }

    static int[] newArr(int arr[], int n){
        int[] arr1 = new int[0];
        int index=0;
        for(int i=0; i<arr.length; i++){
            if(i == n){
                continue;
            }else{
                arr1[index]=arr[i];
                index++;
            }
        }
        return arr1;
    }
}
