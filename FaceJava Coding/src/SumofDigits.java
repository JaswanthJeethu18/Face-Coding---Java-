import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = sumofdigits(num);
		System.out.println("The sum of the digits in " + num + " is " + res);
	}

	static int sumofdigits(int n) {
		if (n == 0)
			return 0;
		return (n % 10 + sumofdigits(n / 10));
	}

}
