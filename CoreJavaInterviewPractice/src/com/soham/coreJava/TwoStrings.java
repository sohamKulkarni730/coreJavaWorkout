package com.soham.coreJava;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class TwoStrings {
    

    

        // Complete the twoStrings function below.
        static String twoStrings(String s1, String s2)
         {
           // Arrays.Stream(s1).flatmap(i-> (i))
           //System.out.println(s1 +"  "+s2);
            List<String> ListS1 = new ArrayList<String>();
            List<String> ListS2 = new ArrayList<String>();
            ListS1.add(s1);
            ListS2.add(s2);
           // s1.chars().distinct().flatMap(i->  new boolean[] s2.chars().map(k-> k==i));   
          
           // s1.chars().distinct().forEach(j-> System.out.println((char)j));
            
             s1.toCharArray();
             s2.toCharArray();
             
             Set result = new HashSet();
             Set temp = new HashSet();
             
             for (Character c : s1.toCharArray()) {
        	 result.add(c);
	        }
             
             for (Character c : s2.toCharArray()) {
        	 temp.add(c);
	        }
             
             result.retainAll(temp);
             
             if(result.isEmpty())
        	 return "NO";
             else 
        	 return "YES";
             
         }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {
                String s1 = scanner.nextLine();

                String s2 = scanner.nextLine();

                String result = twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();*/
            
            String result = twoStrings("good", "god");
            
        }
    }
