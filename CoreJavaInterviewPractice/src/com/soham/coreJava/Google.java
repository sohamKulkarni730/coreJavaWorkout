package com.soham.coreJava;

public class Google {

    public static void main(String[] args) {
	
	
	for (int i =1 ; i<=100; i++)
	{
	    if (i%3==0 && i%5==0)
		System.out.println("Divisible by 3 and 5");
	    else if(i%3==0)
		System.out.println("Divisible by 3");
	    else if(i%5 ==0)
		System.out.println("Divisible by 5");
	    else
		System.out.println(i);
	}

    }

}
