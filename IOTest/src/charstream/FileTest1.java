package charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		// TODO 파일로부터 입력받아 콘솔로 출력
		
		//바이트로 읽은 파일을 굳이 문자열로 바꾸지말고 바로 바이트파일을 문자로 읽어오는것. filereader
		
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\test.txt"));
		
		while(true) {
			String input = br.readLine();
			//키보드로 입력받고있던 장치만 바꿔주면됨.
			
			if(input==null) {
				break;
			}
		
			System.out.println(input);
			//버퍼리더로 포장해줬기 때문에 문자열이므로 println으로 해도 잘 출력됨.
		}
		br.close();
		//외부에서 파일을 가져올때는 항상 이걸 써주기.
	}
}
