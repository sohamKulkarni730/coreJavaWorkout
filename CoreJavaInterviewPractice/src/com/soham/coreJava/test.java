package com.soham.coreJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;




class test 
{ 
    public class Q6db8 {
	    int a;
	    int b = 0;
	    
	    public void m() {
	        int d;
	        int e = 0;
	        // Position 1
	    }
	}
    
 // Function to print duplicates 
    public long hasDuplicatesUsingMap(int [] arrA){
	long time= System.nanoTime();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <arrA.length ; i++) {
            if(map.containsKey(arrA[i])){
               // System.out.println("Array has duplicates : " + Math.abs(arrA[i]));
                return (System.nanoTime()-time);
                
            }else{
                map.put(arrA[i], 1);
            }
        }
        return (System.nanoTime()-time);
    } 
    
    public long hasDuplicates2ForLoops(int [] arrA) {
	
	long time= System.nanoTime();
        boolean result= false ;
        for (int i = 0; i < arrA.length && !result; i++) {
            for (int j = i+1; j < arrA.length; j++) {
                if(arrA[i]==arrA[j])
                {
                   // System.out.println("Array has duplicates : " + arrA[i]);
                    result= true ;
                    return (System.nanoTime()-time);
                }
            }
        }
        return (System.nanoTime()-time);
    }
    
    public void randomNumberGenerator ()
    {
	Random rand= new Random();
	File f = new File("C:\\Users\\AMOD\\Desktop\\input.txt");
	DoubleStream input = rand.doubles(10000000L);
	
	try {
	    Files.write(Paths.get("C:\\Users\\AMOD\\Desktop\\input.txt"),
		     (Iterable<String>)input.mapToObj(String::valueOf)::iterator);

	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	
	
	
    }
    
      public void sorttheMap ( )
      {
	   
	  Map tempMap = new HashMap ();
	  Properties properties = System.getProperties();
	  for(Entry t : properties.entrySet()) 
	  {
	     tempMap.put(t.getKey(), t.getValue());
	  }
	  
	   tempMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(x->System.out.println(x.toString()));
	   
	  String temp = "Oh my god y are so sweet " ;
	  ArrayList <String> tempList =  new ArrayList();
	  Arrays.stream(temp.split(" ")).forEach(x-> System.out.println(x));
	  
      }
	   
      public void searchThroughFile(Double tokenTofind)
      {
	
	  
      }
    
    // Driver program  
    public static void main(String[] args)  throws Exception
    { 
	test duplicate = new test();
	
	duplicate.sorttheMap();
	
        /* 
        duplicate.randomNumberGenerator ();*/
        
        /*try {
	    System.out.println(InetAddress.getByName("google.com").getHostAddress());
	   Properties properties = System.getProperties() ;
	    for(Entry t : properties.entrySet())
	    {
		System.out.println(t);
	    }
	} catch (UnknownHostException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}*/
	
	
        /*int arr[] = {1, 2, 3, 1, 3, 10, 10}; 
        long[] results = new long[2];
       // duplicate.printRepeating(arr, arr_size); 
        long i = 0l ;
        while(i<10000l) {
        results[0]+=duplicate.hasDuplicates2ForLoops(arr);
        results[1]+=duplicate.hasDuplicatesUsingMap(arr);
        i++;
        }
        
        double r= (double)((double)(results[1]-results[0])/(double)results[0]) ;
        
        System.out.println(results[0]+"   "+results[1] +"   " +r);*/
    } 
} 