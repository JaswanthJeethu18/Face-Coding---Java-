import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum = sum + a[i][j];
			}
		}
		System.out.println(sum);
	}

}
