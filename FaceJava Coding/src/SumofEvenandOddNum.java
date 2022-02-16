import java.util.Scanner;

public class SumofEvenandOddNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, sume = 0, sumo = 0;
		int a[] = new int[n]; // declaration of array
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				sume = sume + a[i];
			}
			if (a[i] % 2 != 0) {
				sumo = sumo + a[i];
			}

		}
		System.out.printf("The sum of the even numbers in the array is %d\n", sume);
		System.out.printf("The sum of the odd numbers in the array is %d", sumo);
	}

}
