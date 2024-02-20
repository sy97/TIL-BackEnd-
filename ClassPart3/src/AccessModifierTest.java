//앞에 default가 숨겨져있음.
class Employee {
	int no;
	public String name;
	//완전 개방 
	
	private double salary;
	//완전 거부이기 때문에 어디에 써야할지 모름. 
	//그래서 우회해서 쓰는 방법(세터메서드 쓰기)
	//setter메서드
	void setsalary(double sal) {
		salary = sal; //메서드로 받는 매개변수를 this.salary에 넣어줌.
	}
	//private에 막힌 필드에 값을 지정할수 있게 해주는 메서드
	
	//getter메서드
	double getSalary() {
		return salary;
	}
	
}
//이 클래스 입장에서 Employee는 외부 클래스임
public class AccessModifierTest {

	public static void main(String[] args) {
		// TODO 접근 제어 명시자 테스트
		Employee emp = new Employee();
		emp.no = 1234;
		//이게 왜 가능할까. 외부 클래스인데.
		//접근할 수 있게 허용을 했기 때문에 가능.
		emp.name = "홍길동";
		//emp.salary = 1000000;
		//private이기 때문에 에러남.
		
		emp.setsalary(1000000);
		//이건 가능함.
	
		//System.out.println(emp.salary));접근할 수 없으니 읽어올 수도 없음.
		System.out.println(emp.getSalary());
	}

}
