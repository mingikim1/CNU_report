package CNU_report;

import java.util.Scanner;

public class Pibo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("출력할 피보나치 수열의 항의 개수는? : ");
		
		int num = sc.nextInt();
		
		int n1 = 1;
		int n2 = 1;
		
		String blank = " ";
		
		if (num == 1) {
			System.out.println(n1);
		}
		else if (num == 2) {
			System.out.println(n1 + blank + n2);
		}
		else {
			System.out.print(n1 + blank + n2);
			for (int i = 1 ; i <= num-2 ; i++) {
				int k = n1 + n2;
				n1 = n2;
				n2 = k;
				System.out.print(blank + k);
			}
		}
		
		
		
	}

}

