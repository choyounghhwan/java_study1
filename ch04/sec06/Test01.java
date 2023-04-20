package ch04.sec06;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) { 
		
		int count = 0;
		String id = "ezen";
		String password = "12345";
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이디를 입략해주세요");
		String put_id = scanner.nextLine();
		
		if(!put_id.equals(id)) {
			System.out.print("아이디 정보가 일치하지 않습니다.");
		}
	
		else {
			while(true) {
				
				System.out.print("비밀번호를 입력해주세요");
				String put_password = scanner.nextLine();
			
				if(!put_id.equals(password)) {
					count++;
					System.out.println("비밀번호 정보가 일치하지 않습니다.");
				}
				
				else {
					System.out.println("OK");
					break;
				}
				
				if (count ==3) { 
					System.out.println("Get OUT!");
				break;
				
				}
				
			}
		}
		
		
	}
		
		
	}
	
		      
			