package charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileTest3 {

	public static void main(String[] args) {
		// TODO 성적표 파일로 저장
		try {
		/*PrintWriter pw = new PrintWriter(
				new BufferedWriter(
				new FileWriter("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\sungjuk.txt")));
		//파일로 저장할거고, 한줄씩 입력받을 수 있게끔 버퍼라이터로 한번더포장.*/
		//그리고 한번 더 포장. printwriter.printf 라는 메서드를 쓰기위해.
		//이런게 바로 필터 클래스들. 감싸고감싸서 기능을 확장시켜주기위함.
		//모든 클래스가 다 이렇게되는거아님. 이렇게 만들어져있는 애들만 가능함.
		PrintWriter pw 
			= new PrintWriter("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\sungjuk.txt");
		//프린터라이터는 이미 파일라이터(파일로생성해주는거)와 버퍼라이터(한줄씩읽어주는것)포함하고있어서 이렇게만써도
		//위와같은 효과가 나타남.
		
		pw.println("*******************성적표*******************");
		//바이트스트림과 다르게, 우리가 볼 수 있는 형태로 저장됨.
		//화면에저장되는게 아니라 파일에저장됨.
		pw.println("----------------------------------------------");
		pw.printf("%3s : %5d %5d  %5.1f %n", "홍길동", 98, 67, (float)(98+67)/2);
		pw.printf("%3s : %5d %5d  %5.1f %n", "임꺽정", 88, 77, (float)(88+77)/2);
		pw.printf("%3s : %5d %5d  %5.1f %n", "신돌석", 55, 65, (float)(55+65)/2);
		//모양꾸미기
		//3s: 3는 자릿수,s는 문자열. / 5d: 5개의 정수형. / 5.1f: 정수형은 5자리, 실수형은1자리까지./%n은 줄바꿈.
		//여기서 실수형은 반드시 float으로 해줘야함. 
		
		pw.close();
		}
		catch(IOException e) {}
		

	}

}
