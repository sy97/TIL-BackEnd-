class A{
	A(String s){
		System.out.println("A생성자 호출");
	}
	
	A() {
		
	}
}

class B extends A{
	B(int i){
		System.out.println("B생성자 호출");
	}
	//임의로 생성자를 명시해주면 기본생성자의 기능이 사라지기 때문에
	//b의기본생성자를 호출하는 c에서 오류가 난다.
	
	B(){
		
	}
	//그래서 기본생성자를 만들어줘야함.
	//기본생성자는 명시적으로 만들어주는게 좋다.
}

class C extends B{
	C(){
		super();
		//super();
		//우리눈에 보이지는 않지만, 이런 생성자 있음.
		//부모부터 먼저 호출.
		//반드시 첫번째줄에서 호출해야하는 이유는 부모가 먼저 생성되어야 자식이 생성되기 때문에.
		
		System.out.println("C생성자 호출");
	}
}


public class ConsCallOrder {

	public static void main(String[] args) {
		// TODO 상속관계에서의 생성자 호출 순서

	new C();
	//C생성자 불러줌.
	//A-> B / B -> A 상속관계. A,B,C 생성자 모두 만들어짐.
	//그리고 부고마 건저 생성됨.
		
	}

}
