package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class jcopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin 
		= new FileInputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\A.txt");
	
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
