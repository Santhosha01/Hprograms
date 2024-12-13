package Day8.program3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
	  String filepath="D:\\java.txt";
	  try (BufferedWriter writer=new BufferedWriter(new FileWriter(filepath,true));){
		  System.out.println("Enter the input");
		  Scanner sc=new Scanner(System.in);
		  String content=sc.nextLine();
		  writer.write(content);;
	  }
	  catch(Exception e) {
		  System.out.println("Error");
	  }
      try(BufferedReader reader=new BufferedReader(new FileReader(filepath));) {
		 String line;
		 while(((line=reader.readLine())!=null)) {
			 System.out.println(line);
		 }
	  }
      catch(Exception e) {
    	  System.out.println("Error");
      }
  }
}
