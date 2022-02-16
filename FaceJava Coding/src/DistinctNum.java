import java.util.Scanner;

public class DistinctNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0, i, j;
		int a[] = new int[n]; // declaration of array
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (i = 0; i < n; i++) {
			int flag = 0;
			for (j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				if (a[i] == a[j] && i > j) {
					flag = 1;
				}

			}
			if (flag == 0) {
				c++;
			}
		}
		System.out.println(c);
	}

}
