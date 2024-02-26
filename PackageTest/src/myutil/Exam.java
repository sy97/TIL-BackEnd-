package myutil;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exam {

	public static void main(String[] args) {
		// TODO 예제
		//문자열부리
		String str3 = "javaTM 언어 사양 제2판 : James Gosling, Bill Joy,"+
		"Guy Steele, Gilad Bracha : 무라카미 마사아키 : " +
		"피어슨 에듀케이션 : 2000 : 5500";
		
		StringTokenizer token = new StringTokenizer(str3, ":,");
		String[] arr = new String[9];
		int idx = 0;
		while(token.hasMoreTokens()) {
			arr[idx] = token.nextToken().trim();
			idx++;
		}
		System.out.println("책 이름 :" + arr[0]);
		System.out.println("저자 :");
		System.out.println("\t"+arr[1]);
		System.out.println("\t"+arr[2]);
		System.out.println("\t"+arr[3]);
		System.out.println("\t" +arr[4]);
		System.out.println("역자 :" + arr[5]);
		System.out.println("출판사 :" + arr[6]);
		System.out.println("출판연도 :" + arr[7]);
		System.out.println("가격 :"+arr[8]);
	
		
		System.out.println("-----------------------------------");
		//가위바위보
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
			
		int game = r.nextInt(3);
		System.out.println(game);
			
		String input = sc.next();
		int user;
		if(input == "가위") {
			user = 0;
		}
		else if(input == "바위") {
			user = 1;
		}
		else if(input == "보") {
			user = 2;
		}
		
		
		//중복 없이 로또번호
		//배열 45개를 담아서 번호를 담고, 이미 선택된 번호는 삭제?
		int[] lottonums = new int[45];
		for(int i = 0; i<lottonums.length; i++) {
			lottonums[i] = r.nextInt(44)+1;
			
		}
		int[] lotto = new int[6];
		for(int i = 0; i<lotto.length; i++) {
			
		}
	}
		

}


