package com.yearup.week1;

public class Practice {

    public static void main(String[] args) {
        containsElement(new int[]{1,2,3},6);
        //System.out.println("Hello");
    }

    public static boolean containsElement(int[] arr, int element){
        for(int i=0; i<arr.length;i++){
            if(arr[i] == element)
                return true;
            System.out.println(i);
        }
        //System.out.println("False");
        return false;

    }
}
