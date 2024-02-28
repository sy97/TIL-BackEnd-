package bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		// TODO 파일로부터 입력받아 콘솔로 출력
		
		FileInputStream fin 
			= new FileInputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\test.txt");
		//파일위치\\파일명 넣어주기.
		//클래스니까 객체생성 해야되고, 도큐먼트 참고해서 3번째 방법.
		//아스키 코드니까 잘나오지만, 한글은 깨져서 나옴.
		
		while(true) {
			int input = fin.read();
			//키보드로 입력받고있던 장치만 바꿔주면됨.
			
			if(input == -1) {
				break;
			}
		
			System.out.write((char)input);
			//한글이 안나오는 이유는, 이 메서드는 조립기능이 없기때문.
			//write로 바꿔주면 나옴.
		}
		fin.close();
		//외부에서 파일을 가져올때는 항상 이걸 써주기.
	}
}
