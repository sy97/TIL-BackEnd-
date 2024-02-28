package charstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CharTest1 {

	public static void main(String[] args) throws IOException {
	
		StreamTest(System.in);
	
	}
	
	static void StreamTest(InputStream a) throws IOException {
		//기계장치를 받을수있는건 bytestream이기 떄문에 inputstream 클래스로 바꾼것.
		//a라는 변수자체는 바이트스트림. 이걸 문자스트림으로 바꿀 수 있는 클래스가 있음. 
		//바이트스트림 -> 문자스트림 으로 바꿔주는 클래스
		InputStreamReader isr = new InputStreamReader(a);
		
		int input;
		while((input = isr.read())!= -1) {
	
			System.out.print((char)input);
			//출력장치 system.out.print는 조립기능 없어서 한글치면 쪼개짐.
			//inputstreamreader해주고 나니 한글로도 됨.
			
		
		}
	}

}
