package com.barash.day6;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = linearsearch(arr, 13);
        System.out.println(n);

    }

    public static int linearsearch(int[] arr, int no_to_search) {
        for (int i = 0; i < arr.length; i++) {
            if(arr.length==0){
                return -1;
            }
            if (arr[i] == no_to_search) {
                return i;
            } else return -1;
        }

        return -1;

    }
}
