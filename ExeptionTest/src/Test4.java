import java.io.IOException;

public class Test4 {
	static void second() throws IOException, ArithmeticException{
		//second를 호출한 first에게 예외처리 해달라고 넘긴것.
		System.out.println("second");
		//System.out.print("입력 : ");
		//int data = System.in.read()-48;
		
		int result = 10 / 0;
	}

	static void first() throws IOException, ArithmeticException {
		
		System.out.println("first");
		//너가 하기 싫다면 나도 안할래.
		//나도토스할래.
		//그럼 결국 메인에서 처리.
		second();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//그래서 메인이 해줌.
		try {
			first();
		}
		
		//IOException, ArithmeticException 이렇게 두개 보내면 그냥 부모로 받아주기.
		catch(Exception err) {
			System.out.println("main에서 모두 처리함:" +err);
			
			//어디서 오류가 발생했는지 찾아줌.
			//형식적으로하다보니 달아주긴 하는데, 그러다보면 어디서 에러가 났는지 찾기 힘듬.
			//최소한 이런거라도 달아주는게 좋음.
			err.printStackTrace();
			
		}
	}

}
