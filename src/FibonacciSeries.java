import java.util.Scanner;

class FibonacciSeries {
	public static void main(String args[]) {
		int a = (int) (Math.random() * 3);
		System.out.println(a);
		System.out.println("Enter the number up to which you want to check Fibonacci Series: ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		long n1 = 0, n2 = 1, n3, i;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)// loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		sc.close();
	}
}