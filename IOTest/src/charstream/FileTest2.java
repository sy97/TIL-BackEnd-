package charstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileTest2 {

	public static void main(String[] args){
		// TODO 키보드로부터 입력받아 파일 만들기. 문자열로. 
		FileWriter fw = null;
		BufferedReader br = null;
		try {
				fw = new FileWriter("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\chartest.txt");
	
				br = new BufferedReader(new InputStreamReader(System.in));
		//system.in을 문자스트림으로 바꿔주고, 한줄로 읽어올 수 있도록 bufferedreader로 감싸주기
		
		while(true) {
			String input = br.readLine();
			
			if(input.equals(".")) {
				break;
			}
		
			fw.write(input+"\n");
			//줄바꿈
			fw.flush();
			
			}
		
		}
		
		catch(Exception e) {
			//크게 잡았는데, 이렇게 잡으면 자세히 잡기는 어려움. 자식클래스 사용하는게 좋긴함.
			System.out.println("에러처리완료.");
			System.out.println(e);
		}
		
		finally {
			try {
			fw.close();
			br.close();}
			catch(IOException e) {}
			//여기도 예외처리해줘야함.
			
		}
	
	}

}

//java jcopy a.txt b.txt 파일로부터 입력받아서 파일로부터 출력하는 프로그램

