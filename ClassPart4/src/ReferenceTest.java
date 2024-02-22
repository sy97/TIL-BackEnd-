//부모
class First{
	int a = 10;
	
	void display() {
		System.out.println("a : " + a);
	}
	
	First() {
		
	}
}

//자식
class Second extends First{
	int b = 20;
	
	void print() {
		System.out.println("b : " + b);
	}
	
	//오버라이딩
	//새로 만들지 말고, 부모가 자식에게 물려준것을 고쳐저 써라.
	//그러니까 상속에서만 사용 가능
	
	Second() {
		
	}
}

public class ReferenceTest {

	public static void main(String[] args) {
		// TODO 부모와 자식 클래스의 참조관계
		
		First f1 = new First();
		f1.display();
		//f1은 주소값. 
		
		Second s1 = new Second();
		s1.print();

		First f2 = f1;
		f2.display();
		//First f2를 만들어서 f1의 주소값을 넘겨줌.
	
		//f2 = s1; 이건 오류남. 
		//강제 형변환을 하면 되지 않을까?
		//f2 = (First)s1; 안됨. 캐스팅은 기본타입변수에서나 가능.
		//서로 다른 클래스들끼리는 절대로 참조할 수 없다.
		
		f2 = s1;
		//자식객체의 주소를 부모객체로 
		//Second를 First의 자식으로 바꿨더니 됨.
		f2.a = 11; // Second에도 a 있음
		f2.display();// Second에도 dispaly 있음
		//f2.print() -> 자식타입을 부모타입으로 넣어주게되면, 부모 클래스에 있는것만 사용가능
		
		//f2.b = 21; 
		//f2는 s1의 주소, 즉 자식의 주소를 받았는데 왜 세컨드의 변수에 접근할 수 없을까?
		//f2.print(); 이것도 불가능.
		//f2는 자기가 물려준 a와 display에만 접근이 가능하다.
		
		//Second s2 = f1;
		//자식에게 부모의 주소 넘겨주기 -> 불가능
	
		
		//Second s2 = (Second)f1;
		//s2.b = 21;
		//s2.print();
		//문법적으로 통과는 되지만 실행에서 막혀버림.
		//결론적으론 안되는거.
		
		Second s2 = (Second)f2;
		s2.a = 12;
		s2.display();
		s2.b = 21;
		s2.print();
	
		//임시로 자식의 주소를 보관해줬다가 다시 돌려줌.
		
		
	
	}
}
