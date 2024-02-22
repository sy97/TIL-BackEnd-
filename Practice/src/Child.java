
public class Child extends Parent{

		// TODO 07-1 상속예제
	
		private String name;
		
		//기본생성자
		public Child() {
			//this(); 클래스 내의 다른 생성자 호출
			this("홍길동");
			System.out.println("Child() call");
		}
		
		//임의로 만들어준 생성자
		public Child(String name) {
			this.name = name;
			System.out.println("Child(string name) call");
		
	}

}
