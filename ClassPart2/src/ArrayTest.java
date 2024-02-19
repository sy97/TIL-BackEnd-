
public class ArrayTest {

	public static void main(String[] args) {
		// TODO 배열의 기본
		int no = 1, kor = 70, eng = 55, mat = 87;
		
		int[] arr = new int[4];//배열의 주소를 저장: int arr[] = new int[4]
 		arr[0] = 1;
		arr[1] = 70;
		arr[2] = 55;
		arr[3] = 87;
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		int[] arr2 = {1, 70, 55, 87};
		//이렇게 변수값 저장하는 것도 가능.
		
		/*
		 * int[] arr2;
		 * arr2 = {1, 70, 55, 87} 이건안됨.
		 */
	}

}
