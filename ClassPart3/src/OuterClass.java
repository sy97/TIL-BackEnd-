
public class OuterClass {
//클래스안에 클래스 또 만들기
	private int outer;
	//인스턴스 변수는 특별한 일이 없으면 보호해줘야함.
	//프라이빗이라 원래는 접근이 안됨.
	//InnerClass는 같은 가족이라고 생각해서 접근가능
	
	//내부 클래스가 정적일 경우
	static class InnerClass{
		private int inner;
		
		void innerMethod() {
			System.out.println("inner : " + inner);
		
			
		OuterClass oc = new OuterClass();
		oc.outer = 20;
		System.out.println("outer : " + oc.outer);
		//그래서 이렇게 쉽게 접근 제공받을 수 있음.
		
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO 내부 클래스가 static일 경우

	//내부클래스 불러오는 것도 같음.
		InnerClass ic = new InnerClass();
		ic.inner =100;
		ic.innerMethod();
		
		
	}

}
