package Day8.program4;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
  public static void main(String args[]) {
	  String filepath="D:\\java.txt";
      try(BufferedReader reader=new BufferedReader(new FileReader(filepath));) {
		 String line=reader.readLine();
		 System.out.println(line);
		 int count=1;
		 while(((line=reader.readLine())!=null)&&count<2) {
			 System.out.println(line);
			 count++;
		 }
	  }
      catch(Exception e) {
    	  System.out.println("Error");
      }
  }
}
