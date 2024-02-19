
public class Sungjuk_v1 {

	public static void main(String[] args) {
		// TODO 1차원 배열을 이용한 첫번째 버전의 성적표
		
		int[] num = {1, 2, 3};
		int[] kor = {98, 76, 85};
		int[] eng = {90, 55, 73};
		
		int [] tot = new int[3];
		int [] avg = new int[3];
		char [] grade = new char[3];
		int [] rank =new int[3];

		//얼마가 될지 모르니 공간만 준비
		
		//총점
		for(int i = 0; i < num.length; i++) 
			tot[i] = kor[i] + eng[i];
		
		//평균
		for(int i = 0; i < num.length; i++) 
			avg[i] = tot[i] / 2;
		
		//등급
		for(int i = 0; i < num.length; i++) {	
		if(avg[i] >= 90) {
				grade[i] = 'A';
			}
		else if(avg[i] >= 80) {
				grade[i] = 'B';
			}
		else if(avg[i] >= 70) {
				grade[i] = 'C';
			}
		else if(avg[i] >= 60) {
				grade[i] = 'D';
		}
		else {
				grade[i] ='F';
		}
			
			
		}
		
		//등수구하기
		
		for(int i = 0; i < num.length; i++) {
			int cnt=1; //cnt는 내부에 써줘야 계속 1등과 비교가능
			for(int j =0; j < num.length; j++) {
				if(avg[i] < avg[j]) {
					cnt++;
				}		
			}
			rank[i] = cnt;
		}
		
		
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점\t등수");
		for(int i = 0 ; i < num.length; i++) {
			System.out.println(num[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"
					+ tot[i]+"\t"+avg[i]+"\t"+grade[i]+"\t"+rank[i]);
		}
		
		

		
		//정렬
		//정렬을 하려면.. 우선.. 한뭉탱이뭉탱이여야하나..
		//수직정렬은 어떻게하는거지..?..
		
		
	}

}
