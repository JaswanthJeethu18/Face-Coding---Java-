import java.util.Scanner;

public class ProfitCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p = ((x * a) - (x * b)) - 100;
		System.out.println("The profit obtained is Rs." + p + "");

	}

}
