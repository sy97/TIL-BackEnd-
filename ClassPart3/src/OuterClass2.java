
public class OuterClass2 {
//클래스안에 클래스 또 만들기
	private int outer;
	
	//내부 클래스가 일반 클래스일 경우
	class InnerClass{
		/*static만 없애줬는데 오류남.
		static은 클래스랑은 상관없는 메모리. 그래서 outerclass2랑은 상관없이 메모리가 만들어지는데,
		얘는 static이 없으니까 outerclass2의 진짜 가족임.
		바깥에 있는 OuterClass2가 만들어져야만 InnerClass가 만들어지는것.
		*/
		
		private int inner;
		
		void innerMethod() {
			System.out.println("inner : " + inner);
		
			outer = 200;
			System.out.println("outer : " + outer);
			//일반 클래스의 장점은 외부클래스랑 같은 메모리이기 때문에, 생성하지않아도 바로 쓸 수 있다.
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO 내부 클래스가 static일 경우
		
		//아우터클래스 먼저 만들고, 그 안에서 이너클래스 만들어줘야함.
		//OuterClass2 oc = new OuterClass2();
		//InnerClass ic = oc.new InnerClass();
		
		//더 간단히, outerclass를 사용할 일이 없다면.
		//원래는 Outerclass2. InnerClass ic = new OuterClass2().new InnerClass(); 이건데 가족이니까 생략
		InnerClass ic = new OuterClass2().new InnerClass();
		//내부클래스의 생성자 호출
		
		ic.inner =100;
		ic.innerMethod();
		
		
	}

}
