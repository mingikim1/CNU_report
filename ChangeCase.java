package CNU_report;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("문자를 입력하세요 : ");
		
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("입력값 : " + ch);
		
		char result = (ch >= 65 && ch <= 90) ? (char) (ch + 32) : ((ch >= 97 && ch <= 122) ? (char) (ch - 32) : ch);
		
		System.out.println("변환값 : " + result);
				
	}

}
