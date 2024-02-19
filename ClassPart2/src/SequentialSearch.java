import java.io.IOException;

public class SequentialSearch {

	public static void main(String[] args) throws IOException {
		// TODO 순차검색
		char data[] = {'a','b','c','d','e','f','g','h'};
		System.out.print("찾고자 하는 문자 : ");
		char search = (char)System.in.read();
		
		
		boolean result = false; 
		//처음에는 못찾았다로 설정해둠
		
		int cnt = 0; //또는 i를 여기에 선언하기.
		for(int i = 0; i < data.length; i++ ) {
			cnt++;
			//플래그기법
			if(search == data[i]) {
				result = true;
				break;
			}
			else {
				result = false;
			}
			
			
			
			/*
			if(search == data[i]) {
				System.out.println("찾은 문자 : " +data[i]);
				break;
			}
			else {
				System.out.println("못찾았다.");
			}
			
			for문안에 이렇게 넣으면 반복문이 돌고있는데
			찾았는지 못찾았는지 결론을 내리는건 옳지 않음.
			이렇게되면 찾을때까지 못찾았다 또한 내보냄
			
			*/
		}
		
		if(result == true) {
			System.out.println(cnt+"번에 찾았다.");
		}
		else {
			System.out.println("못찾았다.");
		}
		

	}

}
