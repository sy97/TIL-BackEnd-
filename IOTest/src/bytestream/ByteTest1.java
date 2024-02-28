package bytestream;

import java.io.IOException;

public class ByteTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] bArr = new byte[10];
		
		System.out.print("문자 입력 : ");
		System.in.read(bArr); 
		//인자값으로 이렇게 넘겨주면 10개까지 입력 받을 수 있게됨.
		//우리가 어떤 장치라고 언급 안하면 in은 키보드로부터 입력. 아스키코드값으로 입력받음.=bytestream방식
		//bytestream이니까 한글을 입력하면안됨.
		
		System.out.println("입력한 값 : " + bArr);
		for(byte b : bArr) {
			System.out.print((char)b);
		}
	}

}
