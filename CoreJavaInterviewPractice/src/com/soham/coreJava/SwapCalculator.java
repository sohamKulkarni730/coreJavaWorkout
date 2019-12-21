package com.soham.coreJava;

import java.util.Arrays;

public class SwapCalculator {

    private static class Swaps {
        public int swaps;
        public boolean chaotic;
    }
    
    public static void main(String[] args) {
	 int[] q = {1,2 ,5 ,3, 4, 7, 8, 6} ;
	 int[] q1 = {1, 2, 5, 3, 7, 8, 6, 4} ;
	 
	 
	 
	 int length =q.length;
	        final Swaps s = new Swaps();
	        s.swaps = 0;
	        s.chaotic = false;
	        
	        
	 for(int i=0;i<length-1;i++)
             for(int j=i+1;j<length;j++)  
                      if(q[i]>q[j])
                         if(q[i]-q[j]>1 && j!=length-1)
                            {s.swaps= s.swaps +2;
                             break;
                            }
                         else
                             s.swaps++;
                 
             
	 
	 System.out.println(s.swaps);
                 
        }
    }


