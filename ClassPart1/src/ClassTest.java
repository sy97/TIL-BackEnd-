/*원칙적으로는 하나의 파일에는 하나의 클래스만 있어야하는데 지금은 편의상 하나 더 생성
이 클래스는 실제로 메모리에 만들어지는게 아님. 설계도일 뿐임. 
이걸 가지고 진짜 메모리에 공간을 만들어줘야함. -> new ClassDemo1().iValue = 10;
'.'은 접근 연산자
*/

class ClassDemo1 {
	int iValue;//인스턴스 변수, 멤버변수
	double dValue;
	
}
//클래스가 수백개 있어도 메인메서드를 가지고 있는 함수는 단 한개. 
//메인 메서드의 역할은 프로그램 시작을 하는 역할

public class ClassTest {

	public static void main(String[] args) {
		// TODO 클래스의 인스턴스 생성
		//iValue = 10; 변수는 자신이 선언된 지역에서만 쓸 수 있음./그리고 아직 만들어지지 않았음. 
		//new ClassDemo1().iValue = 10;
		/*ClassDeomo1이라는 클래스를 이용해서, 메모리에 iValue의 공간을 만들어주겠다. 라는 뜻.
		 저장은 시켰는데, 꺼내와서 사용할 수는 없음. 주소는 저장 안했으니까. 주소를 몰라서.
		
		System.out.println(new ClassDemo1().iValue);
		0이라고 나옴. 이건 또 새로운 공간을 만드는거임. 그리고 거기는 디폴트 값인 0이 있어서 0이 나오는것.
		그래서 객체를 생성할 때는 반드시 주소를 저장해야함
		*/
		
		//그래서 꼭 주소를 만들어줘야함. 주소 저장하기
		ClassDemo1 cd1 = new ClassDemo1(); 
		//지금 classdemo안에 int, double이 있기 때문에 데이터 타입은 클래스명으로 선언해줘야함.
		//기본타입(short, int 등)을 여러개 묶어서 객체타입을 만드는것. 그게 바로 class. 하나의 데이터타입을 만드는것.
		cd1.iValue = 10;//이 변수를 10으로 초기화한 주소를 저장
		System.out.println(cd1.iValue);
		
		int iValue = 100;
		/*
		 * 이 변수와 클래스에 선언된 변수의 차이는?
		 * 이 변수는 메서드 안에 선언된 변수.
		 * 그냥 변수임. 클래스 안에 선언된 변수는 ? 인스턴스 변수 또는 멤버변수
		 * 
		 * cd1과의 차이점은
		 * cd1은 메모리의 주소를 저장하고, iValue는 단순히 값을 저장
		 * cd1은 참조변수
		 * 
		 * cd1 = 1000; 이런거 안됨. 주소값만 적어야함.
		 * iValue = cd1; 이런것도 안됨. 여긴 정수값만 들어가야함.
		 */
	}

}



