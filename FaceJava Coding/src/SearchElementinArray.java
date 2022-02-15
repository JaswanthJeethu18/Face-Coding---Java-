import java.util.Scanner;

public class SearchElementinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,found=0;
		int arr[] = new int[n];
		for(i =0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int a = sc.nextInt();
		for( i =0;i<n;i++) {
			if(arr[i]==a) {
				System.out.printf("%d is present in the array",a);
				found =1;
			}
			
		}
		if(found==0){
			System.out.printf("%d is not present in the array",a);
		}	
	}

}
