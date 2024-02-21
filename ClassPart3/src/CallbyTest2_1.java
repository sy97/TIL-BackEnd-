
public class CallbyTest2_1 {
	int num1 = 10;
	int num2 = 5;
	
		void swap() {
			int temp = num1;
			num1 = num2;
			num2 = temp;		
		}

		
	public static void main(String[] args) {
		// TODO 반드시참조2 : 인스턴스 변수 이용
		CallbyTest2_1 call = new CallbyTest2_1();
		call.swap();
		System.out.println("교환 후...");
		System.out.println(call.num1 + "," +call.num2);
	}

}
