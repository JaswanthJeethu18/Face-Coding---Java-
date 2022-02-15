import java.util.Scanner;

/*Hotel Tariff Calculator
Write a program to calculate the hotel tariff. The room rent is 20% high during peak seasons [April-June, November-December].  Note: Use the switch construct.
Input format:

The first input containing an integer which denotes the number of the month

The second input containing the floating point number which denotes the room rent per day

The third input containing an integer which denotes the number of days stayed in the hotel



Output format:

Print the hotel tariff to be paid in floating point with 2 decimal places

Refer the sample output for formatting
float total = (float) (rent * days);
*/
public class HotelTraffic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int months = sc.nextInt();
		float rent = sc.nextInt();
		int days = sc.nextInt();
		float t1 = (float) (rent * days);
		float t2 = (float) (rent * days * 1.2);
		switch (months) {
		case 1:
			System.out.printf("%.2f", t1);
			break;
		case 2:
			System.out.printf("%.2f", t1);
			break;
		case 3:
			System.out.printf("%.2f", t1);
			break;
		case 4:
			System.out.printf("%.2f", t2);
			break;
		case 5:
			System.out.printf("%.2f", t2);
			break;
		case 6:
			System.out.printf("%.2f", t2);
			break;
		case 7:
			System.out.printf("%.2f", t1);
			break;
		case 8:
			System.out.printf("%.2f", t1);
			break;
		case 9:
			System.out.printf("%.2f", t1);
			break;
		case 10:
			System.out.printf("%.2f", t1);
			break;
		case 11:
			System.out.printf("%.2f", t2);
			break;
		case 12:
			System.out.printf("%.2f", t2);
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
