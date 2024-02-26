package myutil;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO 스캐너테스트
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		
		
	}

}

/*
 *1 가위 바위 보 게임
 *사용자 : 가위
 *결과 : 사용자 승리 
 *
 * 
 * 2. 로또 추출기(절대 중복된 숫자가 나오지 않게 한다)
 * 
 */
