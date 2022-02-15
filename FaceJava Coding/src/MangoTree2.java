import java.util.Scanner;

public class MangoTree2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int c = sc.nextInt();
		if (c % rows == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
