import java.util.Scanner;


// Program to measure elapsed time in Java
class StopWatch {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Press any number to Start the StopWatch");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println(+count + " is the entered to start the stopWatch ");
		long startTime = System.nanoTime();

		System.out.println("Press any number to Stop the StopWatch");
		Scanner sc1 = new Scanner(System.in);
		int count1 = sc1.nextInt();
		System.out.println(+count1 + " is the entered to start the stopWatch ");

		long endTime = System.nanoTime();

		
		long timeElapsed = endTime - startTime;

		System.out.println("Execution time in nanoseconds: " + timeElapsed);
		System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
		sc.close();
		sc1.close();
	}
}