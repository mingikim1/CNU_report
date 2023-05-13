package CNU_report;

import java.util.Scanner;

public class FiboTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		sc.close();
		
		Fibo fibbo1 = new Fibo(i1);
		fibbo1.print();
	}
}

class Fibo {
	int num;
	int sn1;
	int sn2;
	
	Fibo(int num) {
		sn1 = 1;
		sn2 = 1;
		this.num = num;
	}
	
	int rec(int num) {
		int result = 0;
		if ((num == 1) || (num == 2)) {
			result = 1;
			return result;
		}
		else {
			result =  rec(num-1) + rec(num-2);
			return result;
		}
	}	
	void print() {
		System.out.println(rec(num));
	}
}
