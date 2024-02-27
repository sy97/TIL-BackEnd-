class GenericDemo<T>{
//Template만들려면 이렇게
//식별자는 자기 마음이지만 보통 <T>
	
	//private int value;
	private T value;
	
	public GenericDemo(T v) {
		value = v;
	}
	
	//getter메서드
	T getValue() {
		return value;
	}
	//정해지진 않은 데이터타입으로 설정.
	
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Generic Class 만들기
	GenericDemo<Integer> demo1 = new GenericDemo<Integer>(10);
	//얘는 딱 정수용으로만 사용할 수 있게 제너릭 설정
	System.out.println(demo1.getValue());

	
	//실수값을 넣어서 처리하고싶은데, 생성자는 정수값을 받도록 되어있으니 안됨.
	//변수를 또 하나 만들든, 여튼 클래스를 수정해줘야함. 아니면 실수값 받아서 처리해줄 클래스 새로 만들어야함.
	/*
	GenericDemo demo2 = new GenericDemo(3.14);
	System.out.println(demo1.getValue());
	*/
	/*
	문자열도 마찬가지
	GenericDemo demo3 = new GenericDemo("100");
	System.out.println(demo1.getValue());
	*/
	
	/*
	이거처럼 계속 값의 타입이 달라질수도 있는것.
	그래서 template를 만들어줘야함.
	지금 클래스 생성자에 미리 매개변수 타입을 정해준건 정적바인딩인데,
	내가 넣어줄 값으로 그 매개변수 타입을 정하는게 동적바인딩. -> template
	*/
	
	//템플레이트 설정해주고나면 오류나지않음.
	GenericDemo<Double> demo2 = new GenericDemo<Double>(3.14);
	System.out.println(demo2.getValue());
	
	GenericDemo<String> demo3 = new GenericDemo<String>("100");
	System.out.println(demo3.getValue());
	
	}

}
