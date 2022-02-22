import java.util.Scanner;

public class NumberofDigits {

	public static void main(String[] args) {
		int m, n, count = -0;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		int a = m;
		while (m != 0) {
			m /= 10;
			count++;
		}
		System.out.println("The number of digits in " + a + " is " + count);

	}

}
