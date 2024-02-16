class FDemo {
	//청소차가 움직이는지 확인
	
	int count;
	
	//객체를 생성할 때마다, 어떤 정수를 넘겨주면 그 정수가 count에 들어가게됨.
	FDemo(int i){
		count = i;
	}
	
	//finalize는 이미 정해져있는 메서드라 똑같이 만들어야함. (오버라이딩)
	protected void finalize() {
		System.out.println("Garbage Collection 가동 :" + count);
	}
}

public class FinalizeTest {

	public static void main(String[] args) {
		// TODO GC finalize
		for(int i = 0 ; i < 1000000 ; i ++) {
			new FDemo(i); //주소를 저장하지 않으니 1000000개의 쓰레기가 만들어짐.
		}
		
	}

}
