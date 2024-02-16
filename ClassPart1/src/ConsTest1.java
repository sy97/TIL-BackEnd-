class ClassDemo2 {
	int iValue;
	
	/*ClassDemo2() {
		System.out.println("생성자 호출");
	}
	
	모든 클래스이는 이런 생성자메서드가 있는 것. 근데 굳이 생성하지 않아도됨. 
	*/
	ClassDemo2(int i) {
		System.out.println(i);
	}
	//이렇게되면 기본생성자는 사라지기 때문에, 아래에 기본생성자 설계 기반으로 생성한 객체는 에러가남. 
	
	//에러 안날려면 기본 생성자를 만들어줘야함.
	ClassDemo2() {
		
	}
}

public class ConsTest1 {

	public static void main(String[] args) {
		// TODO 생성자 기본 개요
		ClassDemo2 ob1 = new ClassDemo2(); 
		/*이 객체를 만들 때의 설계도가 위의 생성자메서드.
		생성자 메서드는 단 한번만 호출됨. 객체 생성은 단 한번만 됨. 그래서 반환형이 없음.
		
		또 쓰면 또다른 객체를 생성하는것임.
		
		변수 선언 안한 것은 주소를 저장하지 않은것. 메모리에 공간만 생긴것.
		그런 공간을 garbage라고함. 
		*/ 
		
		ClassDemo2 ob2 = new ClassDemo2(10); //이제 정수를 매개변수로 받는 메서드 호출 가능 
		int i=0; // 변수는 초기화를 하지 않으면 에러가 남.
		System.out.println(ob1.iValue);
		//얘는 초기화 하지 않았는데도 에러나지 않음. 기본 생성자가 초기화를 해줌.
	}

}
