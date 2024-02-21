
public class RecursiveTest {
	
	//메서드
	int fact1(int num) {
		int result = 1;
		//곱셈할당 해줘야하니까 0이면 안됨. 그럼 0됨.
		
		for(int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
	
	int fact2(int num) {
		int result = 0;
		if(num == 1) {
			return 1;
		}
		result = fact2(num-1) * num;
		//재귀호출. 위에처럼 끝나는 조건 만들지 않으면 무한반복되고 스택메모리 계속 할당됨.
		
		return  result;
	}
	
	public static void main(String[] args) {
		// TODO 재귀함수

		RecursiveTest rt = new RecursiveTest();
		
		long start = System.nanoTime();
		System.out.println("반복문 사용 : " + rt.fact1(4));
		long end = System.nanoTime();
		System.out.println("시간 : " + (end-start)/1000000000.0 + "s");
		
		long start2 = System.nanoTime();
		System.out.println("재귀호출 사용 : " + rt.fact2(4));
		long end2 = System.nanoTime();
		System.out.println("시간 : " + (end2-start2)/1000000000.0 + "s");
	}

}
