class ThisDemo {
	//필드
	int iValue;
	double dValue;
	//인스턴스 변수
	
	//생성자
	ThisDemo(int iValue, double dValue) {
			this.iValue = iValue;
			this.dValue = dValue;//생략되지만, 원래는 이게 정확한 표현
			
			/*
			 * 만약 iValue = iValue;
			 * 	   dValue = dValue; 로 하면 0값만나옴.
			 * 오른쪽 iValue는 지역변수인데, 왼쪽도 그냥 지역변수로 구분되기때문.
			 * 매개변수를 인스턴스 변수와 똑같이 쓰려면 반드시 앞에 this.를 써서 구분해줘야함. 
			 */
		
	} //클래스의 인스턴스 변수 만들고, 초기화 하기 위해 메서드 만듬.
	//주소를 받아주기 위해 ThisDemo(this, int i, doulbe i) 원래는 이렇게 적혀있음.
	ThisDemo() {}
	
	/*
	기본생성자는 만들지 않아도 존재함. 굳이 명시하는 이유는 내용을 수정하기 위해서.
	임의의 생성자를 만들면 기본생성자가 더이상 기능제공하지않음. 그래서 임의의 메서드 만들고나면
	기본 생성자를 내용 없더라도 만들어놓는게 좋음.
	*/
		
	//메서드
	void display() {
		System.out.println("결과 :"+ this.iValue+ ", "+ this.dValue);
		
	}//여기에도 void display(this)라고 되어있는것.

}
public class ThisTest {

	public static void main(String[] args) {
		// TODO this의 개념
		
		ThisDemo td1 = new ThisDemo(10, 10.0); //인스턴스의 주소를 저장 (ivalue, dvalue, display라는 하나의 인스턴스의 주소를 저장)
		ThisDemo td2 = new ThisDemo(20, 20.0); 	
		ThisDemo td3 = new ThisDemo(30, 30.0);
		/*
		 위에서부터 100번지, 200번지, 300번지라고 치면, 
		 어떻게 저 코드만으로 정확한 주소를 찾아가서 저장하나?
		 우리눈에 보이지 않는 무언가가 있어서 가능.
		 ThisDemo td1 = new ThisDemo(숨겨진것,10,10.0);
		 숨겨진것 = 100번지.
		 여기의 매개변수가 세개니까 메서드에 선언된 매개변수도 세개어야함. 
		 */
		
		td1.display(); // 아무것도없어보이지만 100번지라는 값이 전달되고있는것.
		td2.display();		
		td3.display();
		
		
	}

}
