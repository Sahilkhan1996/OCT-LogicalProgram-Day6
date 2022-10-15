import java.util.Scanner;

class PerfectNumberChecker {
	public static void main(String[] args) {
		long n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check the Perfect Number: ");
		n = sc.nextLong();
		int i = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (sum == n) {
			System.out.println(n + " is aperfect number");
		} else
			System.out.println(n + " is not a perfect number");
		sc.close();
	}

}
