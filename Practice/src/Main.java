import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//바구니 갯수
		int M = sc.nextInt();
		//역순 방법 횟수
		int N = sc.nextInt();
		
		//배열생성
		int[] arr = new int[M];
		
		//배열에 숫자넣기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		//몇번부터
		int i = sc.nextInt();
		//몇번
		int j = sc.nextInt();
		
		//역순
		for(int k = i-1; k < N; k++) {
			int temp = arr[j-1];
			arr[j-1] = arr[k];
			arr[k] = temp;
		}
		
		for(int n : arr) {
			System.out.println(n);
		}
		
	}

}
