package com.soham.coreJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinSwapToSorted {

    /*static int[]  minmaxloc(int[] arr){
        
        
         int smallest = 0;
        for(int i =0; i<arr.length;i++)
             if(arr[i]<arr[smallest] && arr[i]!=0)
             smallest= i;
        
        
        int total = 0;
        int swap =0;
        int temp =0;
        total= (Math.abs(arr[0]-smallest )+ Math.abs(arr[smallest]+smallest-0));
        for(int i = 0 ; i< smallest;i++)
        { temp= (Math.abs(arr[i]+arr[smallest]));
        //temp =math.abs(arr[i]-i+arr[smallest]-smallest+2)
            if((arr[i]!=0)&&(total>temp))
                {swap= i;
                 total= temp;
                }
        }
          int[] result = {smallest, swap };
        return result;
    }

    static int[] calcBaseArray(int[] arr)
    {  
        int[] baseArray = new int[arr.length];
        for (int i =0; i < arr.length ; i ++)
             baseArray [i]= arr[i]- (i+1) ;
             return baseArray; 
    }
    
    static int minimumSwaps(int[] arr) {
        int[] baseArray = new int[arr.length];
        int[] locations = new int[2];
        int temp1 =0;      
        int swaps = 0;
        while(!isSorted(arr))
          {
                 // a logic to acertain the numbers to swap ,based on their value and position difference 
                 // 2 3 4 1 5  --  [1, 1, 1, -3, 0]
                 //[7, 1, 3, 2, 4, 5, 6] -- [6,-1,0,-2,-1,-1,-1]
                
                 //   baseArray = calcBaseArray(arr);

               int smallest = 0;
               for(int i =0; i<arr.length;i++)
                    if(arr[i]<arr[smallest] && arr[i]!=0)
                    smallest= i;
               
               
               int total = 0;
               int swap =0;
               int temp =0;
               total= Math.abs(arr[0]+arr[smallest]-smallest+2);
               for(int i = 0 ; i< smallest;i++)
               { //temp= (Math.abs(arr[i]+arr[smallest]));
                   temp =Math.abs(arr[i]-i+arr[smallest]-smallest+2);
                   if((arr[i]!=0)&&(total>temp))
                       {swap= i;
                        total= temp;
                       }
               }
                   // locations= minmaxloc(baseArray);
                    temp1 = arr[swap];
                    arr[swap]=arr[smallest];
                    arr[smallest]= temp1;
                    swaps ++;
                    
           }      
            
        for(int i :arr)
            System.out.print(i+ " ,");
             ; 
      
      return swaps;
    }*/
    static int minimumSwaps(int[] array) {
        int n = array.length - 1;
        int minSwaps = 0;
        for (int i = 0; i < n; i++) {
            if (i < array[i] - 1) {
                swap(array, i, Math.min(n, array[i] - 1));
                minSwaps++;
                i--;
            }
        }
        return minSwaps;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static boolean isSorted(int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1])
            return false;
    }
    return true;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        System.out.println("Starting to swap");
        int res = minimumSwaps(arr);
        System.out.println(res);
        scanner.close();
    }
}
