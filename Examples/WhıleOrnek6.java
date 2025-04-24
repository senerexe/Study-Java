package a;

import java.util.Scanner;

public class WhıleOrnek6 {

	public static void main(String[] args) {
		// YILDIZLAR İLE ÜÇGEN YAPMA
		
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int y = scan.nextInt();
		while(i<=y) {
			int k = 1;
			while(k<=i) {
			System.out.print("*");
			k++;
		}
		System.out.println();
		i++;

	}

}
}
