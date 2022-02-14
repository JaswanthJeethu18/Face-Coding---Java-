import java.util.Scanner;

public class Alice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int AL = ((a % 10) + (a / 10));
		System.out.println("Alice must go in path-" + AL + "");

	}

}
