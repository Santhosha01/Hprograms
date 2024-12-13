package Day8.program1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	   try {
		   System.out.println("Enter the name");
		   String input=br.readLine();
		   System.out.println("Hello "+input+"!");
	   }
	   catch(Exception e) {
		   System.out.println("Error");
	   }
   }
}
