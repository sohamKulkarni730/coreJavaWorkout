package com.soham.coreJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.LongStream;

public class TestClass {

  // Following version of function is taking too long
    static long arrayManipulation1(int n, int[][] queries) {
	long start = System.nanoTime();
	long[] temp = new long[n];
        // iterting through change requests
        for (int i = 0 ; i < queries.length; i++)
            { 
            
            // chnging state of temp array
               for(int j=queries[i][0]-1  ; j<queries[i][1]; j++) 
               {
                   temp[j]= temp[j]+ queries[i][2];
               }
            }
        System.out.println("arrayManipulation1  "+(System.nanoTime()-start));
        return Arrays.stream(temp).max().getAsLong();
    }
   
 // Following version of function is taking too long
        static long arrayManipulation(int n, int[][] queries) {
	long start = System.nanoTime();
        long[] temp = new long[n];
        int pointer =0 ;
        // iterting through change requests
        for (int i = 0 ; i < queries.length; i++)
            { 
            //  System.out.println(queries[i][0]+" "+queries[i][1]+" "+queries[i][2]);
            // chnging state of temp array
               for(int j=queries[i][0]-1  ; j<queries[i][1]; j++) 
               {
                   temp[j]= temp[j]+ queries[i][2];
                   if(temp[j]>temp[pointer])
                     pointer=j;
               }
            }
        System.out.println("arrayManipulation  "+(System.nanoTime()-start));
        return  temp[pointer];

    }
     // Following version of function is taking too long
    static long arrayManipulation2(int n, int[][] queries) {

        long[] temp = new long[n];
        int pointer =0;
        // iterting through change requests
        int numberOfRequest= queries.length;
        long result= 0L;
        
        for (int i=0;  i < numberOfRequest ; i++)
            {  
             for( int j = queries[i][0]-1 ;j < queries[i][1]; j++)
             {
        	 temp[j]++;
        	 if(temp[j]>temp[pointer])
        	     pointer=j ;
             }
            }
         
        for(int i=0;  i < numberOfRequest ; i++)
        {
            if(queries[i][0]<=(pointer+1) && (pointer+1)<= queries[i][1])
        	result=result+queries[i][2];
        	
        }
        
        return result;
    }
    
    // best solution
    static long arrayManipulation3(int n, int[][] queries) {
    
        long[] temp = new long[n];
        
        // iterting through change requests
        int numberOfRequest= queries.length;
        long result= 0L;
        long tempVarible = 0L;
        
        for (int i=0;  i < numberOfRequest ; i++)
            {  
              temp[queries[i][0]-1] =temp[queries[i][0]-1]+ queries[i][2];
              if(queries[i][1]!=n)
              temp[queries[i][1]] = temp[queries[i][1]]- queries[i][2];
            }
         
        for(int i=0;  i < n ; i++)
            { 
    	          tempVarible= tempVarible+temp[i];
        	  if(tempVarible>result)
        	      result= tempVarible;
            }
         long result1=0l;
        
        return result;
    }
    
  
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
	
	
	 // File file = new File("D:\\CodeSpace\\TestCase\\MatrixManipulation\\input15.txt"); // Expected output: 31
	 
	  File file = new File("D:\\CodeSpace\\TestCase\\MatrixManipulation\\input07.txt"); // Expected output: 2497169732
	 // File file = new File("D:\\CodeSpace\\TestCase\\MatrixManipulation\\input00.txt");   // Expected output: 200
	  BufferedReader br = new BufferedReader(new FileReader(file)); 
	  
        
        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = br.readLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }
        System.out.println("Starting the calculation");
        long result = arrayManipulation3(n, queries);
      //  long result1 = arrayManipulation(n, queries);
        System.out.println(result);
       
        scanner.close();
    }
}

