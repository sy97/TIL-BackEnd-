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
		String comp = null;
		if(game == 0) {
			comp = "가위";
		}
		else if(game == 1) {
			comp = "바위";
		}
		else if(game == 2) {
			comp = "보";
		}
		
		System.out.print("가위바위보 게임! 가위,바위,보 중 하나를 입력하세요.:");
		String input = sc.next();
		
		//비겼을때
		if(input.equals(comp)) {
			System.out.println("비겼습니다.");
		}
		//이기는 경우
		else if((input.equals("가위")&&comp.equals("보")) ||
				(input.equals("바위")&&comp.equals("가위")) ||
				(input.equals("보")&&comp.equals("주먹"))) {
			System.out.println("이겼습니다.");
		}
		else
			System.out.println("졌습니다.");
		
		System.out.println("컴퓨터가 낸 것 :" + comp);
		
		System.out.println("--------------------------------------");
		
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


