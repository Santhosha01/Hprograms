package Day8.program7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
	   String filepath="D:\\team.txt";
	   Scanner sc=new Scanner(System.in);
	   try(BufferedReader reader=new BufferedReader(new FileReader(filepath))) {
	       StringBuilder sb=new StringBuilder();
	       String line;
	       while((line=reader.readLine())!=null) {
	    	  sb.append(line); 
	       }
	      System.out.println("Enter the number of word to be searched");
	      int number=sc.nextInt();
	      sc.nextLine();
	      for(int i=0;i<number;i++) {
	    	  System.out.println("Enter the String ");
	    	  String pattern=sc.nextLine();
	    	  int count=countOccurences(sb.toString(),pattern);
	        System.out.println("Word : "+pattern+" Count : "+count);
	      }
	   }
	   catch(IOException c) {
		   System.out.println("Error");
	   }
	   finally {
		   sc.close();
	   }
   }

private static int countOccurences(String text, String pattern) {
	int c=0;
	int index=0;
	while((index=text.indexOf(pattern,index))!=-1) {
		c++;
		index+=pattern.length();
	}
	return c;
}
}
