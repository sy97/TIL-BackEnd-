package bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest3 {

	public static void main(String[] args) throws IOException {
		// TODO 기본 데이터타입 입출력, DataInputStream, DataOutputStream
		// 쟤들은 filterInputStream, FilterOutputStream의 부모, wrapper같이 포장하는 기능인데, 
		// 얘네는 클래스가 가진 기능을 더 확장시켜줌. wrapper는 객체가아닌걸 객체로만들어주고, 얘네는 객체인것들을 도와주는것.
		// bytestream은 byte를 읽어오기 때문에 int형 입력하려면 네개로 쪼개서 가져옴. 그래서 그걸 한번에 처리가능하게 만들어놓은것.
		
		FileOutputStream fout 
			= new FileOutputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\Data.txt");
	
		DataOutputStream dout = new DataOutputStream(fout);
		
		//부모 도움 안받는다면
		//fout.write('가');
		//fout.write(100);
		//fout.write(3.14);
		//fout.write(true);
		//어차피 저장못해서 에러남.
		
		
		dout.writeChar('가');
		dout.writeInt(100);
		dout.writeDouble(3.14);
		dout.writeBoolean(true);
		//근데 저장은 암호처럼 되어있음. 바이트로 쪼개져서 저장된것이기 때문. 2진수로 저장됨
		//그럼 불러왔을때 잘 보이면 잘 저장된것을 알 수 있음.
		dout.close();
		fout.close();
		
		//FileInputStream fin 
		//= new FileInputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\Data.txt");
		//이렇게 주소저장하는 이유(객체생성하는)는 다른데서도 쓰려고 하는건데, 여기서 한번만 쓰려면 굳이 주소를 저장해야하나?
		//그냥 이거 자체를 넘겨주면됨. 그럼 fin.close는 안해줘도됨.
		
		DataInputStream din = new DataInputStream(
				new FileInputStream("C:\\fullstack\\Backend\\JAVAwork\\FileTest\\Data.txt")
				);
		
		System.out.println(din.readChar());
		System.out.println(din.readInt());
		System.out.println(din.readDouble());
		System.out.println(din.readBoolean());
		//아까 저장한 형식대로 불러오기.
		//그럼 잘 불러와짐. 
		
		din.close();
	
	}

}
