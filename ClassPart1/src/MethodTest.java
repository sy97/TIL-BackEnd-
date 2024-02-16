class UI {
	void line(int cnt, char type) { //void = 반환형이 없다. 반환형이 있으면 반환형의 데이터타입으로 써주면됨.
		for(int i = 0; i < cnt; i++) {
		System.out.print(type);
		}
		System.out.println();
	}
}
	
public class MethodTest {
	/*
	void sum(int num1, int num2) {
		int num3 = num1 + num2;
		System.out.println("결과 : "+num3);	
	}
	*/
	
	//위처럼 여기서 마무리 짓지말고, 내가 마무리 짓겠다. 
	int sum(int num1, int num2) {
		int num3 = num1 + num2;
		//System.out.println("결과 : "+num3);
		//여기서 마무리 짓지말고, 내가 마무리 짓겠다. 
		return num3;
	}	
	
	public static void main(String[] args) {
		// TODO 메서드 작성 방법과 사용법
	/*-----------------반환값이 없는 경우----------------------*/
		UI ui = new UI();
		ui.line(10, '*');
		System.out.println("채팅프로그램");
		ui.line(10, '-');
		System.out.println("1. 방만들기");
		System.out.println("2. 나가기");
		ui.line(10, '=');
		
	
	/*-----------------반환값이 있는 경우----------------------*/
		
		int num1 = 7, num2 = 5;
		System.out.println("두 수의 합계");
		
		//methodtest 메서드 안에 있는 메서드니까 이렇게 호출
		MethodTest mt = new MethodTest();
		int num3 = mt.sum(num1, num2);//위의 메서드에서 받은 num3값 저장할 변수.
		System.out.println("결과 : "+num3);
	}
}


