/*
public class CallbyTest1 {
	void display(int a, int b, int c, int d, int e) {
		System.out.println(a+","+b+","+c+","+d+","+e);
	}
	
	public static void main(String[] args) {
		// TODO Call by Value 값에의한 전달
		int a =4, b=7, c=15, d=80, e=9;
		
		//main에서 출력하지 않고 display가 출력할 수 있도록
		//1.객체생성
		CallbyTest1 call =new CallbyTest1();
		
		//2.메서드 호출
		call.display(a,b,c,d,e);
		
		//하지만 전달해야 할 값이 많아지면 너무 코드가 복잡해짐.
		//값이 있는 주소만 전달하면 더 편리함. => heap이라는 데이터 임시 저장소를 이용.
		
	}

}
*/

/*

public class CallbyTest1 {
	void display(int[] arrays) {
		
		for(int a : arrays)
			System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO 참조에 대한 전달1: 배열 이용 방법
		//int a =4, b=7, c=15, d=80, e=9;
		//기본 데이터타입은 주소를 받아올 수가 없음. 그래서 heap에 저장해야함.
		
		//Heap에 저장
		int[] arr = {4, 7, 15, 90, 9};
		//arr만 스택에 저장된것. 값들은 heap에 저장.
		
		//main에서 출력하지 않고 display가 출력할 수 있도록
		//1.객체생성
		CallbyTest1 call =new CallbyTest1();
		
		//2.메서드 호출
		call.display(arr);
		}
		
		
		//하지만 전달해야 할 값이 많아지면 너무 코드가 복잡해짐.
		//값이 있는 주소만 전달하면 더 편리함. => heap이라는 데이터 임시 저장소를 이용.
		
	}

*/

/*
public class CallbyTest1 {
	int a =4, b=7, c=15, d=80, e=9; //인스턴스 변수됨.
	
	void display() { //인자를 전달할 필요도 없음.
		System.out.println(a+","+b+","+c+","+d+","+e);
	}
	
	public static void main(String[] args) {
		// TODO Call by Value 값에의한 전달2 : 인스턴스 변수를 이용하는 방법
		
		
		//main에서 출력하지 않고 display가 출력할 수 있도록
		//1.객체생성
		CallbyTest1 call =new CallbyTest1();
		
		//2.메서드 호출
		call.display();
		

		
	}

}
 */
class Data{
	int a = 4;
	double b = 3.14; 
	char c = '가';
	boolean d = true;
	String e = "홍길동";
	
	//인스턴스를 만들면 주소가 생기니까 주소를 참조할 수 있게됨.
}

public class CallbyTest1 {

	
	void display(Data data) { 
		System.out.println(data.a+","+data.b+","+data.c+","+data.d+","+data.e);
	}//data는 Data라는 클래스로 인해 생성된 것이니까 데이터 타입은 Data고, 그 주소값을 저장한 변수가 data.
	
	
	public static void main(String[] args) {
		// TODO Call by Value 값에의한 전달3 : 클래스 
		
		//클래스를 생성해서, 객체 생성하여 주소값을 받아옴.
		Data data = new Data();
		
		//main에서 출력하지 않고 display가 출력할 수 있도록
		//1.객체생성
		CallbyTest1 call =new CallbyTest1();
		
		//2.메서드 호출
		call.display(data);
		
		
		
		
	}

}