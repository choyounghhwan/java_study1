package ch03.sec11;

import java.util.Scanner;

public class Conditional0perationExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	
		System.out.println("등급은 F입니다.");
	
	
		int score = 85;
		
	    // 조건문을 if문으로 짜볼 것
		
		char grade = (score > 90)? 'A' : ( (score > 80) ? 'B' : 'c');
		System.out.println(score + "점은 "+ grade + "등급입니다.");
		
	
		
		
	}

}
