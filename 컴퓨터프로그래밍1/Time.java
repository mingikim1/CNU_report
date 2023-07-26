package CNU_report;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("변환할 초 입력 : ");
		
		int time = sc.nextInt();
				
		System.out.print(time + "초는 " + time/(60*60) + "시간 " + (time%(60*60))/60 + "분 " + (time%(60*60))%60 + "초 입니다.");

	}

}
