package Day4.program2;

import java.util.Scanner;

class MyCalculator implements AdvanceArithmetic {

	public MyCalculator() {
		System.out.println("I Implemented: AdvanceArithmetic Interface");
	}

	@Override
	public int divisor_sum(int n) {
		int sum=1,i=2;
		while(i<=n) {
			if(n%i==0) {
				sum+=i;
			}
			i++;
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		MyCalculator m=new MyCalculator();
		System.out.println(m.divisor_sum(number));
	}
}
