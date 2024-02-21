
public class CallbyTest2 {
	void swap(int[] n) {
		int temp = n[0];
		n[0] = n[1];
		n[1] = temp;
		
	
	}

	public static void main(String[] args) {
		// TODO 반드시 참조에 의한 전달을 사용해야하는 경우
		int num1=5, num2=10;
		/*
		CallbyTest2 call = new CallbyTest2();
		call.swap(num1, num2);

		
		System.out.println("교환 후...");
		//System.out.println(num1 + "," +num2);
		내가 마무리하고싶어서 이걸 여기로 가져오면, 교환이 안됨.
		왜냐면 num1,num2는 swap에서는 교환이 됐겠지만 이쪽으로 넘어오진 않음.
		return은 값을 한개만 리턴할 수 있어서 리턴으로도 불가능.
		이럴 때 값에의한 전달이 아닌, 참조에의한 전달로 해야함.
		원하는 위치에서 처리해야하는 경우. 에는 참조에 의한 전달로.
		값이 몇개가 있느냐가 중요한게 아님.
		*/
		
		//num1과 num2는 일반 데이터타입이라 주소가 없음. 주소를 만들려면, 객체 생성해야함.
		int[] nums = {5, 10}; 
		CallbyTest2 call = new CallbyTest2();
		call.swap(nums); //주소값만 넘겨서 이 위치에서 교환할 수 있게.
		
		System.out.println("교환 후...");
		System.out.println(nums[0] + "," +nums[1]);
	}

}
