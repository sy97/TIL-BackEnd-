package myutil;

import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		// TODO 랜덤테스트
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			System.out.println(r.nextInt());
		}
		
		//0~9사이의 숫자 랜덤하게
		for(int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(10)); //0<= X <10
			//원래는 (10-0) + 0 이렇게 적어준거랑 똑같음.
		}
		
		
		//0~1사이의 랜덤숫자
		for(int i = 0; i < 5; i++) {
			System.out.println(Math.random());
		}
		
		//21<= X < 35 사이의 난수: (최대값-최소값) + 21
		for(int i = 0; i < 5; i++) {
			System.out.println(r.nextInt(35-21)+21);
		}
		
	}

}
