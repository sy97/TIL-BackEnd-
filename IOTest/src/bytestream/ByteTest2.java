package bytestream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteTest2 {
	public static void main(String[] args) throws IOException {
		//IO패키지 안에 있는거니까, IOException

		// 내가 원하는만큼 입력받기
		
		/*
		while(true) {
			int input = System.in.read();
			
			if(input == -1) {
				break;
			}
			//직접 -1을 입력하는게 아님. -1을 입력하는건 키 두번입력하는거임.
			//-1은 이미 정의가되어있음. 어떤 특정한 키값으로 정의가되어있음. 그 키값은 ctrl+z.
			
			System.out.print((char)input);
		}
		*/
		
		//더 간단하게
		/*
		int input;
		while((input = System.in.read())!= -1) {
			System.out.print((char)input);
		}
		*/
		StreamTest(System.in, System.out);
		//키보드로 입력받는 장치 넘겨주기.
		//이 장치로부터 입력받은걸 메서드에서 처리해주게끔.
	}
	
	static void StreamTest(InputStream in, OutputStream out) throws IOException {
		//그럼 여기는 어떤 매개변수로 해줘야할까?
		//System.in,out은 주소인데 그걸 받아주는 클래스는 없으니까, 모든 입출력 자식을 받아즐 수 있는 부모클래스로 받아주면됨.
		//어떤 입력장치든간에 부모는 받을 수 있음.
		int input;
		while((input = in.read())!= -1) {
			//예외처리해줘야함. 입력받는거니까. 입력은 깐깐하게. 메인메서드로 넘겨버리자 
			out.write((char)input);
			/*
			out이 가지고있는 주소는 모니터. 그래서 화면으로 출력되는것. 
			outputstream에는 print라는 메서드가 없어서 쓸수가없음.
			outputstream에 있는 메서드로 받아줘야함.-> write.
			write는 쪼개진 바이트를 조립하는 기능이 있기 때문에, 한글로 해도 깨지지 않음. 
			*/
		}
	}

}
