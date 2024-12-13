package Day8.program6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) throws IOException {
	  String filepath="D:\\player.csv";
	  File file=new File(filepath);
	  if(file.createNewFile()) {
		  System.out.println("File create Successfully");
	  }
	  else {
		  System.out.println("File Already Exist");
	  }
	  System.out.println("Enter the player name");
	  Scanner sc=new Scanner(System.in);
	  String name=sc.nextLine();
	  System.out.println("Enter the Team name");
	  String teamName=sc.nextLine();
	  System.out.println("Enter the number of matches played");
      int numberofMatches=sc.nextInt();
      try(OutputStream out=new FileOutputStream(file,true)) {
				if(file.length()==0) {
					String header="Player Name,Team Name,Number of Matches\n";
					out.write(header.getBytes());
				}
				String playerData=name+","+teamName+","+numberofMatches+"\n";
				out.write(playerData.getBytes());
				System.out.println("Player Imformation has been writtten to the file");
	} catch (Exception e) {
		System.out.println("Error");
	}
  }
}
