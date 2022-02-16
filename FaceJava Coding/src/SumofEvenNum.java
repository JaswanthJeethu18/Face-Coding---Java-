import java.util.Scanner;

public class SumofEvenNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, sum = 0;
		int a[] = new int[n]; // declaration of array
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				sum = sum + a[i];
			}
		}
		System.out.printf("The sum of the even numbers in the array is %d", sum);

	}

}