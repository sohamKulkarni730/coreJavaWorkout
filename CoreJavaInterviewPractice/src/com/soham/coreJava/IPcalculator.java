package com.soham.coreJava;
import java.util.ArrayList;

public class IPcalculator

{
    /*public static void main(String Args[]) {
	new IPcalculator().IPfinder("21344");

    }*/

    public void IPfinder(String input) {
	/*
	 * Strategy is to place three dots in different possible combination. Now ,
	 * while working put this solution on paper ,we could show that it would always
	 * be XC3 where (X+1) is the number of Characters in given String; C is the
	 * symbol for combination
	 * 
	 * for E.g. if String is of 4 character long then there is only 1 possible
	 * combination
	 */

	ArrayList<String> results = new ArrayList<String>();

	for (int i = 1; i < input.length() - 2; i++)
	    for (int j = i + 1; j < input.length() - 1; j++)
		for (int k = j + 1; k < input.length(); k++) {
		    String tempIP = input.substring(0, i) + "." + input.substring(i, j) + "." + input.substring(j, k)
			    + "." + input.substring(k, input.length());
		    if (isvalidIP(tempIP))
			results.add(tempIP);

		}

	System.out.println(results);

    }

    public boolean isvalidIP(String possibleIP) {
	boolean result = true;
	// i is size and should be reduced by 1 in order to be used as power/index

	int startIndex = 0, rearIndex = 0;
	String tempString = null;
	int length = possibleIP.length();
	while (rearIndex < length) {
	    if (possibleIP.charAt(rearIndex) == '.' || rearIndex == length - 1) {
		if (!(rearIndex == length - 1))
		    tempString = possibleIP.substring(startIndex, rearIndex);
		else
		    tempString = possibleIP.substring(startIndex, rearIndex + 1);
		if (!(Integer.parseInt(tempString) <= 255 && !tempString.startsWith("0")))
		    return false;
		startIndex = rearIndex + 1;

	    }
	    rearIndex++;
	}

	return result;

    }

    public boolean isValidNumber(String input) {

	return false;

    }

}
