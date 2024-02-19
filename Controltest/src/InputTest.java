import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력 받기
		System.out.print("입력 : ");
		char input = (char)System.in.read();
		System.out.println("입력 받은 값은 " + input + "입니다.");
		
		//엔터키를 건너뛰게 해주는 메서드
		System.in.skip(2);
		
		System.out.print("숫자입력 : ");
		int num = System.in.read();
		System.out.println("입력 받은 값은 " + num + "입니다.");



	}

}
