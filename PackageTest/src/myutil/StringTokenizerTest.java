package myutil;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "홍길동,임꺽정,신돌석,유비";
		
		//문자열 분리
		String[]names = str.split(",");
		for(String n : names) {
			System.out.println(n);
		}

		StringTokenizer token = new StringTokenizer(str, ",");
		System.out.println(token.countTokens());
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		String str2 = "홍길동=임꺽정;신돌석,유비 관우+장비";
		token = new StringTokenizer(str2, "=;, +");
		System.out.println(token.countTokens());
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
	
		System.out.println("---------------------------------");
		String str3 = "javaTM 언어 사양 제2판 : James Gosling, Bill Joy,"+
		"Guy Steele, Gilad Bracha : 무라카미 마사아키 : " +
		"피어슨 에듀케이션 : 2000 : 5500";
		
		/*
		 * 책 이름 : javaTM 언어 사양 제2판
		 * 저자 : 
		 * 		James Gosling
		 * 		Bill Joy
		 * 		Guy Steele
		 * 		Gilad Bracha
		 * 역자 : 무라카미 마사아키
		 * 출판사 : 피어슨 에듀케이션
		 * 출판연도 : 2000
		 * 가격 : 5500
		 * 
		 */
	}

}
