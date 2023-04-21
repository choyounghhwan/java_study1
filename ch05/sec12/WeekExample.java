package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		// Week 열거 타입 변수 선언 
		Week today = null;
		
		//Calendar 열기
		Calendar cal = Calendar.getInstance();	
		
		// 오늘의 요일 열기 (1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch (week) { 
		   case 1:  today = Week.SUNDAY; break;
		   case 2:  today = Week.MONDAY; break;
		   case 3:  today = Week.THERSDAY; break;
		   case 4:  today = Week.WEDNEDAY; break;
		   case 5:  today = Week.THERSDAY; break;
		   case 6:  today = Week.FRIDAY;   break;
		   case 7:  today = Week.SATURDAY;		
	     }
		// 열거 타입 변수를 사용 
		if(today == Week.SUNDAY) { 
			System.out.println("일요일에 축구를 합니다.");
		}   else {
				System.out.println("열심히 자바 공부를 합니다.");
		    }
	 }

}