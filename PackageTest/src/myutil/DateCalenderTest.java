package myutil;

import java.util.Date;
import java.util.Calendar;

public class DateCalenderTest {
public static void main(String[] args) {
	// TODO datecalendar
	
	Date today=new Date();
	//기본적으로 오늘 날짜를 가져옴
	System.out.println(today);
	//today.toString(); 원래는 이렇게인데 생략되어있는거.
	
	//calendar는 이렇게 객체생성
	Calendar cal = Calendar.getInstance();
	//싱글톤도 이렇게함. 인스턴스를 만들 수 없게하는거.
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH);
	int date = cal.get(Calendar.DATE);
	int hour = cal.get(Calendar.HOUR);
	int min = cal.get(Calendar.MINUTE);
	System.out.println("오늘 날짜는 "+year+"년 "+month+"월 "+date+"일 "+hour+"시 "+min+"분입니다.");
	}
}