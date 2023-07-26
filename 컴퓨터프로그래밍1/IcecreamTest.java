package CNU_report;

import java.util.*;

public class IcecreamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 아이스크림 대문자 받기
		String ic = sc.nextLine();
		
		 // 아이스크림 대문자를 공백을 기준으로 배열에 넣기
		String [] ic_arr = ic.split(" ");
		
		Buyer b = new Buyer(10000 , 0);
		
		// 아이스크림 인스턴스 각각 생성
		Jawsbar J = new Jawsbar();
		Merona M = new Merona();
		Seoju S = new Seoju();
		Tankboy T = new Tankboy();
		Worldcone W = new Worldcone();
		Icecream O = new Icecream();
		
		// 아이스크림 대문자 각각 클래스 가리키기
		for (int i = 0 ; i < ic_arr.length ; i++) {
			if (ic_arr[i].equals("J")) {
				b.buy(J);
			}
			else if (ic_arr[i].equals("M")) {
				b.buy(M);
			}
			else if (ic_arr[i].equals("S")) {
				b.buy(S);
			}
			else if (ic_arr[i].equals("T")) {
				b.buy(T);
			}
			else if (ic_arr[i].equals("W")) {
				b.buy(W);
			}
			else {
				b.buy(O);
			}
		}	
		b.summary();
	}
}


class Icecream {
	
	// 명시되지 않은 아이스크림 가격 1000원으로 초기화
	int price = 1000;
	int bonusPoint;
	
	Icecream() {}
	
	Icecream(int price) {
		this.price = price;
		
		if (this.price > 1000) {
			this.bonusPoint += (this.price - 1000)/10;
		}
		
		}
	
	public String toString() {
		return "Others";
	}
}

class Jawsbar extends Icecream {
	
	Jawsbar() {
		super(1200);
	}
	public String toString() {
		return "Jawsbar";
	}
}

class Merona extends Icecream {
	
	Merona() {
		super(1000);
	}
	public String toString() {
		return "Merona";
	}
}

class Seoju extends Icecream {
	
	Seoju() {
		super(800);
	}
	public String toString() {
		return "Seoju";
	}
}

class Tankboy extends Icecream {
	
	Tankboy() {
		super(1500);
	}
	public String toString() {
		return "Tankboy";
	}
}

class Worldcone extends Icecream {
	
	Worldcone() {
		super(2000);
	}
	public String toString() {
		return "Worldcone";
	}
}

class Buyer {
	int money;
	int bonusPoint;
	
	 // 아이스크림 총액을 구하기 위한 변수
	int p = 0;
	
	Vector icecreamList = new Vector();
	
	Buyer(int money , int bonusPoint) {
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	void buy(Icecream icecream) {
		
		if (icecream.price > this.money) {
			System.out.println("잔액이 충분하지 않습니다: " + icecream);
		}
		else {
			this.p += icecream.price;
			this.money -= icecream.price;
			this.bonusPoint += icecream.bonusPoint;
			icecreamList.add(icecream);
		}
	}
	void summary() {
		System.out.println("아이스크림 총액 : " + this.p);
		System.out.println("고객 잔액 : " + this.money);
		System.out.println("적립된 포인트 : " + this.bonusPoint);
		System.out.println("구매한 아이스크림 목록 : " + icecreamList);
	}
	
}

































