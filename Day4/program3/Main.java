package Day4.program3;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		 boolean start=true;
		  while(start) {
			  
			System.out.println("\n-------------Select the Card----------------");  
		  System.out.println("1.Payback Card \n2.Membership Card \n3.Exit");
		  System.out.println("Enter the Number");
		  Scanner sc=new Scanner(System.in);
		  int choice=sc.nextInt();
		  sc.nextLine();
		  System.out.println("Enter the Card Details");
		  System.out.println("Enter the Card Holder Name");
		  String name=sc.nextLine();	
		  System.out.println("Enter the Card Number");
		  String cardNumber=sc.nextLine();	
		  System.out.println("Enter the Expiry Date in DD/MM/YYYY format");
		  String ExpDate=sc.nextLine();	
		  if(choice==1) {
			  System.out.println("Enter the Points in card");
			  int points=sc.nextInt();	
			  System.out.println("Enter the Amount");
			  int amount=sc.nextInt();
			  
			  Card c=new PaybackCard(name,cardNumber,ExpDate,points,amount);
		  }
		  else if(choice==2) {
			  System.out.println("Enter the Card Rating");
			  int rating=sc.nextInt();
			  Card c=new MembershipCard(name,cardNumber,ExpDate,rating); 
		  }
		  else {
			  start=false;
			  System.out.println("---------Thank you-------------");
		  }
		  }
	}
}
