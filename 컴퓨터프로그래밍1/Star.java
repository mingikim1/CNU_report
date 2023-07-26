package CNU_report;

public class Star {

	public static void main(String[] args) {
		
		String star = "*";
		String blank = " ";
		
		
		for (int i = 1 ; i <= 7 ; i++) {
			String result = "";
			for (int j = 1 ; j <= 7 - i ; j++) {
				result += blank;				
			}
			for (int k = 1 ; k <= 2*i - 1 ; k++) {
				result += star;			
			}
			System.out.println(result);
		}

		
		for (int i = 1 ; i <= 6 ; i++) {
			String result = "";
			for (int j = 1 ; j <= i ; j++) {
				result += blank;
			}
			for (int k = 1 ; k <= -2*i + 13 ; k++) {
				result += star;
			}
			System.out.println(result);
		}
		

	}

}
