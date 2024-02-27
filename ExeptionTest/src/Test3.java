import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("입력 : ");
		
		/*
		키보드를 딱 하나만 읽어오는 메서드
		 
		얘를 사용하려면 예외처리를 해줘야함.
		입력을 받을 때는 잘못된 데이터가 들어올 수 있어서 굉장히 민감하므로.
		자바에서는 무조건 예외처리를 해야함. 
		char input=' ';
		try {
			input = (char)System.in.read();
		}
		
		catch(IOException e) {
			
		}
		System.out.println("입력 받은 값은 " + input + "입니다.");
		
		*/
		
		//하지만 당연히 해줘야하는 것들이기 때문에 위에처럼 하는거너무 귀찮음.
		//그럴 때 나를 호출한 부모가 대신 처리하게끔 넘겨버림.
		//main을 호출한게 시스템이니까 시스템에게 넘긴거.
		//throws IOException
		char input = (char)System.in.read();
		System.out.println("입력 받은 값은 " + input + "입니다.");
	}

}
