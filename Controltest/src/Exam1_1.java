import java.io.IOException;

public class Exam1_1 {

	public static void main(String[] args) throws IOException {
		/*
		 * 1. 데이터를 입력받아서 문자인지 아닌지를 판별하는 프로그램
		 * 단, 문자인 경우 대문자와 소문자로 구별해서 출력하시오. 
		 */
			System.out.print("입력 : ");
			char input = (char)System.in.read();
			if(input>='A' && input<='Z') {
				System.out.println("대문자입니다.");
			}
			else if(input>='a' && input<='z') {
				System.out.println("소문자입니다.");
			}
			else
				System.out.println("문자가 아닙니다.");
			
	}

}
