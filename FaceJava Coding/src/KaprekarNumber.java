/*
 * Consider an n-digit number k. Square it and add the right n digits to the left n or n-1 digits. 
 * If the resultant sum is k, then k is called a Kaprekar number. 
 * For example, 9 is a Kaprekar number since 92 = 81 & 8+1=9. and 297 is a Kaprekar number since 2972 = 88209 & 88+209 = 297
Input Format:
Input consists of a single integer.
 */
import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int p = 0;
		int digit = 0, squ, sum = 0;
		squ = num * num;
		p = squ;
		while (squ > 0) {
			digit++;
			squ = squ / 10;
		}
		int k = (int) (Math.pow(10, (digit / 2)));
		while (p > 0) {
			sum = sum + (p % k);
			p = p / k;
		}
		if (sum == num)
			System.out.println("Kaprekar Number");
		else
			System.out.println("Not a Kaprekar Number");
	}

}
