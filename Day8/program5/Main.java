package Day8.program5;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
  public static void main(String args[]) {
	  String filepath="D:\\java.txt";
	  String lengthyword="";
	  try(BufferedReader reader=new BufferedReader(new FileReader(filepath));) {
		 String line;
		 while(((line=reader.readLine())!=null)) {
			 String[] words=line.split(" ");
			 for(String word:words) {
				 if(word.length()>lengthyword.length()){
					 lengthyword=word;
				 }
			 }
		 }
		 if(lengthyword.isEmpty()) {
			 System.out.println("File is Empty");
		 }
		 else {
		 System.out.println(lengthyword);
		 }
		}
      catch(Exception e) {
    	  System.out.println("Error");
      }
  }
}
