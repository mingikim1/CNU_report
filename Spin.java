package CNU_report;

import java.util.Arrays;

import java.util.Scanner;

public class Spin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String input = sc.nextLine();
			
		String [] inputArr = input.split(" ");
		
		String [][] star = new String [inputArr.length][];
		
		for (int i = 0 ; i < inputArr.length ; i++) {
			star[i] = inputArr[i].split("");
		}
		
		int [] counter = new int [inputArr.length];
		
		for (int i = 0 ; i < inputArr.length ; i++) {
			counter[i] = star[i].length;
		}
				
		for (int i = 0 ; i < inputArr.length-1 ; i++) {
			if (counter[i] > counter[i+1]) {
				int tmp = counter[i+1];
				counter[i+1] = counter[i];
				counter[i] = tmp;
			}
		}
		
		int max = counter[inputArr.length-1];
		
		String [][] real_star = new String [inputArr.length][max];
		
		for (int i = 0 ; i < inputArr.length ; i++) {
			for (int j = 0 ; j < max ; j++) {
				if (star[i].length == max) {
					real_star[i][j] = star[i][j];
				}
				else {
					for (int k = 0 ; k < star[i].length ; k++) {
						real_star[i][k] = star[i][k];
					}
					for (int l = star[i].length ; l < max ; l++) {
						real_star[i][l] = " ";
					}
				}
			}
		}
				
		String [][] result = new String[max][inputArr.length];
		
		for (int i = 0 ; i < inputArr.length ; i++) {
				for (int j = 0 ; j < max ; j++) {
					result[j][i] = real_star[i][max-1-j];
				}			
		}
		
		for (int i = 0 ; i < max ; i++) {
			for (int j = 0 ; j < inputArr.length ; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}
