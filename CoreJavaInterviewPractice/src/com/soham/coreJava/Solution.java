package com.soham.coreJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections.*;
public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) 
    {
         Integer [] SumArray = new Integer[16];
         int k = 0 ;
           
                for (int i=0  ; i <=3 ; i++)
                  for (int j = 0 ; j <=3 ; j++)
                    { 
                      SumArray[k] = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                	              arr[i+1][j+1]+
                	    arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                      k++;
                    }
                        
          return Collections.max(Arrays.asList(SumArray));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);
    }
}
