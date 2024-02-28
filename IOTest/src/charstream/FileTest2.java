package charstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest2 {

	public static void main(String[] args) throws IOException {
		// TODO 키보드로부터 입력받아 파일로 저장
		
		FileWriter fw =
				new FileWriter("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\chartest.txt");
	
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		//system.in을 문자스트림으로 바꿔주고, 한줄로 읽어올 수 있도록 bufferedreader로 감싸주기
		
		while(true) {
			String input = br.readLine();
			
			if(input == null) {
				break;
			}
		
			fw.write(input);
			fw.flush();
			
		}
		fw.close();
		//까먹지말기.

	}

}

//java jcopy a.txt b.txt 파일로부터 입력받아서 파일로부터 출력하는 프로그램

