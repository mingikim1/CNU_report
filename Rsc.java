package CNU_report;

import java.util.Scanner;

public class Rsc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("가위/바위/보 중 하나를 입력하세요 : ");
		
		String rsp = sc.nextLine();
		
		System.out.println("Player : " + rsp);
		
		int num = (int)(Math.random()*10)+1;
		
		switch (num) {
			case 1:
			case 4:
			case 7:
				System.out.println("Computer : 가위");
				
				switch (rsp) {
					case "가위":
						System.out.println("비겼습니다.");
						break;
					case "바위":
						System.out.println("Player가 이겼습니다!");
						break;
					case "보":
						System.out.println("Player가 졌습니다.");
				}
				break;
			case 2:
			case 5:
			case 8:
				System.out.println("Computer : 바위");
				
				switch (rsp) {
					case "가위":
						System.out.println("Player가 졌습니다.");
						break;
					case "바위":
						System.out.println("비겼습니다.");
						break;
					case "보":
						System.out.println("Player가 이겼습니다!");
				}
				break;
			case 3:
			case 6:
			case 9:
				System.out.println("Computer : 보");
				
				switch (rsp) {
					case "가위":
						System.out.println("Player가 이겼습니다!");
						break;
					case "바위":
						System.out.println("Player가 졌습니다.");
						break;
					case "보":
						System.out.println("비겼습니다.");
				}

		}
	}
}