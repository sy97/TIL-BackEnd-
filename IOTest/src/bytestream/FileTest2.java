package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력받아 파일로 저장
		
		FileOutputStream fout =
				new FileOutputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\out.txt", true);
		//이 경로의 이 파일이 메모리로 올라오게되니까 그 메모리의 주소값 저장 
		//FileOutputStream(String 어느파일, boolean append(덮어쓰기(false)할건지, 추가(true)만할건지.기본은 false.))
		//out.txt파일 안만들었는데, 출력은 우리가 파일 따로 만들지않아도됨.
		
		while(true) {
			int input = System.in.read();
			
			if(input == -1) {
				break;
			}
		
			fout.write((char)input);
			
			
		}
		fout.close();
		//까먹지말기.

	}

}

//java jcopy a.txt b.txt 파일로부터 입력받아서 파일로부터 출력하는 프로그램

