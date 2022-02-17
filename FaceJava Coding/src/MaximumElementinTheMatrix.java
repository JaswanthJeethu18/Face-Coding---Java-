import java.util.Scanner;

public class MaximumElementinTheMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int maxnum = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (maxnum < arr[i][j]) {
					maxnum = arr[i][j];
				}
			}
		}
		System.out.println(maxnum);
	}

}
