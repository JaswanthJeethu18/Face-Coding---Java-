import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		int x, y;
		float z;
		double pi = 3.14;

		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		float d = obj.nextFloat();

		x = a * a;
		y = b * c;
		z = (float) (3.14 * d * d);
		System.out.println(x);
	}

}
