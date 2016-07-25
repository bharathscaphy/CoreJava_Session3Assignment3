import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Max Value to generate Random Number");
		int n=sc.nextInt();
		GetRandom g=new GetRandom();
		g.getRandom(n);
		sc.close();
	}
}
