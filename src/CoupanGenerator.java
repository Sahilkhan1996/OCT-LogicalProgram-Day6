
public class CoupanGenerator {

	int[] coupan;

	public CoupanGenerator(int numOfCoupan) {
		coupan = new int[numOfCoupan];
	}

	public void generateCoupan() {
		for (int i = 0; i < coupan.length; i++) {
			int randomNum = (int) (Math.random() * 100 + 101);
			while (checkNum(randomNum)) {
				randomNum = (int) (Math.random() * 100 + 101);
			}
			coupan[i] = randomNum;
		}
	}

	private boolean checkNum(int randomNum) {
		for (int i = 0; i < coupan.length; i++) {
			if (coupan[i] == randomNum) {
				return true;
			}
		}
		return false;
	}

	public void printCoupan() {
		for (int i = 0; i < coupan.length; i++) {
			System.out.println(coupan[i]);
		}
	}

	public static void main(String[] args) {
		CoupanGenerator c = new CoupanGenerator(100);
		c.generateCoupan();
		c.printCoupan();
	}
}
