class ClassDemo3{
	int iValue;
	double dValue;
	
	void print() {
		System.out.println(iValue + ", " +dValue);
		
	}
	
	/*아래처럼 바로 초기화 하지 않고 이렇게 하는걸 권장.
	void setValue(int i, double d) {
		//이게 변수 선언할 때 검증코드
		iValue = i;
		dValue = d;
	}
	*/
	
	ClassDemo3(int i, double d) {
		iValue = i;
		dValue = d;
		
	}
	
	//결국에는 생성자 메서드를 사용하는 것이 최적의 선택이다. 
}
public class ConsTest2 {

	public static void main(String[] args) {
		// TODO 생성자 활용 사례
		
		/*
		ClassDemo3 demo1 = new ClassDemo3();
		객체생성하고 demo1 참조변수 만들어서 주소값 저장.
	
		
		
		demo1.iValue = 10;
		demo1.dValue = 3.14;
		실무에서는 이렇게 바로 변수 초기화하는 것을 추천하지 않음.
		demo1.print();
		
		
		demo1.setValue(10, 3.14);
		//세터메서드를 이용해서 값 초기화.가급적이면 메서드를 이용해서 값을 넣자.
		
		하지만 생성자 메서드가 기본으로 초기화를 해주는데 굳이 메서드를 만들어야할까?
		*/
		
		//이제 객체만 생성해주면 생성자 메서드가 초기화를 해줌. 
		ClassDemo3 demo1 = new ClassDemo3(10, 3.14);
	}

}
